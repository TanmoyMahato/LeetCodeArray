class Solution {
    public int heightChecker(int[] heights) {
        int expected[] = new int[heights.length];
        int ctr=0;
        
        //coping elements from heights to expected
        for(int i=0; i<heights.length; i++){
            expected[i]=heights[i];
        }
        
        Arrays.sort(expected);
        
        //comparing both arrays;
        for(int i=0; i<heights.length; i++){
            if(expected[i] != heights[i])
                ctr++;
        }
        
        return ctr;
    }
}