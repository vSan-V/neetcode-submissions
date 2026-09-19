class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] count = new int[26];

        for(int i=0;i<s1.length();i++){
            count[s1.charAt(i)-'a']++;
        }

        int i=0;
        
        for(int j=0;j<s2.length();j++){
            count[s2.charAt(j)-'a']--;

            if(j-i+1>s1.length()){
                count[s2.charAt(i)-'a']++;
                i++;
            }

            if(j-i+1 == s1.length()){
                boolean valid = true;

                for(int k =0;k<26;k++){
                    if(count[k]!=0){
                        valid = false;
                        break;
                    }
                }
                if(valid){
                    return true;
                }
            }
        }
        return false;
    }
}
