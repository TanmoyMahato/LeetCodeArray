class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        
        List<List<Integer>> diffPair = new ArrayList<>();
        
        Arrays.sort(arr);
        
        int absDiff=Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            int diff = arr[i+1]-arr[i];
            absDiff = Math.min(absDiff,diff);
        }
        
        for(int i=0; i<arr.length-1; i++){
            if(arr[i+1]-arr[i] == absDiff){
                diffPair.add(Arrays.asList(arr[i],arr[i+1]));
            }
        }
        
        return diffPair;
    }
}