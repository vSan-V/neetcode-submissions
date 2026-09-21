class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        int i= 0;
        int maxInWindow = Integer.MIN_VALUE;

        for(int j=0;j<nums.length;j++){
            if(j-i+1>k){
                if(nums[i]==maxInWindow){
                    maxInWindow = Integer.MIN_VALUE;

                    for(int m = i+1;m<=j;m++){
                        maxInWindow = Math.max(maxInWindow, nums[m]);
                    }
                }
                i++;
            }
            maxInWindow = Math.max(maxInWindow, nums[j]);

            if(j-i+1 == k){
                list.add(maxInWindow);
            }
        }

        int[] result = new int[list.size()];

        for(int l=0;l<list.size();l++){
            result[l] = list.get(l);
        }
        return result;
    }
}
