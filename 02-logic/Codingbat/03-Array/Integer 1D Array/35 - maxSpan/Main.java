public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 1, 3};
        int result = maxSpan(nums);
        System.out.print(result);
    }

    public static int maxSpan(int[] nums) {
  
        int span = 0;
        
        for(int i = 0; i<nums.length; i++){

            int x = nums.length- 1;
            while(true){

                if(nums[i] != nums[x]){
                    x--;
                    continue;
                }
                
                int count = x + 1 - i;
                if(count > span) span = count;

            break;
            }
        }
        return span;
    }
}
