/*
 * 分别取出第一个元素字符串的字符，和其他元素的对应位置进行比较
 *
 */
class Solution {
    public String longestCommonPrefix(String[] strs) {
        int min = strs[0].length();
        if (strs.length == 1) return strs[0];
        for (String str : strs) {
            if (str.length() == 0) {
                return "";
            }
            min = min < str.length() ? min : str.length();
        }
        int length = min;
        boolean flag = false;//是否已经有不同的出现
        int index = 0;
        for (index = 0; index < length; index++) {
            char temp = strs[0].charAt(index);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(index) != temp) {
                    flag = true;
                    break;
                }
            }
            if(flag) break;

        }
        return strs[0].substring(0,index);
    }
}
/*
Result：wrong

Runtime Error Message: Line 3: java.lang.ArrayIndexOutOfBoundsException: 0
Last executed input: []

没有对数组进行非空判断
 */