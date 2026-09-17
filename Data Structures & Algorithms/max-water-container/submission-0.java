class Solution {
    public int maxArea(int[] heights) {
        int i=0;
        int j = heights.length-1;
        int maxWater = Integer.MIN_VALUE;

        while(i<j){
            int fw = j-i;
            int fh = Math.min(heights[i], heights[j]);
            int mul = fw*fh;

            if(maxWater<mul){
                maxWater = mul;
            }
            if(heights[i]<heights[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return maxWater;
    }
}
