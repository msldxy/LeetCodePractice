/*
将字符串按“ ”拆分，然后
*/
class Solution {
    public String reverseWords(String s) {
        String[] strs = s.split(" ");
        StringBuilder sb = new StringBuilder();
        sb.append("");
        for(int i = strs.length - 1;i>=0;i--){
            if(!strs[i].equals("")){
                sb.append(strs[i]).append(" ");
            }
        }
        String result = sb.toString();
        return result.trim();
    }
}
/*
result：accepted
Runtime: 1 ms			Your runtime beats 99.83 % of java submissions
Memory Usage: 37.9 MB	Your memory usage beats 58.06 % of java submissions
空间较大，新创建的对象还有使用了trim头尾去空格的方法
*/	