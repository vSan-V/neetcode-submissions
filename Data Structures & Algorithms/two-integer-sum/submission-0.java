class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];

        for(int i=0;i<nums.length;i++){
            int check = target - nums[i];
            if(map.containsKey(check)){
                ans[0]= map.get(check);
                ans[1]= i;
            }
            else{
            map.put(nums[i],i);
            }
        }
        Arrays.sort(ans);
        return ans;
    }
}
