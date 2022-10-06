class Solution {
    public boolean validMountainArray(int[] arr) {
        int len = arr.length >= 3 ? arr.length : 0;
int inc = 0;
int dec = 0;

        for(int i = 1; i < len; i++){
            if(dec == 0 && arr[i - 1] < arr[i]){
                inc++;
            } else if(inc > 0 && arr[i - 1] > arr[i]){
                dec++;
            }
        }
        return inc + dec == len - 1  && dec > 0;
    }
}