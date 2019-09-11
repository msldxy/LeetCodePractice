/*
思路：先遍历一次求出第一个能满足和大于给定数的头尾两个索引。然后以这两个索引为标准，一起往右移，计算其中sum和s比较大小，如果小就继续移动，如果大或等就把head右移。以此类推
*/
class Solution {
    public static int minSubArrayLen(int s, int[] nums) {

        int sum = 0;
        int min = 0;

        int head = 0;
        int end;

        for(end = 0;end < nums.length && sum < s;end++){
            sum+=nums[end];
        }
        if(sum < s) return min;	//如果数组所有的和小于s那么返回0；
        min = end- head;
        end--;	//由于之前循环结束时end++了，所以要-1回去

        while(end < nums.length){
            if(sum >= s){	//如果大于s，则head往右移一位，即+1，并且sum要先减去nums[head]
                min = min < end-head ? min :end -head;
                sum-=nums[head];
                head++;
            } else if(end == nums.length - 1){	//这里是如果sum小于s了并且end是最后一位，那么就跳出循环
                min++;
                break;
            } else{	//如果sum小于s并且end不是最后一位，那么head和end都右移，sum发生变化
                sum = sum - nums[head++] + nums[++end];
            }
        }
        return min;
    }
}
/*
result：accepted
Runtime: 1 ms, faster than 99.97% of Java online submissions for Minimum Size Subarray Sum.
Memory Usage: 36.9 MB, less than 100.00% of Java online submissions for Minimum Size Subarray Sum.
Almost perfect
*/