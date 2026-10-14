class Solution {
    public int[] getConcatenation(int[] nums) {
        // tc -> O(N) two loops
        // O(n) auxiliary
        // int arr[] = new int[2 * (nums.length)];
        // int index = 0;
        // for(int i=0;i<nums.length;i++){
        //     arr[index++] = nums[i];
        // }
        // for(int i=0;i<nums.length;i++){
        //     arr[index++] = nums[i];
        // }
        // return arr;



         // tc -> O(N)
        // O(n) auxiliary
        // int n = nums.length;
        // int arr[] = new int[2 * n];
        // int index = 0;
        // for(int i=0;i<nums.length;i++){
        //     arr[i] = nums[i];
        //     arr[n+i] = nums[i];

        // }
       
        // return arr;


         int n = nums.length;
        int arr[] = new int[2 * n];
        int index = 0;
    

        System.arraycopy(nums,0,arr,0,n);
        System.arraycopy(nums,0,arr,n,n);
       
        return arr;

    }
}