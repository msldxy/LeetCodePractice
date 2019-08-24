/*
*    由于嵌套循环，其时间复杂度为O(n^2)，现在考虑降低其时间复杂度
*    思考：
*    字符串的字符全都是字母，包括其大小写总共52个，而刚好ASCII码对每一个字母都有一个对应的值
*    我们可以创建一个数组，将码作为数组的索引，第一次循环遍历S字符串，每一个字母对应ASCII码
*    作为索引，每出现一次，对应数组的值+1，最后判断J中有的字母对应的数组值相加，最终时间复杂度为O(n)
*    
*    即完成了空间换取时间
*/
package msldxy.problem771;

class Solution {
    public int numJewelsInStones(String J, String S) {
        int count = 0;
        int[] arr = new int[128];
		
		//第一次循环，遍历S得到每一个字符，将其对应的ASCII码作为索引，出现一次，数组对应位置值+1
        for (int i = 0; i < S.length(); i++) {
            int index = S.charAt(i);
            arr[index]++;
        }

		//第二次循环，同样遍历J得到每一个字符，将出现过的字符的ASCII码对应的数组的值相加，得到总次数
        for (int i = 0; i < J.length(); i++) {
            int index2 = J.charAt(i);
            count += arr[index2];
        }

        return count;
    }
}
/*提交结果：
	Success    Details->
	Runtime: 1 ms, faster than 98.21% of Java online submissions for Jewels and Stones.
	Memory Usage: 33.8 MB, less than 100.00% of Java online submissions for Jewels and Stones.

    结果跟预期结果不同，而与原来的时空消耗相同，猜测是由于数据较少？
*/