class Solution {
    public boolean checkIfPangram(String sentence) {
        char tempArray[] = sentence.toCharArray();
        Arrays.sort(tempArray);
        
        int i=97;
        while(i<=122){
            int idx = Arrays.binarySearch(tempArray, (char)i);
            if(idx > -1)
                i++;
            else
                return false;            
        }
        
        return true;
    }
}