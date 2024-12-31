public class subset {
    public static void main(String[] args) {
        String s="abc";
        subsetprint(s);
    }
    public static void subsetprint(String s){
        helpString(" ",s);    
    }
    public static void helpString(String processed,String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch=unprocessed.charAt(0);
        helpString(processed + ch, unprocessed.substring(1));
        helpString(processed, unprocessed.substring(1));

    }
}
