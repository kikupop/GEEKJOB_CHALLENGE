/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jums;

import java.sql.Timestamp;
import java.util.Date;

/**
 *
 * @author kiku
 */
public class UserDataBeans {
    private String name = "";
    private int year = 0;
    private int month = 0;
    private int day = 0;
    private String tell = "";
    private int type = 0;
    private String comment = "";
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }
    public int getMonth(){
        return month;
    }
    public void setMonth(int month){
        this.month = month;
    }
    public int getDay(){
        return day;
    }
    public void setDay(int day){
        this.day = day;
    }
    public String getTell(){
        return tell;
    }
    public void setTell(String tell){
        this.tell = tell;
    }
    public int getType(){
        return type;
    }
    public void setType(int type){
        this.type = type;
    }
    public String getComment(){
        return comment;
    }
    public void setComment(String comment){
        this.comment = comment;
    }
    
    
//            String year = request.getParameter("year")+"年";
//            String month = request.getParameter("month")+"月";
//            String day = request.getParameter("day")+"日";
//            String type = request.getParameter("type");
//            String tell = request.getParameter("tell");
//            String comment = request.getParameter("comment");
//           
//            HttpSession session = request.getSession();
//            
//            session.setAttribute("name", name);
//            session.setAttribute("year", year);
//            session.setAttribute("month",month);
//            session.setAttribute("day", day);
//            session.setAttribute("type", type);
//            session.setAttribute("tell", tell);
//            session.setAttribute("comment", comment);
}
