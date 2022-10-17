class Solution {
    public boolean binarySearch(char str[], char ch){
        int start=0, end=str.length-1;
        
        while(start<=end){
            int mid = start + (end-start)/2;
            if(ch == str[mid]){
                return true;
            }
            else if(ch > str[mid])
                start = mid+1;
            else
                end = mid-1;
        }
        
        return false;        
    }
    
    
    
    public boolean checkIfPangram(String sentence) {
        char tempArray[] = sentence.toCharArray();
        Arrays.sort(tempArray);
        
        int i=97;
        while(i<=122){
            char ch = (char)i;
            if(binarySearch(tempArray, ch))
                i++;
            else
                return false;            
        }
        
        return true;
    }
}