/*
解法：将字符串变成字符数组，然后遍历，每次到空格，就把前面一段倒置
*/
class Solution {
    public String reverseWords(String s) {

        char[] res = s.toCharArray();
        int start = 0;
        int end = 0;
        for(;end < s.length()-1;end++){
            if(res[end] == ' '){
                reverse(res,start,end-1);
                start = end + 1;
            }
        }
        reverse(res,start,end);		//最后一个单词后面没有空格
        return new String(res);
    }
    
    private void reverse(char[] ch,int st,int end){
        while(st < end){
            char temp = ch[st];
            ch[st] = ch[end];
            ch[end] = temp;
            st++;
            end--;
        }
    }
}
/*
result：accepted
Runtime: 4 ms, faster than 82.67% of Java online submissions for Reverse Words in a String III.
Memory Usage: 38.2 MB, less than 100.00% of Java online submissions for Reverse Words in a String III.
空间少用了些，但是时间还是没有减少，猜测大概是因为遍历将所有的都遍历完了
*/