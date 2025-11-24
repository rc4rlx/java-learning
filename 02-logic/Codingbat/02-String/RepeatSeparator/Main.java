
public class Main {
    public static void main(String[] args) {
        
        System.out.println(repeatSeparator1("Word", "X", 4)); //WordXWordXWordXWord
        System.out.println(repeatSeparator2("Word", "X", 4)); //WordXWordXWordXWord
    }

    // my code
    public static String repeatSeparator1(String word, String sep, int count) {
        StringBuilder sb = new StringBuilder();
        
        
        for(int i = 0; i<count; i++){
            if(i == 0){
            sb.append(word);
            continue;
            }
            sb.append(sep + word);
        }
        return sb.toString();
    }

    // optimized code by gpt
    public static String repeatSeparator2(String word, String sep, int count) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < count; i++) {
            if (i > 0) sb.append(sep);
            sb.append(word);
        }
        
        return sb.toString();
    }


}
