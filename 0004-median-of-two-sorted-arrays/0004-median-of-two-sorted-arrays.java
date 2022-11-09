class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int [] subArr =  new int [nums1.length+nums2.length];
        int i = 0, j = 0, k =0;
        double median = 0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                subArr[k++]= nums1[i++];
            }else{
                subArr[k++] = nums2[j++];
            }
        }
        while (i < nums1.length)
            subArr[k++] = nums1[i++];
        while (j < nums2.length)
            subArr[k++] = nums2[j++];
        
        if(subArr.length % 2 != 0){
            median = subArr[(subArr.length+1)/2-1];
        }else{
            median = (subArr[(subArr.length)/2-1] + subArr[subArr.length/2])/2d;
        }
        return median;
    }
}