/*
 * 思路：从原字符串第一个开始，判断是否以needle字符串开头，如果是就返回目前索引，如果不是则索引+1，再将原字符串第一位去掉
 *
 */
class Solution {
    public int strStr(String haystack, String needle) {
        int count = 0;
        boolean flag = false;

        for (int i = 0; i < haystack.length(); i++) {
            if(haystack.startsWith(needle)){
                flag = true;
                break;
            }
            count++;
            haystack = haystack.substring(1);
        }

        if(flag){
            return count;
        } else return -1;
    }
}
/*
Result：wrong
Input: ""
""
Output: -1
Expected: 0
没有对字符串进行“”判断
*/