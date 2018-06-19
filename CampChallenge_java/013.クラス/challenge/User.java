/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge;

import java.util.ArrayList;

/**
 *
 * @author kiku
 */
public class User extends Human {
    
     public void setCard(ArrayList<Integer> a){
        for(int i = 0; i < a.size(); i++){
            myCards.add(a.get(i));
        }
    }
    public int open(){
        int sum=0;
        for(int i =0; i< myCards.size();i++){
        sum += myCards.get(i);
        }
            return sum;
    }  
    public boolean checkSum(){
       //sumはArrayList
       //メソッドからsumを呼び出し要素を確認
       //open();
       int sum=0;
        for(int i =0; i< myCards.size();i++){
        sum += myCards.get(i);
        }
        if(sum <= 21){
                return false;
        }
        else{
                return true;
        }
    }
    
    
}
