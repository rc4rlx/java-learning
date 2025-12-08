
public class Main {
    public static void main(String[] args) {
        int start = 1;
        int end = 16;
        String[] result = fizzBuzz(start, end);
        for(String str : result){
            System.out.print(str + " ");
        }

    }
    public static String[] fizzBuzz(int start, int end) {

    String[] fb = new String[end - start];

    for (int i = 0; i < fb.length; i++) {

        boolean three = start % 3 == 0;
        boolean five = start % 5 == 0;
        boolean threefive = start % 15 == 0;

        String word = "FizzBuzz";

        if (threefive) word = word.substring(0, 4);
        if (five && !threefive) word = word.substring(4);
        if (!three && !five) word = String.valueOf(start);

        fb[i] = word;

        start++;
    }

    return fb;
}

}
