/*
创建一个新数组，遍历原数组，判断是1还是0
*/
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int index = 0;
        int[] res = new int[nums.length];
        
        for(int i = 0; i < nums.length; i++){
			//如果是1，对应index数加一
            if(nums[i] == 1){
                res[index]++;
            } else{
                index++;		//如果不是那么index加一，并且res[index]=0
                res[index] = 0;
            }
        }
        Arrays.sort(res);
        return res[res.length - 1];
        
    }
}
/*
result：Runtime Error

Runtime Error Message: Line 12: java.lang.ArrayIndexOutOfBoundsException: 1
Last executed input: [0]
这里如果数组元素全为0，那么index就应该是nums.length,res[index]索引越界了
*/