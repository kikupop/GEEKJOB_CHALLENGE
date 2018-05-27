/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge;

/**
 *
 * @author kiku
 */

//親クラスHumanを継承
public class Human2{
    
  
    public static void main(String[] args){
        Test2 A = new Test2();
        Test2 B = new Test2();
        A.setHuman("tanaka", 10);
        B.setHuman("saito", 16);
         System.out.println(A.name);
         System.out.println(A.age);
        System.out.println(B.age);
        System.out.println(B.name);
        
        A.test2();
        B.test2();
        
         System.out.println(A.name);
         System.out.println(A.age);
        System.out.println(B.age);
        System.out.println(B.name);
    }
    //メソッドを追加　引数なし　戻り値なし　処理「フィールドの値をクリアする」
    // intを 0　Stringを　null。
   
}


