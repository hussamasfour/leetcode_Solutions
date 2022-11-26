class Solution {
    public int[] shuffle(int[] nums, int n) {
        if(n == 1){
            return nums;
        }
        int i =0;
        int j  = n;
        int k =0;
        int [] result = new int[nums.length];
        while(j< nums.length){
            result[k] = nums[i];
            result[k+1] = nums[j];
            i++;
            j++;
            k+=2;
        }
        return result;
    }
}