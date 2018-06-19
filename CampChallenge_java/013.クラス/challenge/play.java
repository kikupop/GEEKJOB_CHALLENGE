/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge;

import java.util.*;

/**
 *
 * @author kiku
 */
public class play {
    
    public static void main(String[] args){
        //インスタンス生成
        Dealer d = new Dealer();
        User u = new User();
        
        d.allcards();
        
        // ディール
        ArrayList<Integer> d_items = d.deal();
        d.setCard(d_items);
        System.out.println(d.deal());
        ArrayList<Integer> u_items = d.deal();
        u.setCard(u_items);
        System.out.println(d.deal());
        
        //hit
        ArrayList<Integer> d_hit = d.hit();
        d.setCard(d_hit);
        ArrayList<Integer> u_hit = d.hit();
        u.setCard(u_hit);
        
        //チェックメソッド
        
        boolean d_check = d.checkSum();
        
        boolean u_check = u.checkSum();
            
        
           
               
        

        //オープンメソッド
        int u_open = u.open();
        int d_open = d.open();
            System.out.println(u_open);
            System.out.println(d_open);
            
        if (u_open < 21 && d_open > 21){
            System.out.print("ユーザーの勝ち");   
        }else if (u_open > 21 && d_open < 21){
            System.out.print("ユーザーの負け");
        }else if (u_open == 21 && u_open > d_open){
            System.out.println("ユーザーの勝ち");
        }else if (u_open > d_open){
            System.out.println("ユーザーの勝ち"); 
        }else if (d_open == u_open){
            System.out.println("引き分け");
        }else {
            System.out.println("ユーザーの負け");
        }
}
}


