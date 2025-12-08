

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 10, 10, 2};
        int[] result = withoutTen(nums);
        for(int num : result){
            System.out.print(num + " ");
        }
    }
    public static int[] withoutTen(int[] nums) {
  
        int[] arr = new int[nums.length];
        
        int n = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 10) continue;
            
            arr[n] = nums[i];
            n++;
        }
  
  return arr;
}

}
