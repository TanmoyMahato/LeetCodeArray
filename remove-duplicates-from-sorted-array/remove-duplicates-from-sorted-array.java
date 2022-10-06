class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        //while(i<nums.length-1){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]!=nums[j]){
                    nums[++i]=nums[j];
                }
            }
        //}
        
        return i+1;
    }
}