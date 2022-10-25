class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String wrd1 = "";
        String wrd2 = "";
                
        for(int i=0; i<word1.length; i++){
            wrd1 += word1[i];
        }
        for(int i=0; i<word2.length; i++){
            wrd2 += word2[i];
        }
        
        if(wrd1.equals(wrd2))
            return true;
        else 
            return false;
    }
}