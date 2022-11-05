class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        
        Map<Character, Integer> sCount = new HashMap<>();
        for(int i=0;i<s.length();i++){
            sCount.put(s.charAt(i), sCount.getOrDefault(s.charAt(i),0) +1);
            sCount.put(t.charAt(i), sCount.getOrDefault(t.charAt(i),0) -1);
        }
        
        for(char c: sCount.keySet()){
            if(sCount.get(c) != 0){
                return false;
            }
        }
        return true;
    }
}