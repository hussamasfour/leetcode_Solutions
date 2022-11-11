class Solution {
    public int pivotIndex(int[] nums) {
        if(nums.length == 0){
            return -1;
        }
        int leftSum = 0;
        int total = 0;
        
        for(int i=0;i<nums.length; i++){
            total +=nums[i];
        }
        
        for(int i=0;i<nums.length;i++){
            total -=nums[i];
            if(leftSum == total){
                return i;
            }
            
            leftSum += nums[i];
        }
        
        return -1;
    }
}