import java.util.*;
class divisible {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if((a%3)==0 &&(a%5==0))
        System.out.println("divisible by 3 and 5");
        else if((a%3)==0)
        {
            System.out.println("divisible by 3");
        }
        else if((a%5)==0)
        {
            System.out.println("divisible by 5");
        }
    }
}