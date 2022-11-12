class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> unique = new HashSet<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int pointer1 =0; 
        int pointer2 = 0;
    
        while(pointer1 <nums1.length && pointer2 <nums2.length){
            if(nums1[pointer1] < nums2[pointer2]){
                pointer1++;
            
            }else if(nums1[pointer1]> nums2[pointer2]){
                pointer2++;
            }else{
                unique.add(nums1[pointer1]);
                pointer1++;
                pointer2++;
            }
            
        }
        int[] result = new int[unique.size()];
        int k = 0;
        for(Integer v: unique){
            result[k++] = v;
        }
        
        return result;
    }
}