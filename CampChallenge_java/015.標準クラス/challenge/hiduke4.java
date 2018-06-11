/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge;
//import java.text.ParseException;
import java.util.Date;
//import java.text.SimpleDateFormat;
import java.util.Calendar;
/**
 *
 * @author kiku
 */
public class hiduke4 {
    public static void main(String[] args){
//        SimpleDateFormat sdf = 
//                new SimpleDateFormat("yyyy年MM月dd日 HH時mm分ss秒");
        
        Calendar cal1 = Calendar.getInstance();
        cal1.set(2015, 0, 1, 0, 0, 0);
        Date datePast = cal1.getTime();

        Calendar cal2 = Calendar.getInstance();
        cal2.set(2015, 11, 31, 23, 59, 59);
        Date dateNow = cal2.getTime();
        
        long dateTimePast = datePast.getTime();
        long dateTimeNow = dateNow.getTime();
        long diff = dateTimeNow - dateTimePast;
        //日数diff * 一日86400
        //System.out.print(String.valueOf(diff * (60 * 60 * 24)));
        System.out.print(diff);
       // int result = diffTime(dateFrom, dateTo);
       // System.out.println(result);
        
       // public static int difftTime(Date dateFrom, Date dateTo){
//            long dateTimeFrom = dateFrom.getTime();
//            long dateTimeTo = dateTo.getTime();
        
           //public static  long dayDiff = (ca12 - ca11);
           // return dayDiff;
//        try{
//            dateFrom = sdf.parse("2015/0/1/ 0:0:0");
//            dateTo = sdf.parse("2015/11/31/ 23:59:59");
//        }catch (ParseException e){
//    e.printStackTrace();
//    
//    long dateTimeTo = dateTo.getTime();
//    long dateTimeFrom = dateFrom.getTime();
//    
//    long dayDiff = (dateTimeTo - dateTimeFrom);
//
//    System.out.println("from" + sdf.format(dateFrom));
//    System.out.println("to" + sdf.format(dateTo));
//    System.out.println("差" + dayDiff);
    }
}

