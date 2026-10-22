class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            nums[i] *= nums[i];
        }
        Arrays.sort(nums);
        long sum = 0;
        for(int i=0;i<n/2;i++){
            sum -= nums[i];
        }
        for(int i=n/2;i<n;i++){
            sum += nums[i];
        }
        return sum;
    }
}