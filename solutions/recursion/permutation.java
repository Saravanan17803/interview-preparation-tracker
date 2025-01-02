public class permutation {
    public static void main(String[] args) {
        String s="abc";
        permutationprint(s);
    }
    public static void permutationprint(String s){
        helpString(" ",s);    
    }
    public static void helpString(String processed,String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        for (int i = 0; i < processed.length(); i++) {
            char ch=unprocessed.charAt(0);
            String newprocessed=processed.substring(0,i)+ch+processed.substring(i);
            String newUnprocessed=unprocessed.substring(1);
            helpString(newprocessed, newUnprocessed);
        }

    }
}
