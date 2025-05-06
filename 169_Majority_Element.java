class Solution {
    public int majorityElement(int[] nums) {
        int ans=-2000000000;
        int n=nums.length;
        HashMap <Integer,Integer> hm=new HashMap <>();
        for(int i=0;i<n;i++){
            int key=nums[i];
            hm.put(key,hm.getOrDefault(key,0)+1);
        
        }
        for(int a:hm.keySet()){
            if(hm.get(a)>n/2){
                int temp=a;
                ans=Math.max(ans,temp);
            }


        }
      return ans;  
    }
}
