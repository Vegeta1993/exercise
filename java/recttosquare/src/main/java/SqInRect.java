import java.util.ArrayList;
import java.util.List;

public class SqInRect {

  public static List<Integer> sqInRect(int lng, int wdth) {
    List<Integer> square = new ArrayList<Integer>();

    if (lng == wdth) {
      return null;
    }

    while (lng != wdth) {
      if (lng < wdth) {
        square.add(lng);
        wdth -= lng;
      } else if (lng > wdth) {
        square.add(wdth);
        lng -= wdth;
      }
    }
    square.add(lng);
    return square;
  }
}