/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge3;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author kiku
 */
class file1 {
    public static void main(String[] args){
       
        try {
            
             //ファイルオープン
            File fp = new File("test.txt");
            //
            FileWriter fw;
            fw = new FileWriter(fp);
            
             fw.write("私は●●です");
             fw.write("私は●●出身です");
        fw.close();
            
        } catch (IOException ex) {
            Logger.getLogger(file1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
    }
}
