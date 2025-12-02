
public class Main {
    public static void main(String[] args){
        int[] arr = {2, 1, 2, 3, 4};
        int result = countEvens(arr);
        System.out.println(result); // Expected output: 3
    }

    public static int countEvens(int[] nums) {
        int count = 0;
  
        for(int i = 0; i < nums.length; i++){
    
            if(nums[i] % 2 == 0) count++;
  
        }
  
        return count;
    }

}
