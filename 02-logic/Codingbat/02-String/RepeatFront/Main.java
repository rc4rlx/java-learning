
public class Main {
    public static void main(String[] args) {
        
        System.out.println(repeatFront("Chocolate", 4)); // ChocChoChC

    }
    // my code and gpt said its already optimized
    public static String repeatFront(String str, int n) {
    StringBuilder sb = new StringBuilder();
    
    for(int i = 0; i<n; i++){
        sb.append(str.substring(0, n-i));
    }
    return sb.toString();
    }

}
