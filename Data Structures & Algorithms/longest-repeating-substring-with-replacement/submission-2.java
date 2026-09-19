class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int i=0;
        int j=0;
        int maxLen = 0;
        while(j<s.length()){
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j),0)+1);

            int maxFreq= Collections.max(map.values());
            
            int checkWindow = (j-i+1)-maxFreq;

            if(checkWindow>k){
                map.put(s.charAt(i),map.get(s.charAt(i))-1);
                if(map.get(s.charAt(i))==0){
                    map.remove(s.charAt(i));
                }
                i++;
            }
            maxLen = Math.max(maxLen, j-i+1);
            j++;
        }
        return maxLen;
    }
}
