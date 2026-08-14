class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        
        for(int i = 0; i < s.length(); i++) {
            int inst = convertValue(s.charAt(i));
            if(i + 1 < s.length() && inst < convertValue(s.charAt(i + 1))){
                sum -= inst;
            } else {
                sum += inst;
            }
        }
        return sum;
    }

    private int convertValue(char c) {
        switch(c) {
            case 'M': return 1000;
            case 'D': return 500;
            case 'C': return 100;
            case 'L': return 50;
            case 'X': return 10;
            case 'V': return 5;
            case 'I': return 1;
            default: return 0;
        }
    }
} 