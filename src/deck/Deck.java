/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deck;

import java.util.*;


/**
 *
 * @author Charlie 
 */
public class Deck {
    
    ArrayList<Card> cards;
    
    
    class Card {
        
        String value;    
    }
    
    class Hand {
        
        
        
    }
    
    //Constructor
    public Deck() {
        
        cards = new ArrayList();
        for (int i=0; i<52; i++) {
            
            Card card = new Card();
            card.value = "" + (i%13 + 1);
            cards.add(card);
            //System.out.println("Card Created");
        }
        System.out.println("Deck Created with " + cards.size() + " cards");
    }
            
    public void shuffle() {
        
        // shuffle the cards by taking random cards and stacking them
        ArrayList<Card> tempDeck = new ArrayList();
        
        for ( int i = cards.size(); i > 0; i-- ) {
            int rand = (int)(Math.random()*cards.size() );
            // System.out.println("Picking number " + rand + " card. From " + cards.size()+ " cards left.");
                       
            tempDeck.add(cards.remove(rand));
            cards.trimToSize();
        }
        
            cards=tempDeck;
            
            
        
        
    }
    
    private Card deal() {
        Card card = cards.remove(cards.size()-1);
        cards.trimToSize();
        System.out.println("Dealing " + card.value );
        return card;
    }
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        Deck newDeck = new Deck();
        
        newDeck.shuffle();
        
        for (int i = 0; i<5; i++) {
            Card thisCard =newDeck.deal();
        
            
        }
        
        
        for (Card card: newDeck.cards) {
            System.out.println(card.value);
            
        }
        System.out.println("Deck now has " + newDeck.cards.size() + " cards");
    }
    
}
