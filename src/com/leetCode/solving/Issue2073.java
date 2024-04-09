package com.leetCode.solving;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/time-needed-to-buy-tickets">
 *   2073. Time Needed to Buy Tickets</a>
 * <a href="https://leetcode.com/problems/time-needed-to-buy-tickets/solutions/5001050/simple-solution-beat-100-0ms-runtime-without-math-min-max-functions/">
 *   Simple solution - beat 100%, 0ms Runtime - without Math.min/max functions</a>
 */
public class Issue2073 {
  public static void main(String[] args) {
    int[] tickets = {5,1,1,1};
    int k = 0;
    System.out.println("Given a 0-indexed integer array tickets:"
      + "\ntickets: " + Arrays.toString(tickets)
      + "\nThe time taken for the person at position k = "
      + k + " (0-indexed) to finish buying tickets: " + timeRequiredToBuy(tickets, k));
  }

  public static int timeRequiredToBuy(int[] tickets, int k) {
    int time = 0;
    if (k == 0 && tickets[k] == 1)
      return 1;
    for (int i = 0; i < tickets.length; i++) {
      if (tickets[i] <= tickets[k]) {
        time += tickets[i];
      } else
        time += tickets[k];
      if (i > k && tickets[i] >= tickets[k])
        time--;
    }
    return time;
  }
}
