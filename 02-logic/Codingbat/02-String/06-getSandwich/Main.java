
public class Main {
    public static void main(String[] args) {
        System.out.println(getSandwich1("breadjambread")); // jam
        System.out.println(getSandwich2("breadjambread")); // jam

    }
    // my code
    public static String getSandwich1(String str) {
  
        if(str.length() < 10) return "";
  
    
        int first = str.indexOf("bread");
        int last = str.lastIndexOf("bread");
  
        String word = str.substring(first+5, last);
        return word;
    }

    // gpt code

    public static String getSandwich2(String str) {

    int first = str.indexOf("bread");
    int last = str.lastIndexOf("bread");

    // If there is less than 2 "bread", return empty string
    if (first == -1 || first == last) return "";

    // Everything between them
    return str.substring(first + 5, last);
}

}
