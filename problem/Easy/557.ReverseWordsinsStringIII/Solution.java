/*
���ַ����Կո��зֵõ��Ӵ����飬Ȼ�������ÿһ���Ӵ����ã���ƴ��
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
result��accepted
Runtime: 4 ms			Your runtime beats 82.67 % of java submissions.
Memory Usage: 38.5 MB	Your memory usage beats 91.23 % of java submissions
*/