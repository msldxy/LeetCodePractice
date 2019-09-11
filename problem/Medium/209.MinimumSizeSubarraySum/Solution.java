/*
使用双循环暴力破解，分别计算子串是否满足，一满足就break，获取子串信息
如果不满足则返回0，最后求长度数组中除了0的最小值
*/
class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        if(nums.length == 0) return 0;
        int[] arr = new int[nums.length];	//储存长度的数组
        int num = 0;		//不满足的个数，即长度数组中有多少个0
        for (int i = 0; i < arr.length; i++) {	//第一个循环，子串头
            int sum = 0;
            int count = 0;
            boolean flag = false;
            for (int j = i; j < nums.length; j++) {	//第二次循环，子串尾
                sum+=nums[j];
                if(sum < s){
                    count++;
                } else {
                    flag = true;
                    break;
                }
            }
            if(flag) arr[i] = ++count;	//满足条件的长度存入数组
            else {
                num++;			//没有满足的情况
                arr[i] = 0;
            }
        }
        Arrays.sort(arr);
        if(num == nums.length){	//如果不满足的个数等于数组长度，那么说明数组所有元素和小于s
            return 0;
        }
        return arr[num];
    }
}
/*
result：accepted
Runtime: 62 ms		由于是暴力，所以时间复杂度肯定很高    暂时有一个思路，还是使用双指针，第一次遍历到满足时，记录长度，然后ij都+1，判断，如果小于，则继续+1，如果大于则i++；
Memory Usage: 36.9 MB
*/