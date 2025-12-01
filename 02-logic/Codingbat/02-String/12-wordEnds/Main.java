
public class Main {
    public static void main(String[] args) {
        String result = wordEnds("abcXY123XYijk", "XY");
        System.out.println(result); // Expected output: "c13i"
    }
    // my code
    public static String wordEnds(String str, String word) {
        StringBuilder sb = new StringBuilder();
  
        for(int i = 0; i<str.length(); i++) {
    

            if(i > 0 && str.charAt(i) == word.charAt(0) ) {
                sb.append(str.charAt(i-1));
            }
            if(i + 1 < str.length() && str.charAt(i) == word.charAt(word.length()-1) ){
                sb.append(str.charAt(i+1));
            }
    
        }
  
    return sb.toString();
    }

}
