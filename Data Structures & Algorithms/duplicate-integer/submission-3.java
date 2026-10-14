class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Arrays.sort(nums);
        // for(int i=0;i<nums.length-1;i++){
        //     if(nums[i] == nums[i+1]) return true;
        // }
        // return false;


        // for(int i=0;i<nums.length-1;i++){
        //     for(int j=i+1;j<nums.length;j++)
        //     if(nums[i] == nums[j]) return true;
        // }
        // return false;


        Map<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
            if(hm.get(nums[i]) > 1) return true;
        }
        return false;
    }
}