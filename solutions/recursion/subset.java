import java.util.*;

public class subset {
    public static void main(String[] args) {
        String s = "123";
        List<String> result = subsetprint(s);
        System.out.println(result);
    }

    public static List<String> subsetprint(String s) {
        List<String> result = new ArrayList<>();
        helpString("", s, result);
        return result;
    }

    public static void helpString(String processed, String unprocessed, List<String> result) {
        if (unprocessed.isEmpty()) {
            result.add(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        helpString(processed + ch, unprocessed.substring(1), result);  // Include character
        helpString(processed, unprocessed.substring(1), result);        // Exclude character
    }
}
