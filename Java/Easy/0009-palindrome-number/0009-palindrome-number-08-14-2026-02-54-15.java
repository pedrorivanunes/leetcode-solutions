class Solution {
    public boolean isPalindrome(int x) {

        if(x < 0) return false;
        if(x != 0 && x % 10 == 0) return false;

        int inverted = 0;
        int val = x;
        
        while(x != 0) {
            int digit = x % 10;
            inverted = inverted * 10 + digit;
            x = x / 10;
        }

        return inverted == val;
    }
}