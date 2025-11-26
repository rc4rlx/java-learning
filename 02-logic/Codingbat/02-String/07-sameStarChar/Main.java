public class Main {
    public static void main(String[] args) {
        
    }
    public static boolean sameStarChar1(String str) {

        for(int i = 1; i<str.length()-1; i++){
    
            if(str.charAt(i) == '*' && str.charAt(i-1) != str.charAt(i+1)) return false;
    
        }

        return true;
    }

    public static boolean sameStarChar2(String str) {
        for (int i=1; i<str.length()-1; i++) {
            if (str.charAt(i) == '*') {
            if (str.charAt(i-1) != str.charAt(i+1)) return false;
            }
        }
        return true;
  
        // Solution notes: loop through the chars 1..len-2 (that is,
        // skip over the first and last chars). Each time that the char
        // is '*', check that the chars before and after it are equal. If they
        // are not, return false immediately.
    }

}
