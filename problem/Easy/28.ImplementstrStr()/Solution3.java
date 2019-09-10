class Solution {
    public int strStr(String haystack, String needle) {
        
        if("".equals(haystack)){
            if("".equals(needle)){
                return 0;
            } else return -1;
        }
        
        int count = 0;
        boolean flag = false;
        int fori = haystack.length();

        for (int i = 0; i < fori; i++) {
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
Result��accept
Runtime: 45 ms	Your runtime beats 11.09 % of java submissions.
Memory Usage: 36.8 MB

Ŀǰ����ⷨʱ�临�Ӷ�̫���ˣ���ΪҪ�����ܶ��String����Ҫ�з֣�ͨ���۲���˵Ľⷨ��֪
�����Լ���startwith�����������Ϥ�������ط������и��������ж��Ƿ�Ӹ�������ʼ
*/