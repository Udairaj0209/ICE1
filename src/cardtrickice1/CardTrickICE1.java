/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardtrickice1;
import java.util.*;

/** step1 : generate 7 random cards and store in array - how
 * step 2: take any card input from user suit,number
 * step 3: user card is in  the array 'card is found
 *
 * @author sivagamasrinivasan,May 23rd
 */
public class CardTrickICE1 {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
        String Suits;
        int val;
        boolean Result = false;
        
        
    
            
            Scanner sc = new Scanner(System.in);
            
            
             
             int a;
             String str="";
            
        Card[] magicHand = new Card[7]; //Array of object
        for( int i=0;i<magicHand.length;i++)
        {
       
            Card c1 = new Card();
            a = (int)((Math.random()*12)+1);
            str = c1.SUITS[new Random().nextInt(4)]; 
            c1.setValue(a);//use a method to generate random *13
            c1.setSuit(str);//random method suit
            magicHand[i]=c1;
            System.out.println(a + " of "+ str);
        }
        //step 2:take input 
        Card c1 = new Card();
        System.out.println("Please choose the suit: ");
        
        System.out.println(Arrays.toString(c1.SUITS));
        Suits = sc.next();
        c1.setSuit(Suits);
        
        System.out.println("Enter the value of card from 1 to 13:");
        val = sc.nextInt();
        c1.setValue(val);
        
        for(int i=0; i<magicHand.length;i++){
        
            if(val == magicHand[i].getValue() && Suits.equals(magicHand[i].getSuit())){
                Result = true;
                break;
            }
        }
        if(Result == true){
            System.out.println("Match found");
        }
        else {
            System.out.println("Sorry match not found!!");
        }
    
}
}
