class Solution {
    public boolean hasDuplicate(int[] nums) {
        // tc -> O(nlogn)
        // sc -> O(1)
        // Arrays.sort(nums);
        // for(int i=0;i<nums.length-1;i++){
        //     if(nums[i] == nums[i+1]) return true;
        // }
        // return false;

        // tc -> O(n^2)
        // sc -> O(1)
        // for(int i=0;i<nums.length-1;i++){
        //     for(int j=i+1;j<nums.length;j++)
        //     if(nums[i] == nums[j]) return true;
        // }
        // return false;

        // tc -> O(n)
        // sc -> O(n)
        // Map<Integer,Integer> hm = new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        //     if(hm.get(nums[i]) > 1) return true;
        // }
        // return false;

        // tc -> O(n)
        // sc -> O(n)
        Set<Integer> hs = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            // hs.add(nums[i]);
           if(!hs.contains(nums[i])) hs.add(nums[i]);
           else return true;
           
        }
        return false;

    }
}