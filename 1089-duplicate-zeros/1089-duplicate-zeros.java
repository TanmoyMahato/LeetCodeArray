class Solution {
    public void duplicateZeros(int[] arr) {
        int len = arr.length;
        for(int i= arr.length-1; i>=0; i--){
            if (arr[i] == 0){
                for (int j = arr.length-1; j > i; j--){
                    arr[j] = arr[j-1];
                }
            }
        }
    }
}