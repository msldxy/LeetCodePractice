class Solution {
    public String reverseWords(String s) {
        String[] strs = s.split(" ");
        StringBuilder sb = new StringBuilder();
        boolean flag = false;	//第一个单词是否出现（这里主要考虑原字符串以很多空格结尾的情况，得到的字符串数组前几位都是“”）
        int count = 0;
        sb.append("");
        for(int i = strs.length - 1;i>=0;i--){
            if(!strs[i].equals("")){
                flag = true;
                if(i + count == strs.length -1){	//通过i和count的关系判断是否是第一个单词
                    sb.append(strs[i]);
                } else
                sb.append(" ").append(strs[i]);
            } else {
                if(!flag) count++;	//在第一个还不是单词的情况下，记录出现的“”有多少个
            }
        }
        return sb.toString(); 
    }
}
/*
result：accepted
Runtime: 1 ms, faster than 99.83% of Java online submissions for Reverse Words in a String.
Memory Usage: 37.2 MB, less than 100.00% of Java online submissions for Reverse Words in a String.
这个解法使用了逻辑来判断是否是第一个有用的单词（即不是“”），然后省去了后面去首尾空格的步骤
*/