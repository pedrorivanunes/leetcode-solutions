class Solution {
    public boolean isPalindrome(int x) {

        String originalVal = String.valueOf(x);
        char[] valChars = originalVal.toCharArray();
        char[] invertedChars = new char[valChars.length];

        for(int i = 0; i < valChars.length; i++){
            invertedChars[i] = valChars[valChars.length - 1 - i];
        }

        String invertedVal = String.valueOf(invertedChars);

        if(invertedVal.equals(originalVal)){
            return true;
        } 

        return false;
    }
}