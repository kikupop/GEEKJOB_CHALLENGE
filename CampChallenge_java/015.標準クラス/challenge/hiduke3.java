/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge;
import java.util.Date;
import java.text.SimpleDateFormat;
/**
 *
 * @author kiku
 */
public class hiduke3 {
    public static void main(String[] args){
        Date d  = new Date(2016, 10, 4, 10, 0, 0);
       
        SimpleDateFormat sdf =
                new SimpleDateFormat("yyyy年MM月dd日 HH時mm分ss秒");
        System.out.print(sdf.format(d));
     
        SimpleDateFormat sdf2 =
                new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.print(sdf2.format(d));
      
    }
    
}
