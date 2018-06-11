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

class file2 {
public static void main(String[] args) throws IOException {
    try{
    
        File fp = new File("test.txt");
    
        FileReader fr = new FileReader(fp);
        try (BufferedReader br = new BufferedReader(fr)) {
            System.out.print(br.readLine());
        }

        
    } catch (FileNotFoundException ex) {
        Logger.getLogger(file2.class.getName()).log(Level.SEVERE, null, ex);
    }

}
}
