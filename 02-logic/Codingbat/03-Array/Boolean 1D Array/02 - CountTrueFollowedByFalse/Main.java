
public class Main {
    public static void main(String[] args) {

        // 2
        boolean[] valuesTwo = {true, false, true, true, false, false}; 
        int count = countTrueFollowedByFalse(valuesTwo) ;
        
        System.out.println("True Pairs: " + count);

    }

    public static int countTrueFollowedByFalse(boolean[] values){
        int counter = 0; 
        
        for(int i = 0; i<values.length-1; i++) { 
            if(values[i] && !values[i+1]) counter++; 
        } 
        
        return counter;
    }

}
