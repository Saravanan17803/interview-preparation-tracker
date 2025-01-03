public class productoftwonumber {
    public static int twoproduct(int x ,int y){
            if (x < y) 
                return twoproduct(y, x); 
          
            else if (y != 0) 
                return (x + twoproduct(x, y - 1)); 
            else
                return 0; 
        
    }
    public static void main(String[] args) {
        int a=100,b=100;
        System.out.println(twoproduct(a,b));
    }
    
}
