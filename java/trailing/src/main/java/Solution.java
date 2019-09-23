public class Solution {
  public static int zeros(int n) {
    int zeroes = 0;
    if (n < 5) {
      zeroes = Math.floorDiv(n, 2);
    } else {
      for (int max = 5; n / max > 0; max *= 5) {
        zeroes += Math.floorDiv(n, max);
      }
    }

    return zeroes;
  }
}