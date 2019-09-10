/*
解题思路：就是将数组排序（从小到大）然后分别去第2、4、6、8位的数字加起来即位所求值
*/
class Solution {
    public int arrayPairSum(int[] nums) {
        
        int sum = 0;
        
        Arrays.sort(nums);
        
        for(int i = 0;i < nums.length-1;i+=2){
            sum+=nums[i];
        }
        return sum;
    }
}
/*
result：accept
Runtime: 14 ms	Your runtime beats 93.78 % of java submissions由于使用了快排，所以时间还算比较快
Memory Usage: 39.5 MB	根据图标推测空间几乎已经是最小的了，因为也没有生成什么对象
*/