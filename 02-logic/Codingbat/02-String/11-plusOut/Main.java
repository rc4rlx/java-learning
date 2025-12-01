
public class Main {
    public static void main(String[] args) {
        String result = plusOut("12xy34xyabcxy", "xy");
        System.out.println(result); // Expected output: "++xy++xy+++xy"
    }
    // my code
    public static String plusOut(String str, String word) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < str.length(); ){
  
            if((i + word.length() <= str.length() && str.substring(i, i+word.length()).equals(word))){
                sb.append(word);
                i+=word.length();
                continue;
      
            }
        sb.append("+");
        i++;
        }
  
        return sb.toString();
    }

}
