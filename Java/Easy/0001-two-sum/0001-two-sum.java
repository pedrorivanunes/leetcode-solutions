class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mp = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {

            int inst = nums[i];
            int comp = target - inst;
            Integer idxComp = mp.get(comp);

            if(idxComp != null){
                return new int[] {idxComp, i};
            }

            mp.put(nums[i], i);
        }
        return new int[] {};
    }
}