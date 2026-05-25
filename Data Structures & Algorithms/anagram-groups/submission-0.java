class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(int i=0;i<strs.length;i++){
            String original = strs[i];
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String sorted = new String(ch);
           
           if(!map.containsKey(sorted)){
            map.put(sorted, new ArrayList<>());
           }

            map.get(sorted).add(original);
        }
        return new ArrayList<>(map.values());
    }
}
