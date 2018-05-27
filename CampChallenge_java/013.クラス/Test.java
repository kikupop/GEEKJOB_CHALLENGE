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
public class Test {
    
    public static void main(String[] args){
    
     //①インスタンス名setHuman
     setProf();
    
    
    }
    
    
    //引数なし　戻り値なし値表示
    //②インスタンス名setProf
    public  static void setProf(){
        Human setProf = new Human();
   
        setProf.setHuman("yamada", 18);
        System.out.println(setProf.name);
        System.out.println(setProf.age);
       
    }
    
}
