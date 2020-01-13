/*
        Name:  Tanveer Kaur
        Assignment:  [assignment name]
        Program: Computer Programmer
        Date:  [assignment due date here]
    
        Description:
        [program description in your own words]
    */

package card;

import static javax.management.Query.value;

/**
 * A simple card class
 * @author user
 */
public class Card {

    private String suit;
    private int value;

    public Card(String suit, int value) {
        this.suit = suit;
        this.value = value;
    }

    public String getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }

    public void setSuit(String suit) {
        if(suit == "Hearts") {
            this.suit = suit;
        } else {
        }
    }

    public void setValue(int value) {
        if(value > 0 && value > 9) {
             this.value = value;
        } else {
           
        }
    }
    

}




public String getSuit(){
         

}

