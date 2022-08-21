/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import Model.Employee;
import Model.Working_day;
import helper.DateTimeHelper;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class EmployeesDBContext extends DBContext {

    public ArrayList<Employee> getEmp(Date from, Date to) throws SQLException {
        ArrayList<Employee> emps = new ArrayList<>();
        try {
            String sql = "select e.id,e.name,wd.wid, wd.[from],wd.[to] from Employees e, Working_day wd\n"
                    + "where e.id = wd.eid ";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setTimestamp(1, DateTimeHelper.getTimeStamp(from));
            stm.setTimestamp(2, DateTimeHelper.getTimeStamp(to));
            ResultSet rs = stm.executeQuery();
            Employee currentEmp = new Employee();
            while(rs.next()){
                
            }
        } catch (Exception e) {
        }
        return emps;
    }
}
