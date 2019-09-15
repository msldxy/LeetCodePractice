class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] != 0){
                nums[index++] = nums[i];
            }
        }
        while(index < nums.length){
            nums[index++] = 0;     
        }
    }
}
/*
result：accepted
Runtime: 0 ms, faster than 100.00% of Java online submissions for Move Zeroes.
Memory Usage: 38.1 MB, less than 83.22% of Java online submissions for Move Zeroes.
其实这样感觉和原来的差不多，依然是那么多变量。不过空间好像少了些
*/