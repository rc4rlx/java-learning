
public class Main {
    public static void main(String[] args) {
        boolean arr[][] = { {true, true, true, false, false}, 
                            {false, true, true, true, false}, 
                            {true, false, true, true, true}, 
                            {false, true, true, false, false}  };

        boolean result = containsTrue2x2Block(arr);

        System.out.println("Contains 2x2 block of true values: " + result);
    }

    public static boolean containsTrue2x2Block(boolean[][] grid){
        boolean twoxtwoblock = false;

        for(int i = 0; i<grid.length-1; i++){
            for(int j = 0; j<grid[i].length-1; j++){
                if(grid[i][j] && grid[i][j+1] && grid[i+1][j] && grid[i+1][j+1]){
                    twoxtwoblock = true;
                    return twoxtwoblock;
                }
            }
        }

        return twoxtwoblock;
    }
}
