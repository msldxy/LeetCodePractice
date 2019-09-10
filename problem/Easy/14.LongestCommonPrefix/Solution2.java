class Solution {
    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 0) return "";
        if (strs.length == 1) return strs[0];
        int min = strs[0].length();
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
增加了对数组的长度判断，为空时则返回“”，为1时则返回唯一那个字符串
Result：accept
Runtime: 1 ms	Your runtime beats 74.45 % of java submissions
Memory Usage: 37.2 MB	Your memory usage beats 99.42 % of java submissions
