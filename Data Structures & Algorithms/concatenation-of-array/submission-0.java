class Solution {
    public int[] getConcatenation(int[] nums) {
        int arr[] = new int[2 * (nums.length)];
        int index = 0;
        for(int i=0;i<nums.length;i++){
            arr[index++] = nums[i];
        }
        for(int i=0;i<nums.length;i++){
            arr[index++] = nums[i];
        }
        return arr;
    }
}