class Solution {
    public int maximumProduct(int[] nums) {
      int n=nums.length;
      Arrays.sort(nums); 
      int res1=nums[n-1]*nums[n-2]*nums[n-3];
      int res2=nums[0]*nums[1]*nums[n-1];
      int ans=Math.max(res1,res2);
      return ans;

    }
}
