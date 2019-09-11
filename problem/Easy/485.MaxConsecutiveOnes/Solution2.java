/*
将res数组的长度设为比nums数组多一即可了

*/
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int index = 0;
        int[] res = new int[nums.length + 1];
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                res[index]++;
            } else{
                index++;
                res[index] = 0;
            }
        }
        Arrays.sort(res);
        return res[res.length - 1];
        
    }
}
/*
result：accept
Runtime: 7 ms		Your runtime beats 5.90 % of java submissions.
Memory Usage: 37.7 MB

查看别人解答：遍历nums，对于nums[i]=1，再使用指针j=i+1，j++等，如果nums[j]==0就结束，使i=j。

*/