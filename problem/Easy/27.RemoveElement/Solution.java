/*
思路：两个索引都从第一位开始，第一个每个都遍历，如果不为value，则把值放入第二个索引位置，如果是value则继续下一位判断
*/
class Solution {
    public int removeElement(int[] nums, int val) {
        
        int fast = 0;
        int low = 0;
        int count = 0;
        
        for(;fast < nums.length; fast++){
            if(nums[fast] != val){
                nums[low] = nums[fast];
                low++;
                count++;
            }
        }
        
        return count;
        
    }
}
/*
result：accept
Runtime: 0 ms		100%
Memory Usage: 36.2 MB	almost100%
*/