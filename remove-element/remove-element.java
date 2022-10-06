class Solution {
    public int removeElement(int[] nums, int val) {
        int ctr=0;
        
        for(int i=0; i<nums.length; i++){
            if(nums[i] != val){
                nums[ctr++]=nums[i];
            }
        }
        
        return ctr;
    }
}