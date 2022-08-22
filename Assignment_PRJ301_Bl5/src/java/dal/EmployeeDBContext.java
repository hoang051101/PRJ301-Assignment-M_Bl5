/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import Model.Employee;
import Model.Office;
import Model.Product;
import Model.Working_day;
import helper.DateTimeHelper;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class EmployeeDBContext extends DBContext {

    public ArrayList<Employee> getEmps(Date from, Date to) {
        ArrayList<Employee> emps = new ArrayList<>();

        try {
            String sql = "SELECT e.id,e.name,e.position,e.pname,ISNULL(w.wid,-1) wid,w.beginW, w.endW\n"
                    + "FROM Employees e \n"
                    + "LEFT JOIN (SELECT * FROM Working_day WHERE beginW >= ? AND beginW <= ? ) w ON e.id = w.eid";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setTimestamp(1, DateTimeHelper.getTimeStamp(from));
            stm.setTimestamp(2, DateTimeHelper.getTimeStamp(to));
            ResultSet rs = stm.executeQuery();
            Employee currentEmp = new Employee();
            
            currentEmp.setEid(-1);
            while (rs.next()) {
                int eid = rs.getInt("eid");
                if (eid != currentEmp.getEid()) {
                    currentEmp = new Employee();
                    currentEmp.setEid(eid);
                    currentEmp.setName(rs.getString("ename"));
                    currentEmp.setPosition(rs.getString("position"));
                    currentEmp.setPname(rs.getString("pname"));
                    emps.add(currentEmp);
                }
                int wid = rs.getInt("wid");
                if (wid != -1) {
                    Working_day wd = new Working_day();
                    wd.setWid(wid);
                    wd.setBeginW(rs.getTimestamp("beginW"));
                    wd.setEndW(rs.getTimestamp("endW"));
                    wd.setEm(currentEmp);
                    currentEmp.getWorking().add(wd);
                }
            }

        } catch (Exception e) {

        }
        return emps;
    }

}
