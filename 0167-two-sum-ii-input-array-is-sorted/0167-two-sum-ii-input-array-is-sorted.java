/* 1st Approach: Using Two Pointer */
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



/* 2nd Approach: Using Binary Search */
class Solution {
    
    public int binarySearch(int[] numarr, int found, int idx){
        
        int start = 0;
        int end = numarr.length-1;
        
        while(start<=end){
            int mid = start + (end-start)/2;
            if(numarr[mid]==found && mid!=idx)
                return mid;            
            else if(numarr[mid]<=found)
                start = mid+1;
            else
                end = mid-1;
        }
        
        return -1;
    }
    
    
    
    public int[] twoSum(int[] num, int target) {
        
        //Arrays.sort(num);
        
        int idx2 = -1;
        int result[] = new int[2];
        
        for(int idx1=0; idx1<num.length; idx1++){
            
            int find = target - num[idx1];
            
            idx2 = binarySearch(num,find,idx1);
            
            if(idx2 > -1){
                result[0] = idx1+1;
                result[1] = idx2+1;
                break;
            }            
        }
        
        return result;
    }
}
