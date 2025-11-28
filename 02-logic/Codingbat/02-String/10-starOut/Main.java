
public class Main {
    public static void main(String[] args) {
        
    }

    public static String starOutX(String str) {
  
        StringBuilder sb = new StringBuilder();
  
        for(int i = 0; i < str.length(); i++){
    
            if(str.charAt(i) == '*') continue;
    
            if(i+1 < str.length() && str.charAt(i+1) == '*') continue;
    
            if(i > 0 && str.charAt(i-1) == '*') continue;
    
            sb.append(str.charAt(i));
        }
  
        return sb.toString();
    }



    // gpt version
    public static String starOutY(String str) {
        StringBuilder sb = new StringBuilder();

            for (int i = 0; i < str.length(); i++) {

                char c = str.charAt(i);

                // Skip the star itself
                if (c == '*') continue;

                // Skip if left is star
                if (i > 0 && str.charAt(i - 1) == '*') continue;

                // Skip if right is star
                if (i + 1 < str.length() && str.charAt(i + 1) == '*') continue;

                sb.append(c);
            }
        return sb.toString();
    }

}
