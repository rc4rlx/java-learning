
public class Main {
    public static void main(String[] args) {
        int result = bigDiff(new int[] {10, 3, 5, 6});
        System.out.println(result); // Expected output: 7
    }

    public static int bigDiff(int[] nums) {
  
        int largest = nums[0];
        int smallest = nums[0];
 
        for(int i = 0; i<nums.length; i++){
    
            largest = Math.max(largest, nums[i]);
            smallest = Math.min(smallest, nums[i]);
  
        }
  
        return largest - smallest;

    }

}
