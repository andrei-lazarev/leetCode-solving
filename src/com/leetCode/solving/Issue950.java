package com.leetCode.solving;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/reveal-cards-in-increasing-order">
 *   950. Reveal Cards In Increasing Order</a>
 */
public class Issue950 {
  public static void main(String[] args) {
    int[] deck  = {17,13,11,2,3,5,7};
//    int[] deck  = {1,2,3,4,5};
    System.out.println("Given an integer array deck:\n"
      + Arrays.toString(deck)
      + "\nAn ordering of the deck that would reveal the cards in increasing order:\n"
      + Arrays.toString(deckRevealedIncreasing(deck)));
  }

  public static int[] deckRevealedIncreasing(int[] deck) {
    Arrays.sort(deck);
    for (int i = 0; i < deck.length; i++) {
      if (i > 1){
        int temp = deck[deck.length - i];
        deck[deck.length - i] = deck[deck.length - 1];
        for (int j = 1; j <= i-1; j++) {
          int tempJ = deck[deck.length - i + j];
          deck[deck.length - i + j] = temp;
          temp = tempJ;
        }
      }
    }
    return deck;
  }
}
