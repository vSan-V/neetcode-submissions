class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int j=0;
        int maxLen = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        while(j<s.length()){
            if(!map.containsKey(s.charAt(j))){
                map.put(s.charAt(j),j);
            }
            else{
                i = Math.max(i, map.get(s.charAt(j))+1);
                map.put(s.charAt(j),j);
            }
            maxLen = Math.max(maxLen, j-i+1);
            j++;
        }
        return maxLen;
    }
}
