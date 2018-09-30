package medium;

class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        int r = nums[0];
        int imax = r;
        int imin = r;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                int temp = imax;
                imax = imin;
                imin = temp;
            }

            imax = Math.max(nums[i], imax*nums[i]);
            imin = Math.min(nums[i],imax*nums[i]);

            r = Math.max(r, imax);
        }
        return r;
    }


}
