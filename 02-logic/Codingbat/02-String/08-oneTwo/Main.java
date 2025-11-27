
public class Main {
    public static void main(String[] args) {
        System.out.println(oneTwo1("abcde")); //bca
        System.out.println(oneTwo2("abcdef")); //bcaefd
    }
    // my code
    public static String oneTwo1(String str) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<str.length()-2; i+=3){
        
            sb.append(str.charAt(i+1));
            sb.append(str.charAt(i+2));
            sb.append(str.charAt(i));

        }
    
        return sb.toString();
    }

    // gpt shorter version
    public static String oneTwo2(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= str.length() - 3; i += 3){
            sb.append(str.substring(i+1, i+3)).append(str.charAt(i));
        }
        return sb.toString();
    }
}
