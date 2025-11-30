
public class Main {
    
    public static void main(String[] args) {
        
    
    // 5. Are all False Values Grouped Together? 
    // lets find the last boolean idk this is just a guess based on what i learn in coding bat // i will use lastIndex if it has but i can't see it anyway lets look for it manually 
    
    boolean[] valuesFive = {true, false, false, false, true}; 
    boolean result = areFalseValuesGrouped(valuesFive);
        
        System.out.println("Are all \"false\" group together? " + result);


    }

    public static boolean areFalseValuesGrouped(boolean[] values){
        int lastFalse = -1; 
        
        for(int i = 0; i<values.length; i++) { 
            if(!values[i]) 
                lastFalse = i; 
            } 
            if(lastFalse == -1) { 
                return true; 
            } 
            // now lets check it 
            for(int i = 0; i < values.length-1; i++) { 
                if(i < lastFalse && !values[i] && values[i+1]) { 
                    return false; 
                } 
            } 
            
            return true;
    }
}