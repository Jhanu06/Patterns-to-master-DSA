
//Leetcode Solutions

class NumArray {

    int ps[];

    public NumArray(int[] nums) {
       for(int i=1;i<nums.length;i++)
       {
        nums[i]=nums[i-1]+nums[i];
       }
       this.ps=nums;
    }

    public int sumRange(int left, int right) {
       if(left==0)
       {
        return ps[right];
       }
       return ps[right]-ps[left-1];
    }
}
