import java.util.ArrayList;
import java.util.LinkedList;


public class Main {
    public static void main(String[] args) {
        boolean arr[][] = { {true, false, true, true}, 
                            {false, true, false, true}, 
                            {true, true, true, false}, 
                            {false, false, true, true}  };

        findFalseWithTrueVerticalNeighbors(arr);
    }
    public static void findFalseWithTrueVerticalNeighbors(boolean[][] grid){
        ArrayList<LinkedList <Integer>> pairList = new ArrayList<>();

        for(int i = 0; i<grid.length; i++) {
		    if (i > 0 && i < grid.length-1) {
		        for(int j = 0; j <grid[i].length; j++) {
			        if(!grid[i][j] && grid[i-1][j] && grid[i+1][j]) {
				
				        LinkedList<Integer> rowandcolumn = new LinkedList<>();
				
				        rowandcolumn.add(i);
				        rowandcolumn.add(j);
				
				        pairList.add(rowandcolumn);
			        }
		        }
		    }
    	}

        printRowandColumnPairs(pairList);
    }

    public static void printRowandColumnPairs(ArrayList<LinkedList <Integer>> pairList){
        System.out.println("Row and Column matches are: ");
	
	    for(LinkedList<Integer> pair : pairList) {
		    System.out.println("Row: " + pair.get(0) + 
                                " Column: " + pair.get(1));
	    }
    }
}