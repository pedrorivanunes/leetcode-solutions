class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();
        for(int i = 0; i < strs.length; i++){
            char[] lt = strs[i].toCharArray();
            Arrays.sort(lt);
            String word = new String(lt);
            if(!groups.containsKey(word)) groups.put(word, new ArrayList<>());
            groups.get(word).add(strs[i]);  
        }
        return new ArrayList<>(groups.values());
    }
}