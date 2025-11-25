public class Main{
    public static void main(String[] args) {
        System.out.println(prefixAgain1("abXYabc", 1)); // true
        System.out.println(prefixAgain2("abXYabc", 1)); // true
    }

    // my code
    public static boolean prefixAgain1(String str, int n) {
  
        String word = str.substring(0, n);
        String remainingWord = str.substring(n);

        return (remainingWord.contains(word));
    }

    // chatgpt code
    public static boolean prefixAgain2(String str, int n) {
        String prefix = str.substring(0, n);
        String remaining = str.substring(n);

        return remaining.contains(prefix);
    }
}