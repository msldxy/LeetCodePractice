class Solution {
    public int removeDuplicates(int[] nums) {
        int cur = 0;
        if(nums.length == 0 || nums == null) return 0;
        for(int i = 1;i < nums.length ;i++){
            if(nums[i] > nums[cur]){
                cur++;
                nums[cur] = nums[i];
            }
        }
        return cur+1;
    }
}
/*
result:accepted
Runtime: 1 ms, faster than 96.84% of Java online submissions for Remove Duplicates from Sorted Array.
Memory Usage: 38.3 MB, less than 99.47% of Java online submissions for Remove Duplicates from Sorted Array.
参考了解法中使用了0ms的答案，但是变量名不一样其他都一样，我依然是1ms
*/