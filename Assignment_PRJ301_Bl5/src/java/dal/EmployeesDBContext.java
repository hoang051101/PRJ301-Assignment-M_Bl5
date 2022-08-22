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
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class EmployeesDBContext extends DBContext {

//    public ArrayList<Employee> getEmps(Date from, Date to) {
//        ArrayList<Employee> emps = new ArrayList<>();
//        try {
//            String sql = "select e.id,e.name,wd.wid, wd.[from],wd.[to] from Employees e, Working_day wd\n"
//                    + "where e.id = wd.eid ";
//            PreparedStatement stm = connection.prepareStatement(sql);
//            stm.setTimestamp(1, DateTimeHelper.getTimeStamp(from));
//            stm.setTimestamp(2, DateTimeHelper.getTimeStamp(to));
//            ResultSet rs = stm.executeQuery();
//            Employee currentEmp = new Employee();
//            while(rs.next()){
//                int eid = rs.getInt("eid");
//                if(eid!= currentEmp.getEid()){
//                    currentEmp = new Employee();
//                    currentEmp.setEid(eid);
//                    currentEmp.setName(rs.getString("ename"));
//                    emps.add(currentEmp);
//                }
//                int tid = rs.getInt("tid");
//                if(tid!=-1)
//                {
//                    Working_day t = new Working_day();
//                    t.setWid(tid);
//                    t.setBeginW(rs.getTimestamp("beginW"));
//                    t.setEndW(rs.getTimestamp("endW"));
//                    t.setEm(currentEmp);
//                    currentEmp.getWorking().add(t);
//                }
//            }
//        } catch (Exception e) {
//        }
//        return emps;
//    }
    public List<Employee> getEmployee() {
        String sql = "Select e.id, e.name, o.position,p.pname from Employees e \n"
                + "inner join Office o on (e.oid = o.oid)\n"
                + "inner join Products p on (e.pid = p.pid)";
        ArrayList<Employee> list = new ArrayList<>();
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Product p = new Product(rs.getInt("pid"), rs.getString("pname"));
                Office o = new Office(rs.getInt("oid"), rs.getString("position"));
                Employee e = new Employee(rs.getInt("eid"),rs.getString("name"), o, p);
                list.add(e);
            }
        } catch (Exception e) {
        }
        return list;
    }
}
