class Solution {
    public void reverse(int[] nums, int l, int r){
        while (l < r){
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
    }
    
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        // reduce times example
        // nums = [1,2,3,4,5] ， nums.length = 5; k = 6 ---> nums = [5,1,2,3,4]
        // nums = [1,2,3,4,5] ， nums.length = 5; k = 1 ---> nums = [5,1,2,3,4]     
      
        k %= n;
        reverse(nums, 0 , n-k-1);
        reverse(nums, n-k , n-1);
        reverse(nums, 0 , n-1);
    }
}
