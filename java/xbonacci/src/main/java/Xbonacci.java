public class Xbonacci {

  public double[] tribonacci(double[] s, int n) {
    try {
      double[] tribonacci = new double[n];

      int copylength = (n < 3)? n: 3;

      System.arraycopy(s, 0, tribonacci, 0, copylength);

      for (int j = 2; j < n-1; j++) {
        double one = tribonacci[j];
        double two = tribonacci[j-1];
        double three = tribonacci[j-2];

        tribonacci[j+1] = one+two+three;
      }
      return tribonacci;
    } catch (Exception e) {
      return new double[0];
    }
  }
}