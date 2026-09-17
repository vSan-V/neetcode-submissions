class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0;
        int j=numbers.length-1;

        while(i<j){

            int checkSum = numbers[i]+numbers[j];
            if(checkSum == target){
                return new int[]{i+1,j+1};
            }

            if(checkSum>target){
                j--;
            }
            else{
                i++;
            }
        }
        return new int[]{};
    }
}
