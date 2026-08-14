class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder clean = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                clean.append(Character.toLowerCase(c));
            }
        }
        int i = 0, j = clean.length() - 1;
        if(clean.length() == 0) return true;
        while(i < j){
            if(clean.charAt(i) != clean.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}