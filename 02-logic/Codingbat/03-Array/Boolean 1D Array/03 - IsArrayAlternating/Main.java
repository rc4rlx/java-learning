
public class Main {
    public static void main(String[] args) {
        
        // 3

        boolean[] valuesThree = {true, false, true, false, true};
        boolean value = isArrayAlternating(valuesThree);

        System.out.println("Is Alternating? " + value);
        
    }
    
    public static boolean isArrayAlternating(boolean[] values){
        for(int i = 0; i<values.length-1; i++) {
            if( (values[i] && values[i+1]) ||
            (!values[i] && !values[i+1]) ) {
                 return false; 
                } 
            } 
        return true;
    }
}
