/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import helper.DateTimeHelper;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class Working_day {
    private int wid;
    private Employee em;
    private Date beginW;
    private Date endW;
    private Status status;
    private Date cidate;

    public Date getCidate() {
        return DateTimeHelper.removeTime(cidate);
    }
    public float getWorkingHours()
    {
        return DateTimeHelper.diffHours(beginW, endW);
    }

    public void setCidate(Date bgdate) {
        this.cidate = cidate;
    }

    public int getWid() {
        return wid;
    }

    public void setWid(int wid) {
        this.wid = wid;
    }

    public Employee getEm() {
        return em;
    }

    public void setEm(Employee em) {
        this.em = em;
    }

    public Date getBeginW() {
        return beginW;
    }

    public void setBeginW(Date beginW) {
        this.beginW = beginW;
    }

    public Date getEndW() {
        return endW;
    }

    public void setEndW(Date endW) {
        this.endW = endW;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    

   
    
}
