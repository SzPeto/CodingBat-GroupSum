
public class Main {

	public static void main(String [] args) {
		
		int[] nums = {2, 4, 6};
		System.out.println(groupSum(0, nums, 10));
 		
	}
	
    public static boolean groupSum(int start, int[] nums, int target) {
        
    	// Base case: if we've reached the end of the list
    	if(target == 0) return true;
    	if(target < 0) return false;
        if(start >= nums.length) return false;
        
        int result = target - nums[start];
        if(groupSum(start + 1, nums, result)) return true;
        if(groupSum(start + 1, nums, target)) return true;
        return false;
        
    }

	
}
