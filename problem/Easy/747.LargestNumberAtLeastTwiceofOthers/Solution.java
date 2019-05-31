/*
*思路：定义两个索引，遍历数组，经过判断，将两个索引对应的值和遍历得到的值中最大的给first索引，第二大的给second索引
*
*在遍历过程中，如果遇到遍历的数最大，则将对应索引用index储存
*
*最后再将两个索引的值进行判断，如果满足则返回index，不满足则返回-1
*
*/

class Solution {
    public int dominantIndex(int[] nums) {
        if(nums == null || nums.length == 1) return -1;
        
        int first = 0;
        int second = 0;
        int index = -1;
        for(int i = 0;i < nums.length; i++){
            if(first > nums[i]){
                second = second > nums[i] ? second : nums[i];
            } else {
                second = first;
                first = nums[i];
                index = i;
            }
        }
        if(first >= second*2){
            return index;
        } else return -1;
        
    }
}
/*
*结果：Wrong Answer
*	Input: [1]	
*	Output: -1	
*	Expected: 0
*
*根据提示可知，解题过程中时忽略了数组只有一个元素的情况。
*
*
*/