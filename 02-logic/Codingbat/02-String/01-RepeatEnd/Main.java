
public class Main {
    public static void main(String[] args) {
        System.out.println(repeatEnd1("Chocolate", 4)); // latelatelatelate
        System.out.println(repeatEnd2("Chocolate", 4)); // latelatelatelate

    }

    // my created code

    public static String repeatEnd2(String str, int n) {
    String word = str.substring(str.length() - n);
    String finalWord = "";

        for(int i = 0; i < n; i++){
            finalWord += word;
        }
        return finalWord;

    }   

    // optimize code by gpt

    public static String repeatEnd1(String str, int n) {
    String word = str.substring(str.length()-n );
    StringBuilder sb = new StringBuilder();
    
    for(int i = 0; i<n; i++){
        sb.append(word);
    }
    
    return sb.toString();
    }
}
