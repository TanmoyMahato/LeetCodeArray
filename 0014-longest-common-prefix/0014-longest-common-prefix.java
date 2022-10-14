class Solution {
    public String longestCommonPrefix(String[] strs) {
        String str = "";         
        
        Arrays.sort(strs);
        
        //traverse store each char of 1st string
        for(int i=0; i<strs[0].length(); i++){
            char ch = strs[0].charAt(i);
            int flag = 0;
            
            //compare with char of every other strings
            for(int j=1; j<strs.length; j++){
                //if (character does not match)
                if(strs[j].length()<i || ch!=strs[j].charAt(i)){
                    flag = 1;
                    break;
                }
            }
            
            if(flag == 1)
                break;
            else
                str += String.valueOf(ch);
        }
        
        return str;
    }
}