class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            ans[i] = -1;
            int j = 0;
            while(nums2[j]!=nums1[i]){
                j++;
            }
            for(int k=j+1;k<nums2.length;k++){
                if(nums1[i]<nums2[k]){
                    ans[i] = nums2[k];
                    break;
                }
            }
        }
        return ans;
    }
}