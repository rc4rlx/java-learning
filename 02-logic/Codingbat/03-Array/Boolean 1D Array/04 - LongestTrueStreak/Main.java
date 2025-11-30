
public class Main {
    public static void main(String[] args) {
        // 4. find the longest streak of true values 
        boolean[] valuesFour = {true, true, false, true, true, true, false}; 

        int maxStreak = longestTrueStreak(valuesFour);
        
        System.out.println("Longest Streak is: " + maxStreak);
    }

    public static int longestTrueStreak(boolean[] values){
        int streakCounter = 0; 
        int maxStreak = 0; 
        
        for(int i = 0; i<values.length; i++) { 
            if(!values[i]) { 
                streakCounter = 0; 
                continue; 
            } 
            
            if(values[i]) { 
                streakCounter++; 
                if(streakCounter > maxStreak) 
                    maxStreak = streakCounter; 
                continue; 
            } 
        }     
        return maxStreak;   
    }
}
