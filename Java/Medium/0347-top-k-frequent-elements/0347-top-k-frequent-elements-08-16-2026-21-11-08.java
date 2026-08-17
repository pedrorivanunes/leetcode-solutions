class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] k_most = new int[k];
        List<Integer>[] buckets = new List[nums.length + 1];
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(!mp.containsKey(nums[i])){
                mp.put(nums[i], 1);
            }else{
                int currFreq = mp.get(nums[i]);
                mp.put(nums[i], currFreq + 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            int number = entry.getKey();
            int frequency = entry.getValue();
            if (buckets[frequency] == null) {
                buckets[frequency] = new ArrayList<>();
            }
            buckets[frequency].add(number);
        }
        int j = 0;
        for (int i = buckets.length - 1; i >= 0; i--) {
            if (buckets[i] != null) {
                for (int number : buckets[i]) {
                    k_most[j] = number;
                    j++;
                    if (j == k) {
                        return k_most;
                    }
                }
            }
        }
        return k_most;
    }
}