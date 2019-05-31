/**
*思路：
*初步设想：在定义一个数组，用来储存原数组中，从0到对应索引的和，如sums[3] = nums[0] + nums[1] + nums[2] + nums[3];
*
*然后再判断是否存在一个索引，使得2*sums[index] + nums[index +1] = sums[sums.length-1];,即满足左边等于右边
*
*
*/

class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        int[] sums = new int[nums.length];
        for(int i = 0; i < nums.length;i++){
            sum += nums[i];
            sums[i] = sum;
        }
        for(int i = 0; i < sums.length - 1; i++){
            if(sums[i] * 2 + nums[i+1] == sums[sums.length-1]){
                return i+1;
            }
        }
        return -1;
    }
}

/*
*第一次提交报了Wrong Answer，经过分析是由于没有考虑到索引为0的时候，即数组除了第一位，和为0，而左边也是0.
*
*
*/