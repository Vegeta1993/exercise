import java.util.HashSet;
import java.util.Set;

class IsogramChecker {

    boolean isIsogram(String phrase) {
        Set<String> distinct = new HashSet<String>();
        phrase = phrase.replaceAll(" |-", "");

        for (int i = 0; i < phrase.length(); i++) {
            distinct.add(String.valueOf(phrase.toLowerCase().charAt(i)));
        }

        return (distinct.size() == phrase.length()) ? true : false;
    }
}
