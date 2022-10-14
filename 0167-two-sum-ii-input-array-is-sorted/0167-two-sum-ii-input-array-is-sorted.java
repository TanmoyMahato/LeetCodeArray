class Solution {
    public int[] twoSum(int[] num, int target) {
        
        //Arrays.sort(num);
        
        int left = 0;
        int right = num.length-1;
        int result[] = new int[2];
        
        while(left < right){
            int sum = num[left]+num[right];
            if(sum > target){
                right-- ;
            }
            else if(sum < target){
                left++ ;
            }
            else{                
                result[0] = left+1;
                result[1] = right+1;                
                break;
            }
        }
        
        return result;
    }
}