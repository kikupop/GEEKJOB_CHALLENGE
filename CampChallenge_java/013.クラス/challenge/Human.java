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
//抽象クラス
public abstract class Human {
    //継承先で実装を強制される抽象メソッド
//① 
    //abstractな公開メソッド
     //user,dealerの合計値を計算、値を返す
    abstract protected int open();
//    void sum(){
//        public  int Sum(ArrayList){
//        int sum=0;
//        for(int i =0; i< cards.size();i++){
//        sum += ((Integer)cards.get(i).intValue();
//        }
//        return sum;
//        }                

//②
    //カードを手札にセットArrayList引数
    abstract protected void setCard(ArrayList<Integer> a);
   
   
//③
   //合計値と２１をチェック
   abstract protected boolean checkSum();
//   public static void check(){
//  
//}boolean isEqual; isEqual = true;
   //boolean Sum = true;
   //if (u.Sum == 21){
   //System.out.print("ユーザー、ブラックジャック");
   //}else if (d.Sum == u.Sum){
   //System.out.print("引き分け");
   //}else if(d.Sum < u.sum){
   //System.out.print("ユーザーの勝ち");
   //}else{
   // }System.out.print("ユーザーの負け");
   
//④     
   //自分の手札を保管、ArrayListの変数を用意
   //= myCards
    ArrayList<Integer> myCards = new ArrayList<>();
   
    
}
//modoriti arraylist
       // out.print(i)