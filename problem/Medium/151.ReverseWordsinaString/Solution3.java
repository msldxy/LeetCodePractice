class Solution {
    public String reverseWords(String s) {
        String[] strs = s.split(" ");
        StringBuilder sb = new StringBuilder();
        boolean flag = false;	//��һ�������Ƿ���֣�������Ҫ����ԭ�ַ����Ժܶ�ո��β��������õ����ַ�������ǰ��λ���ǡ�����
        int count = 0;
        sb.append("");
        for(int i = strs.length - 1;i>=0;i--){
            if(!strs[i].equals("")){
                flag = true;
                if(i + count == strs.length -1){	//ͨ��i��count�Ĺ�ϵ�ж��Ƿ��ǵ�һ������
                    sb.append(strs[i]);
                } else
                sb.append(" ").append(strs[i]);
            } else {
                if(!flag) count++;	//�ڵ�һ�������ǵ��ʵ�����£���¼���ֵġ����ж��ٸ�
            }
        }
        return sb.toString(); 
    }
}
/*
result��accepted
Runtime: 1 ms, faster than 99.83% of Java online submissions for Reverse Words in a String.
Memory Usage: 37.2 MB, less than 100.00% of Java online submissions for Reverse Words in a String.
����ⷨʹ�����߼����ж��Ƿ��ǵ�һ�����õĵ��ʣ������ǡ�������Ȼ��ʡȥ�˺���ȥ��β�ո�Ĳ���
*/