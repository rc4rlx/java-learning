
public class Main {
    public static void main(String[] args) {
        boolean arr[][] = { {true, false, true, true}, 
						{false, true, false, true}, 
						{true, true, true, false}, 
						{false, false, true, true}  };
        int result = countTruePairs(arr);
        
       System.out.println("True Pairs except last column are: " + result);                 
    }

    public static int countTruePairs(boolean[][] grid){
        int cellBothTrue = 0;
	    for(int i = 0; i<grid.length; i++) {

		    for(int j = 0; j<grid[i].length-2; j++) {
			    if(grid[i][j] && grid[i][j+1]) cellBothTrue++;
				
			}
		
	    }

        return cellBothTrue;
    }
}
