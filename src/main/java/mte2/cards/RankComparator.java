// Question: Q3 (mte2, gcis124, 2255)
// Package name: cards
// File name: RankComparator.java

package mte2.cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class RankComparator implements Comparator<PlayingCard> {
    
    @Override
    public int compare(PlayingCard o1, PlayingCard o2) {
        int diff = o1.getRank().getRankNumber() - o2.getRank().getRankNumber();
        if(diff == 0) {
            diff = o1.getSuit().toString().compareTo(o2.getSuit().toString());
        }
        return diff;
    }

    public static void main(String[] args) {
        
        PlayingCard[] cardArray = {
            new PlayingCard(Suit.HEARTS, Rank.FIVE),
            new PlayingCard(Suit.SPADES, Rank.TWO),
            new PlayingCard(Suit.CLUBS, Rank.KING),
            new PlayingCard(Suit.DIAMONDS, Rank.TWO),
            new PlayingCard(Suit.CLUBS, Rank.FIVE),
            new PlayingCard(Suit.HEARTS, Rank.ACE),
            new PlayingCard(Suit.SPADES, Rank.FOUR),
            new PlayingCard(Suit.CLUBS, Rank.QUEEN)
        };     // setup
        
        List<PlayingCard> cards = new ArrayList<>();
        for(PlayingCard card : cardArray) {    cards.add(card);    }
        
        Collections.sort(cards, new RankComparator()); // invoke
        System.out.println(cards);
        
    }
}