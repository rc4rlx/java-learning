
public class Main {
    public static void main(String[] args) {
        boolean arr[][] = { {true, false, true, true}, 
						    {false, true, false, true}, 
						    {true, true, true, false}, 
						    {false, false, true, true}  };

        boolean result = row2HasThreeConsecutiveTrue(arr);
    
        System.out.println("3 consecutive true in row 2 is: " + result);
        
    }

    public static boolean row2HasThreeConsecutiveTrue(boolean[][] grid){
        int consecutiveTrueCounter = 0;
	    boolean consecutiveTrueBoolean = false;
	
	    for(int i = 0; i<grid.length; i++) {
		    if(i == 2) {
			    for(int j = 0; j < grid[i].length; j++) {
				
				    if(grid[i][j]) consecutiveTrueCounter++;
				
			}
			if(consecutiveTrueCounter == 3) {
				consecutiveTrueBoolean = true;
				break;
			}
		}
	}

        return consecutiveTrueBoolean;


    }
}
