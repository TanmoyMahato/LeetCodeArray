class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        int z;
        for(int i = 0; i < arr.length; i++) {
            z = BinarySearch(arr, arr[i]);
            if (z != -1 && z != i) {
                return true;
            }
        }
        return false;
    }
    
   static int BinarySearch(int[] arr , int target) {
        int s=0;
        int e=arr.length - 1;
            while(s<=e){
                int m=s+(e-s)/2;
                if(arr[m] == 2*target){
                    return m;
                }
                if(arr[m]< 2*target){
                    s=m+1;
                }else{
                    e=m-1;
                }
            }
        return -1;
    }
}