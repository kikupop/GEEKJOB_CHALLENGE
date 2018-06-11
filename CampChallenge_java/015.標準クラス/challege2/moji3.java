/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challege2;

/**
 *
 * @author kiku
 */
public class moji3 {
    //I をいに　Uを　うに置換
    public static void main(String[] args) {
            String sentens =  "きょUはぴIえIちぴIのくみこみかんすUのがくしゅUをしてIます";
            String sentense2 = (sentens.replace("U", "う"));
           System.out.print(sentense2.replace("I", "い"));
        
}
}

