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
     private Office office;
    private Product product;
   

    public Employee(int eid, String name, Office office, Product product) {
        this.eid = eid;
        this.name = name;
        this.office = office;
        this.product = product;
    }

    public Employee() {
    }

    public Office getOffice() {
        return office;
    }

    public void setOffice(Office office) {
        this.office = office;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    private ArrayList<Working_day> working = new ArrayList<>();

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

    public ArrayList<Working_day> getWorking() {
        return working;
    }

    public void setWorking(ArrayList<Working_day> working) {
        this.working = working;
    }
    
}
