import static java.lang.Character.getNumericValue;
import java.util.Optional;
import java.util.stream.IntStream;

class LuhnValidator {

    boolean isValid(String candidate) {

        // replace spaces and reverse the string
        candidate = candidate.replaceAll(" ", "");
        candidate = new StringBuilder(candidate).reverse().toString();

        // Case 1: string length less than 2
        if (candidate.length() < 2) {
            return false;
        }

        char[] candidateChar = candidate.toCharArray();

        // perform logic on the characters and reduce to sum
        Optional<Integer> reduce = IntStream.range(0, candidateChar.length)
            .mapToObj(i -> ((i % 2) != 0) ? (((getNumericValue(candidateChar[i])) * 2 > 9)
                ? getNumericValue(candidateChar[i]) * 2 - 9 : getNumericValue(candidateChar[i]) * 2)
                : getNumericValue(candidateChar[i]))
            .reduce(Integer::sum);

        return reduce.get() % 10 == 0;

    }
}
