class Solution {
    public int[] plusOne(int[] digits) {
        
        for(int i=digits.length-1; i>=0; i--){
            if(digits[i] != 9){
                digits[i] += 1;
                return digits;
            }
            else if(digits[i] == 9){
                digits[i] = 0;
            }
        }
        
        int dig[] = new int[digits.length+1];
        dig[0] = 1;
        int i=1;
        while(i < dig.length){
            dig[i] = digits[i-1];
            i++;
        }
        return dig;
    }
}