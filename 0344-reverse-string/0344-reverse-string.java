/* 3rd approach using Recurrsion */
class Solution {
    public StringBuilder revString(char ch[], StringBuilder str, int i){
        if(i == ch.length){
            return str;
        }        
        revString(ch, str, i+1);
        return str.append(ch[i]);
    }
    
    public void reverseString(char[] ch) {
        
        StringBuilder str = new StringBuilder();
        int i=0;
        revString(ch, str, i);
        
        for(i=0; i<ch.length; i++){
            ch[i] = str.charAt(i);
        }
    }
}