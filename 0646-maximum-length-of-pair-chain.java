class Solution {
    public int findLongestChain(int[][] pairs) {
        
        Arrays.sort(pairs,Comparator.comparingInt(o->o[1]));
        
        int chainSize = 1;
        int endTime = pairs[0][1];
        for(int i=1; i<pairs.length; i++){
            int startTime = pairs[i][0];
            if(startTime > endTime){
                chainSize++;
                endTime = pairs[i][1];
            }
        }
        
        return chainSize;
    }
}
