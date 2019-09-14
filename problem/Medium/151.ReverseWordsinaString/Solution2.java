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
        return sb.toString().trim();	//这里去掉了新创建的String对象；
    }
}
/*
result：accepted
Runtime: 1 ms, faster than 99.83% of Java online submissions for Reverse Words in a String.
Memory Usage: 37.6 MB, less than 88.17% of Java online submissions for Reverse Words in a String.
*/