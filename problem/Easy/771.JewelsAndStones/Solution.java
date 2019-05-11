/*
*初步设想：
*	循环遍历S字符串的字符，再将得到的每一个字符与J字符串中的字符匹配，判断是否存在，如果存在则计数+1
*/
package msldxy.problem771;

class Solution {
    public int numJewelsInStones(String J, String S) {
        int count = 0;
        for(int i = 0;i < S.length(); i++){
            char ch = S.charAt(i);				//第一次循环，获得S字符串的每一个字符
            for(int j = 0;j < J.length(); j++){
                if(ch == J.charAt(j))
                    count++;					//将得到的每一个字符与J字符串的每一个字符比较，有相同则计数加一
            }
        }
        return count;
    }
}
/*提交结果：
	Success    Details->
	Runtime: 1 ms, faster than 98.21% of Java online submissions for Jewels and Stones.
	Memory Usage: 33.8 MB, less than 100.00% of Java online submissions for Jewels and Stones.
*/