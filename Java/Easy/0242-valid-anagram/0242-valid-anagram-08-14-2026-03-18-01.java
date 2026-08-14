class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] letterS = s.toCharArray();
        char[] letterT = t.toCharArray();
        Arrays.sort(letterS);
        Arrays.sort(letterT);
        for(int i = 0; i < s.length(); i++){
            if(letterS[i] != letterT[i]) return false;
        }
        return true;
    }
}