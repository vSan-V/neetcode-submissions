class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length()){
            return "";
        }  
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(int k=0;k<t.length();k++){
            char c = t.charAt(k);
            map1.put(c, map1.getOrDefault(c,0)+1);
        }


        int i=0;
        int weHave = 0;
        int need = map1.size();
        int minLen = Integer.MAX_VALUE;
        int leftResult = 0;

        for(int j=0;j<s.length();j++){
            char c = s.charAt(j);
            map2.put(c, map2.getOrDefault(c,0)+1);

            if(map1.containsKey(c) && map2.get(c).equals(map1.get(c))){
                weHave++;
            }

            while(weHave == need){
                int currentLength = j-i+1;

                if(currentLength<minLen){
                    minLen = currentLength;
                    leftResult = i;
                }

                char leftChar = s.charAt(i);

                map2.put(leftChar,map2.get(leftChar)-1);

                if(map1.containsKey(leftChar) && map2.get(leftChar)<map1.get(leftChar)){
                    weHave--;
                }
                i++;
            }
        }
        if(minLen == Integer.MAX_VALUE){
            return "";
        }

        return s.substring(leftResult, leftResult+minLen);
    }
}
