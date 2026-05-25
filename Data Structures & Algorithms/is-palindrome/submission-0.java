class Solution {
    public boolean isPalindrome(String s) {
        String cleaned = s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        int i = 0;
        int len = cleaned.length()-1;
        int j = len;

        while(i<=j){
            if(cleaned.charAt(i)==cleaned.charAt(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
        } 
        return true;       
    }
}
