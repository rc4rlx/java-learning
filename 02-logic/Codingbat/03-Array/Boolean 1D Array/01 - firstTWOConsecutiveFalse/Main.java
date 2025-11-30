
public class Main {
    public static void main(String[] args) {

        
        // 1. 
        boolean valuesOne[] = {true, false, false, true, false}; 
        int resultOne[] = firstTwoConsecutiveFalse(valuesOne);
        
        System.out.print("Two False Consecutives are Index: ");
        for(int i : resultOne) System.out.print(i + " ");
        System.out.println();
        
    }

    public static int[] firstTwoConsecutiveFalse(boolean[] values){
        int result[] = new int[2];

        for(int i = 0; i<values.length-1; i++) {
            if(!values[i] && !values[i+1]) {
                result[0] = i; 
                result[1] = i+1; 
                return result;
            }
        }
        return new int[] {};
    }
}
