/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardtrickice1;

/** define card value and suits
 * 
 *
 * @author sivagamasrinivasan
 */
public class Card 
{
    private int value;
    private String suits; //encapsulation
    //constant
    public Card(){
    
    }
    public  final String [] SUITS = { "diamonds","clubs","spades","hearts"};

    /**
     * @return the value
     */
    public String getSuit(){
        return suits;
    }
    
    public void setSuit(String suit) {
        this.suits = suit;
    }
    
    public int getValue() {
        return value;
    }

     public void setValue(int value) {
         this.value = value;
     }
     
     public String ToString(){
         return getValue()+""+getSuit();
     }
}