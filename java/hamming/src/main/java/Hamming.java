/**
 * Hamming distance between two strings
 */
class Hamming {

    private int count;

  /**
   * Constructor which checks whether the arguments are of proper format.
   *
   * @param leftStrand;  cannot be empty while rightStrand is not-empty
   * @param rightStrand; cannot be empty while leftStrand is not-empty
   * @throws IllegalArgumentException if the length of both strings do not match or if one of the
   *                                  string is empty.
   */
  Hamming(String leftStrand, String rightStrand) {

    if (leftStrand.isEmpty() && rightStrand.length() > 0) {
      throw new IllegalArgumentException("left strand must not be empty.");
    } else if (rightStrand.isEmpty() && leftStrand.length() > 0) {
      throw new IllegalArgumentException("right strand must not be empty.");
    } else if (leftStrand.length() != rightStrand.length()) {
      throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
    }

    for (int i = 0; i < leftStrand.length(); i++) {
      if (leftStrand.charAt(i) != rightStrand.charAt(i)) {
        count++;
      }
    }
  }

  /**
   * Method which returns hamming distance.
   *
   * @return hamming distance in integer; number of character difference between equal strings in
   * corresponding position.
   */
  int getHammingDistance() {
    return count;
  }
}
