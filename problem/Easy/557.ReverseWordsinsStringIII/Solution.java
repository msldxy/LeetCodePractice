/*
将字符串以空格切分得到子串数组，然后遍历将每一个子串倒置，再拼接
*/
class Solution {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        String[] strs = s.split(" ");
        for(String str : strs){
            if(!str.equals("")){
                StringBuilder sb = new StringBuilder(str);
                str = sb.reverse().toString();
            } else str = " ";
            result.append(str).append(" ");
        }
        return result.toString().trim();
    }
}
/*
result：accepted
Runtime: 4 ms			Your runtime beats 82.67 % of java submissions.
Memory Usage: 38.5 MB	Your memory usage beats 91.23 % of java submissions
*/