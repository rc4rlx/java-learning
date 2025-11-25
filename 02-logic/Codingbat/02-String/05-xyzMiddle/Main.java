public class Main{
    public static void main(String[] args) {
        System.out.println(xyzMiddle1("AAxyzBB")); // true
        System.out.println(xyzMiddle2("AAxyzBB"));  // true

    }

    // my code
    public static boolean xyzMiddle1(String str) {
  
        for(int i = 0; i<str.length()-2; i++){
  
            if(str.substring(i, i+3).equals("xyz")) {
                int x = i;
                int y = str.length() - (i + 3); 
    
                if(Math.abs(x-y) <=1) return true;
            }
        }

    return false;
    }


    // chatgpt code
    public static boolean xyzMiddle2(String str) {
    for (int i = 0; i <= str.length() - 3; i++) {
        if (str.substring(i, i + 3).equals("xyz")) {

            int left  = i;
            int right = str.length() - (i + 3);

            if (Math.abs(left - right) <= 1) {
                return true;
            }
        }
    }
    return false;
}
}