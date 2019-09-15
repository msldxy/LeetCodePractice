class Solution {
    public int removeDuplicates(int[] nums) {
		int count = 1;
        int cur = 0;
        if(nums.length == 0) return 0;
        for(int i = 1;i < nums.length ;i++){
            if(nums[i] > nums[cur]){
                nums[++cur] = nums[i];
				count++;
            }
        }
        return count;
    }
}
/*
result:recepted
Runtime: 1 ms, faster than 96.84% of Java online submissions for Remove Duplicates from Sorted Array.
Memory Usage: 39.1 MB, less than 99.47% of Java online submissions for Remove Duplicates from Sorted Array.
*/