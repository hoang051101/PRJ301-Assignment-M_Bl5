/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Employee {
    private int eid;
    private String name;
    private String position;
    private String pname;
    private ArrayList<Working_day> working = new ArrayList<>();

    public Employee() {
    }

    public Employee(int eid, String name, String position, String pname) {
        this.eid = eid;
        this.name = name;
        this.position = position;
        this.pname = pname;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public ArrayList<Working_day> getWorking() {
        return working;
    }

    public void setWorking(ArrayList<Working_day> working) {
        this.working = working;
    }

   

    
    
}
