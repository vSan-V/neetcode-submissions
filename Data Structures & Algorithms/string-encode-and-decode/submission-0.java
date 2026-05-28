class Solution {

    public String encode(List<String> strs) {    
        StringBuilder sb = new StringBuilder();
        for(String st:strs){
            sb.append(st.length())
            .append('#').append(st);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int i=0;
       
       while(i<str.length()){
        int j =i;
         while(str.charAt(j) != '#'){
            j++;
         }
         int len = Integer.parseInt(str.substring(i,j));
         String word= str.substring(j+1,j+1+len);
         list.add(word);
         i=j+1+len;
       }
       return list;
    }
}
