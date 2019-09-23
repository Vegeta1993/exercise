/**
 * RaindropConverter returns string based on the factors of the input
 *
 * @author vintux
 */
class RaindropConverter {

  /**
   * @param number to convert to raindrop string
   * @return string of either Pling, Plong, Plang if the number has 3,5 or 7 factors. else returns
   * number
   */
  String convert(int number) {
    String raindrop = "";

    if (number % 3 == 0) {
      raindrop += "Pling";
    }
    if (number % 5 == 0) {
      raindrop += "Plang";
    }
    if (number % 7 == 0) {
      raindrop += "Plong";
    }

    return raindrop.isEmpty() ? String.valueOf(number) : raindrop;
  }
}
