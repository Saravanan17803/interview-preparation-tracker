import java.util.Arrays;
import java.util.List;

class count_item {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index = 0;
        if (ruleKey.equals("color")) {
            index = 1;
        } else if (ruleKey.equals("name")) {
            index = 2;
        }
        int count = 0;
        for (List<String> item : items) {
            if (item.get(index).equals(ruleValue)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        count_item solution = new count_item();
        List<List<String>> items1 = Arrays.asList(
            Arrays.asList("phone", "blue", "pixel"),
            Arrays.asList("computer", "silver", "lenovo"),
            Arrays.asList("phone", "gold", "iphone")
        );
        String ruleKey1 = "color";
        String ruleValue1 = "silver";
        System.out.println(solution.countMatches(items1, ruleKey1, ruleValue1)); 
        List<List<String>> items2 = Arrays.asList(
            Arrays.asList("phone", "blue", "pixel"),
            Arrays.asList("computer", "silver", "phone"),
            Arrays.asList("phone", "gold", "iphone")
        );
        String ruleKey2 = "type";
        String ruleValue2 = "phone";
        System.out.println(solution.countMatches(items2, ruleKey2, ruleValue2));
    }
}
