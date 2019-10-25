class LargestSeriesProductCalculator {

  private final char[] inputNumber;

  LargestSeriesProductCalculator(String inputNumber) {
    // check for exception
    for (char digit : inputNumber.toCharArray()) {
      if (Character.isAlphabetic(digit)) {
        throw new IllegalArgumentException("String to search may only contain digits.");
      }
    }
    this.inputNumber = inputNumber.toCharArray();
  }

  long calculateLargestProductForSeriesLength(int numberOfDigits) {
    // Case 1: Throw exceptions
    if (numberOfDigits < 0) {
      throw new IllegalArgumentException("Series length must be non-negative.");
    }

    if (numberOfDigits > inputNumber.length) {
      throw new IllegalArgumentException(
          "Series length must be less than or equal to the length of the string to search.");
    }

    for (char numberOrAlpha : inputNumber) {
      if (!Character.isDigit(numberOrAlpha)) {

      }
    }

    // Case 2: Return 1
    if (numberOfDigits == 0 || inputNumber.length == 0) {
      return 1;
    }

    // Case 3: Calculate the largest product of digits
    long max = 0;
    long tempAnswer = 1;

    for (int j = 0; j < inputNumber.length; j++) {
      int indexBasedOnNumOfDigits = numberOfDigits + j;

      if (indexBasedOnNumOfDigits <= inputNumber.length) {
        for (int i = j; i < indexBasedOnNumOfDigits & i < inputNumber.length; i++) {
          tempAnswer *= Integer.parseInt(String.valueOf(inputNumber[i]));
        }
        if (tempAnswer > max) {
          max = tempAnswer;
        }
        tempAnswer = 1;
      }
    }

    return max;
  }
}
