class Solution {
    public boolean isPalindrome(int x) {

        if(x < 0) return false;
        if(x != 0 && x % 10 == 0) return false;

        String val = String.valueOf(x);
        char[] valChars = val.toCharArray();
        int left = 0;
        int right = valChars.length - 1;

        while(left < right) {
            if(valChars[left] != valChars[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}