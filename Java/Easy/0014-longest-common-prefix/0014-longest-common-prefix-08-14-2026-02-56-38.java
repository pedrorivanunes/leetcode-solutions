class Solution {
    public String longestCommonPrefix(String[] strs) {
        int prefixSize = strs[0].length();
        for(int i = 1; i < strs.length; i++){
            int j = 0;
            while(j < strs[i].length() && 
                    j < prefixSize &&
                    strs[0].charAt(j) == strs[i].charAt(j)) {
                j++;
            }
            prefixSize = j;
            if(prefixSize == 0) return "";
        }
        return strs[0].substring(0, prefixSize);
    }
}