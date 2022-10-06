class Solution {
    public void moveZeroes(int[] nums) {
        int ctr=0;
        
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0){
                nums[ctr++]=nums[i];
            }
        }
        
        while(ctr<nums.length){
            nums[ctr++]=0;
        }
    }
}