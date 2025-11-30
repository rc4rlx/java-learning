
public class Main {
    public static void main(String[] args) {
        boolean arr[][] = { {true, false, true, true}, 
						    {false, true, false, true}, 
						    {true, true, true, false}, 
						    {false, false, true, true}  };
	
	
	// 1. 
	int result = borderTrueCount(arr);
	

	
	System.out.println("True values in the border of the grid is: " + result);
    }       

    public static int borderTrueCount(boolean[][] grid) {
        int trueCounter = 0;

        for(int i = 0; i<grid.length; i++) {
		// first row but skipped the first and last column
		    if(i == 0 || i == grid.length-1) {
			    for(int j = 0; j < grid[i].length; j++) {
				
				    if(grid[i][j]) trueCounter++;
					
			    }
				
		    }
			
		
		// first and last column
		if(i > 0 && i < grid.length-1) {
			for(int j = 0; j <grid[i].length; j++) {
				if( (j == 0 || j == grid[i].length-1) && grid[i][j]) trueCounter++;
			}
		
		}
        
	}
        return trueCounter;
    }
}
