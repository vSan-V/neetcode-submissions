class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);

        int i =0;

        while(i<nums.length){
            int j = i+1;
            int k = nums.length-1;

            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];

                if(sum<0){
                    j++;
                }
                else if(sum>0){
                    k--;
                }
                else{
                    List<Integer> item = Arrays.asList(nums[i], nums[j], nums[k]);

                    if(!list.contains(item)){
                        list.add(item);
                    }

                    int currentJ = nums[j];
                    int currentK = nums[k];

                    while(j<k && nums[j]==currentJ){
                        j++;
                    }
                    while(j<k && nums[k]==currentK){
                        k--;
                    }
                }
            }
            int currentI = nums[i];
            while(i<nums.length && nums[i]==currentI){
                i++;
            }
        }
        return list;
    }
}
