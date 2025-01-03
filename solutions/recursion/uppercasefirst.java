public class uppercasefirst {
    public static void main(String[] args) {
        String str="grrkFor reek";
        char ch=upper(str,0);
        if(ch!='\0')
            System.out.println(ch);
        else
            System.out.println("no upper");
        
    }
    public static char upper(String str,int i)
    {
        if(i>=str.length())
            return '\0';
        if(Character.isUpperCase(str.charAt(i)))
            return str.charAt(i);
        return upper(str,i+1);
    }
}
