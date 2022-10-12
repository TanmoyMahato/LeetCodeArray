class Solution {
    public int dominantIndex(int[] nums) {
        
        //search for largest element
        int max = Integer.MIN_VALUE;
        int idx = 0;
        for(int i=0; i<nums.length; i++){
            if(max < nums[i]){
                max = nums[i];
                idx = i;
            }
        }
        
        //check for max is twice of all elements
        for(int i=0; i<nums.length; i++){
            if(i == idx)
                continue;
            
            else if(max < (2*nums[i]))
                return -1;
        }
        
        return idx;
    }
}