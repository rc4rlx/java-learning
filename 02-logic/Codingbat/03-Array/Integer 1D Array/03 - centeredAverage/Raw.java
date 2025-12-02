
public class Raw {
    public static void main(String[] args) {
        int result = centeredAverage(new int[] {1, 2, 3, 4, 100});
        System.out.println(result); // Expected output: 3
    }
    public static int centeredAverage(int[] nums) {
        int largest = nums[0];
        int smallest = nums[0];
  
        for(int i = 0; i < nums.length; i++){
            largest = Math.max(largest, nums[i]);
            smallest = Math.min(smallest, nums[i]);
        }
  
        int count = 0;
        int average = 0;
  
        int j = 0;
        int k = 0;
  
        outerLoop:
        for(int i = 0; i < nums.length; i++){
    
            if(nums[i] == largest && j < 1){
                j++;
                continue outerLoop;
            }
    
            if(nums[i] == smallest && k < 1){
                k++;
                continue outerLoop;
            }
    
            count++;
            average = average + nums[i];
  }
  
        int finalAverage = average / count;
  
        return finalAverage;
    }
}
