public class Vowels {

  public static int getCount(String str) {
    int vowelsCount = 0;

    for (int i = 0; i < str.length(); i++){
      switch (str.charAt(i)){
        case 'a':
        case 'u':
        case 'e':
        case 'i':
        case 'o':
          vowelsCount = ++vowelsCount;
          break;
        default:
          break;
      }
    }
    return vowelsCount;
  }

}