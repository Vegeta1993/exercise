package com.codewars;

/*public static int solveSuperMarketQueue(int[] customers, int n) {
    int[] result = new int[n];
    for(int i = 0; i < customers.length; i++){
    result[0] += customers[i];
    Arrays.sort(result);
    }
    return result[n-1];
    }*/
public class Supermarket {

  public static int solveSuperMarketQueue(int[] customers, int n) {
    int[] tills = new int[n];

    int totalTime = 0;

    // case 1: when zero customers

    if (customers.length == 0) {
      return totalTime;
    }

    // if N > number of customers
    if (n > customers.length) {
      for (int time : customers) {
        if (totalTime < time) {
          totalTime = time;
        }
      }
      return totalTime;
    }
    // initialize tills
    System.arraycopy(customers, 0, tills, 0, n);

    // start billing

    // loop to count 1 and reduce the time by 1
    // check if zero and add the next customer to the empty till
    // break if the customers are empty

    int next = n;

    for (; ; ) {
      for (int i = 0; i < n; i++) {
        --tills[i];
      }
      totalTime++;

      for (int i = 0; i < n; i++) {
        if (tills[i] == 0 && next < customers.length) {
          tills[i] = customers[next];
          next++;
        } else if (next >= customers.length) {
          int max = 0;
          for (int time : tills) {
            if (time > max) {
              max = time;
            }
          }
          return totalTime + max;
        }
      }
    }
  }
}

