class Solution {
    
    public static void swap(int nums[], int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    public int[] sortArrayByParity(int[] nums) {
        for(int i=0; i<nums.length-1; i++){
            //check for odd no. in nums
            if(nums[i]%2 != 0){ 
                for(int j=i+1; j<nums.length; j++){
                    //check even no. after i
                    if(nums[j]%2 == 0)
                        swap(nums, i, j);
                }
            }
        }
        return nums;
    }
}