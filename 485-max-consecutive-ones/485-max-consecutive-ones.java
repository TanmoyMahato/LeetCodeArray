class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0, ctr=0;
        
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1){
                ctr++;
            }
            else if(nums[i]==0){
                if(ctr>max)
                    max=ctr;
                ctr=0;
            }
        }
        
        if(ctr>max)
            max=ctr;
        return max;
    }
}