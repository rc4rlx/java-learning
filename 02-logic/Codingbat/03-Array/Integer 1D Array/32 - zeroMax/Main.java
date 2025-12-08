

public class Main {
    public static void main(String[] args) {
        int[] nums = {0, 5, 0, 3};
        int[] result = zeroMax(nums);
        for(int num : result){
            System.out.print(num + " ");
        }
    }
    public static int[] zeroMax(int[] nums) {
  
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                
                int bigOdd = 0;
                
                for(int j = (1+i); j<nums.length; j++){
                    int odd = nums[j] % 2;
                    
                if(odd > 0) bigOdd = Math.max(bigOdd, nums[j]);
                    
                }
                nums[i] = bigOdd;
            }
        }

  
    return nums;
    }

}
