/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Date;
import java.text.SimpleDateFormat;
/**
 *
 * @author kiku
 */
public class file3 {
    public static void main(String[] args){
       
        try {
            
             //ファイルオープン
            File fp = new File("test2.txt");
            //
            FileWriter fw;
            fw = new FileWriter(fp);
        //開始時刻
        Date start = new Date();
        SimpleDateFormat sdf =
                new SimpleDateFormat("yyyy-MM-dd HH時");
        fw.write(sdf.format(start));
        
        
            //文字列の置き換え
            String word = "今日は晴れです。";
             fw.write(word.replace("晴れ", "雨"));
             
             
        //終了時刻
        Date end = new Date();
        fw.write(sdf.format(end));
        fw.close();
            
        } catch (IOException ex) {
            Logger.getLogger(file1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
    }
}
