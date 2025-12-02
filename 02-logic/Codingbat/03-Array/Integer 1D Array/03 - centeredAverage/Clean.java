
public class Clean {
    public static void main(String[] args) {
        int result = centeredAverage(new int[] {1, 2, 3, 4, 100});
        System.out.println(result); // Expected output: 3
    }

    public static int centeredAverage(int[] nums) {
        int largest = nums[0];
        int smallest = nums[0];
        int sum = 0;
  
        for(int i = 0; i < nums.length; i++){
            largest = Math.max(largest, nums[i]);
            smallest = Math.min(smallest, nums[i]);
    
            sum += nums[i];
        }
  
        sum -= largest;
        sum -= smallest;
  
  
    return sum / (nums.length-2);
    }

}
