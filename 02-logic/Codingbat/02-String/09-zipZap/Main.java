public class Main {
    public static void main(String[] args) {
        System.out.println(zipZapX("zipXzap")); //zpXzp
        System.out.println(zipZapY("zopzop")); //zpzp

    }
    // my code
    public static String zipZapX(String str) {
    StringBuilder sb = new StringBuilder();
  
  
    for(int i = 0; i < str.length(); i++){
    
        if(i + 2 < str.length() && str.charAt(i) == 'z' && str.charAt(i + 2) == 'p'){
      
            sb.append("" + str.charAt(i) + str.charAt(i+2));
            i+=2;
            continue;
        }
    
        sb.append("" + str.charAt(i));
    }
  
        return sb.toString();

    }
    // gpt shorter version
    public static String zipZapY(String str) {
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < str.length(); i++) {

        // Check pattern z?p
        if (i + 2 < str.length() && str.charAt(i) == 'z' && str.charAt(i+2) == 'p') {
            sb.append('z').append('p');
            i += 2; // Skip the middle character
        } else {
            sb.append(str.charAt(i));
        }
    }

    return sb.toString();
}


}
