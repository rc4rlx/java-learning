public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 0, 0, 1, 1};
        int[] result = evenOdd(nums);
        for(int num : result){
            System.out.print(num + " ");
        }
    }

    public static int[] evenOdd(int[] nums) {
  
        for(int i = 0; i < nums.length; i++){
            
            for(int j = 1 + i; j<nums.length; j++){
            
                int n = 0;
                int a = nums[n+i] % 2;
                int b = nums[j] % 2;
                int c = 0;
                
                if(a == 1 && b == 0 && a > b){
                c = nums[i];
                nums[i] = nums[j];
                nums[j] = c;
                }
                n++;
            }
        }
        
        return nums;
    }

}
