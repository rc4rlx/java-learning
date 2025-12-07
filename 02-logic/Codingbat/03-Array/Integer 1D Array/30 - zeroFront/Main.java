public class Main{

    public static void main(String[] args) {
     int[] nums = {1, 0, 0, 1};
     int[] result = zeroFront(nums);
        for(int num : result){
            System.out.print(num + " ");
        }   
    }

    public static int[] zeroFront(int[] nums) {
        while(true){
            for(int i = 0; i<nums.length-1; i++){
            
                if(nums[i] == nums[i+1]) continue;
                if(Math.abs(nums[i]) > Math.abs(nums[i+1]) ){
                    int num = nums[i+1];
                    nums[i+1] = nums[i];
                
                    nums[i] = num;
                }
            }
            
            int zero = 0;
            boolean flag = true;
            
            for(int i = 0; i < nums.length-1; i++){
            
                if(flag && Math.abs(nums[i]) > zero && Math.abs(nums[i+1]) == zero){
                    flag = false;
                    break;
                }
                }
            if(flag) return nums;
            }
    }
}