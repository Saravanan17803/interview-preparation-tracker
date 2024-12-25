
import java.util.Scanner;

public class goalparser {
    public String interpret(String command) {
        command=command.replace("()","o");
        command=command.replace("(al)","al");
        return command;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        goalparser solution = new goalparser();
        String output = solution.interpret(str);
        System.out.println(output);
        sc.close();
    }
    }

