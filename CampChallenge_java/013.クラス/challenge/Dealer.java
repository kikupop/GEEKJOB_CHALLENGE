/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge;
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author kiku
 */

//Humanから継承 コンストラクタ
public class Dealer extends Human {
     //cardsというArrayListの変数を用意し、初期処理でこのcardsに全てのトランプを持たせる。
    ArrayList <Integer> Cards = new ArrayList <>();
    
    public Dealer(){
       for(int n = 1; n<=4; n++){
            for(int i = 1; i<=13;i++){
                if(i > 10){
                   Cards.add(10);
                }
                else if(i < 10){
                    Cards.add(i);
                }
            }
        }
    }
    
    //cardsに52枚 allcardsクラス名
    public void allcards(){
    //String[] card = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10","J", "Q", "K"};
    //13枚のカード*4パターン
    
        for(int n = 1; n<=4; n++){
            
            for(int i = 1; i<=13;i++){
                if(i > 10){
//                    i = 10; 変数iが10より大きい場合10に固定
                   Cards.add(10);
                }
                else if(i < 10){
//                    i = i;  //変数iが10より小さい場合そのまま
                    Cards.add(i);
                }
//                Cards.add(i);  //10以上の数がループしないようにプラス
            }
        }
    }
    
    
    //dealという公開メソッドを用意し、cardsからランダムで2枚のカードをArrayListにして返却。
    public ArrayList<Integer> deal(){
          
            ArrayList<Integer> data1 = new ArrayList<>();
            Random rand = new Random();
            Integer index = rand.nextInt(Cards.size());

        for(int j = 1; j <3; j++){
            data1.add(Cards.get(index));
            //  手札分を山札から削除  index:arrayListの要素番号
            Cards.remove(index);
        }
            return data1; 
    }
 
    //hitという公開メソッドを用意し、cardsからランダムで1枚のカードをArrayListにして返却。
    public ArrayList<Integer> hit(){
        Random rand = new Random();
        Integer index = rand.nextInt(Cards.size());
        ArrayList<Integer> data2 = new ArrayList<>();
        data2.add(Cards.get(index));
        Cards.remove(index);
        return data2;
    }

    public void setCard(ArrayList<Integer> a){
        for(int i = 0; i < a.size(); i++){
            myCards.add(a.get(i));
        }
    }
    
    //myCardsを確認し、まだカードが必要ならtrue、必要無ければfalseを返却
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
            
            
    //myCardsのカードの合計値を返却する
    public int open(){
        int sum=0;
        //手札を足す
        for(int i =0; i< myCards.size();i++){
        sum += myCards.get(i);
        }
            return sum;
    }  
    






}


