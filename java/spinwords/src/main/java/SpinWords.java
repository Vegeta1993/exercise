public class SpinWords {

  public String spinWords(String sentence) {
    String[] words = sentence.split(" ");
    String spin = "";

    for (int i = 0; i < words.length; i++) {
      if (i > 0 & i < words.length) {
        spin += " ";
      }

      if (words[i].length() < 5) {
        spin += words[i];
        continue;
      }

      spin += new StringBuilder(words[i]).reverse();
    }

    return spin;
  }
}