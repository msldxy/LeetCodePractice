/*
�ⷨ�����ַ�������ַ����飬Ȼ�������ÿ�ε��ո񣬾Ͱ�ǰ��һ�ε���
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
        reverse(res,start,end);		//���һ�����ʺ���û�пո�
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
result��accepted
Runtime: 4 ms, faster than 82.67% of Java online submissions for Reverse Words in a String III.
Memory Usage: 38.2 MB, less than 100.00% of Java online submissions for Reverse Words in a String III.
�ռ�������Щ������ʱ�仹��û�м��٣��²�������Ϊ���������еĶ���������
*/