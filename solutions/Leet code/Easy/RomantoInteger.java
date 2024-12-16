import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class RomantoInteger {
    public int romantoint(String s)
    {
        Map<Character,Integer>romanMap=new HashMap<>();
        romanMap.put('I',1);
        romanMap.put('V',5);
        romanMap.put('X',10);
        romanMap.put('L',50);
        romanMap.put('C',100);
        romanMap.put('D',500);
        romanMap.put('M',1000);
        int result=0;
        int n=s.length();
        for (int i = 0; i < n; i++) {
            int current = romanMap.get(s.charAt(i));
            if (i < n - 1 && current < romanMap.get(s.charAt(i + 1))) {
                result -= current; 
            } else {
                result += current;
            }
        }
        return result;
    

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a Roman numeral: ");
        String input = sc.nextLine().toUpperCase(); 
        RomantoInteger r = new RomantoInteger();
        int result = r.romantoint(input);
        System.out.println("The integer value of " + input + " is: " + result);
        sc.close();
    }
}
    

