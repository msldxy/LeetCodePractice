/*
解法：设一个变量储存0的个数，然后遍历赋值
*/
class Solution {
    public void moveZeroes(int[] nums) {
        int count = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 0){	//如果该元素是0，那么count+1
                count++;
            } else{
                nums[i-count] = nums[i];	//如果不是0，那么就把i对应的值赋给前count位，即去除0的个数位
            }
        }
        for(int i = 1;i<=count;i++){
            nums[nums.length - i] = 0;		//遍历将后面count位变为0
        }
    }
}
/*
result：accepted
Runtime: 0 ms	Your runtime beats 100.00 % of java submissions
Memory Usage: 38.4 MB	Your memory usage beats 79.72 % of java submissions.
其实这里的count有一点多余了。直接用两个索引就行的
*/