class Solution {
    public int lengthOfLongestSubstring(String s) {
         int result = 0;
        int[] charASC = new int[256];
        int occurrence = 0;
        for (int i = 0; i < s.length(); i++) {
            occurrence =  Math.max(occurrence, charASC[s.charAt(i)]) ;
            charASC[s.charAt(i)] = i + 1;
            result = Math.max(result, i - occurrence + 1);
        }
        return result;
    }
}