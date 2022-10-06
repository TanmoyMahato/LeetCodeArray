class Solution {
    public int[] replaceElements(int[] arr) {
        int i=0;
        while(i < arr.length-1){
            int max=0;
            for(int j=i+1; j<arr.length; j++){
                max = Math.max(max,arr[j]);
            }
            arr[i++]=max;
        }
        
        arr[arr.length-1] = -1;
        
        return arr;
    }
}