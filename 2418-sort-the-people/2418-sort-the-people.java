class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer,String> map = new HashMap<>();
        
        for(int i = 0;i<names.length;i++){
            map.put(heights[i], names[i]);
        }
        
        Arrays.sort(heights);
        String[] sorted_names = new String[names.length];
        
        int index = 0;
        for(int i = heights.length-1; i>=0;i--){
            sorted_names[index]= map.get(heights[i]);
            index++;
        }
        
        return sorted_names;
      
    }
}