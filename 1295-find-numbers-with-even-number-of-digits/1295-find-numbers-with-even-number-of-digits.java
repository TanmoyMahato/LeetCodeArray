class Solution {
    public int findNumbers(int[] nums) {
        int even=0;
        //traverse nums
        for(int i=0; i<nums.length; i++){
            
            //count no. of digits
            int rem, digits=0, n=nums[i];
            while(n!=0){
                //rem = n%10;
                digits++;
                n /= 10;
            }
            
            if(digits%2 == 0)
                even++;
        }
        
        return even;
    }
}