class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();
        for(int i = 0; i < strs.length; i++){
            char[] freq = new char[26];
            for(int j = 0; j < strs[i].length(); j++){
                freq[strs[i].charAt(j) - 'a']++;
            }
            String key = new String(freq);
            if(!groups.containsKey(key)) groups.put(key, new ArrayList<>());
            groups.get(key).add(strs[i]);
        }
        return new ArrayList<>(groups.values());
    }
}