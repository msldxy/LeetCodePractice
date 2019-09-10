/*
思路：定义两个索引，分别指向头和尾，然后将对应的值相加与目标值比较。如果大了就end--；反之如果小了就head++
最后得出两个元素的索引
*/

class Solution {
    public int[] twoSum(int[] numbers, int target) {
    
        int head = 0;
        int end = numbers.length - 1;
        int[] result = new int[2];

        while (end > head){
            if(numbers[head] + numbers[end] > target){
                end--;
            } else if(numbers[head] + numbers[end] < target){
                head++;
            } else {
                result[0] = head + 1;
                result[1] = end + 1;
                return result;
            }
        }
        return null;
    }
}
/*
result：accept
Runtime: 0 ms		100%
Memory Usage: 37.4 MB	由图表推测也是100%
*/