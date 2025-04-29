class Solution {
    public int lengthOfLastWord(String s) {
    String[] nums=s.split(" ");
    int n=nums.length;
    String Last=nums[n-1];
    int len=Last.length();
    return len;



    }
}
