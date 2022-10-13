class Solution {
    public int strStr(String haystack, String needle) {
        
        String str = "";
        
        for(int i=0; i<=haystack.length()-needle.length(); i++){
            int len = needle.length();
            int j = i;
            while(len!=0){
                str = str + String.valueOf(haystack.charAt(j++));
                len--;
            }
            
            if(str.equals(needle))
                return i;
            
            else
                str="";
        }
        
        
        return -1;
    }
}