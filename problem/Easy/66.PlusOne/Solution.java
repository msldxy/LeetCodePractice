/*
 *思路：如果只是+1，那么就是简单的在数组最后以为+1
 *
 *这道题的考点难点只要就是最后一位9的情况下+1需要进位，而前面还是9的话同样要向前进一位。如果数组的第一位仍然是9，那么还应该再创建一个长度+1的数组，其第一位是1，后面都是0
 *
 *如[9，9，9，9]的结果是[1，0，0，0，0]
 *
 *
 *
 */

 class Solution {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length -1 ; i >= 0;i--){
            if(digits[i] != 9){
                digits[i] ++;
                break;
            }
            else if(i != 0){
                digits[i] = 0;
            } else {
                int[] result = new int[digits.length+1];
                result[0] =1;
                return result;
            }
        }
        return digits;
    }
    
}
/*结果：
Success	->Details
Runtime: 0 ms, faster than 100.00% of Java online submissions for Plus One.
Memory Usage: 34.5 MB, less than 99.97% of Java online submissions for Plus One.

时间100%，空间99.97%，几乎完美
*/