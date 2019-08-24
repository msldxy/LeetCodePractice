/*
思路：将字符串转化为字符数组，遍历相加，最后进位判断

之前一直陷入一个思维误区，即直接把两个数组遍历相加，这样遍历的时候要按最长的循环，其中间还要判断是否到了短的的场电影。
后来偶然间看到的思路（也是当初短路了没想到）再初始化一个数组，长度比最长的大1，便于进位，然后分别进行两个相加，把两个数组分别遍历加进来
最后判断大于等于2 的进位，以及第一位没有进位的则转换成字符串之后就不要0了。
*/
class Solution {
    public String addBinary(String a, String b) {
        
        StringBuilder a1 = new StringBuilder(a);
        StringBuilder b1 = new StringBuilder(b);

        //将字符串反转后转化为字符数组
        char[] a2 = a1.reverse().toString().toCharArray();
        char[] b2 = b1.reverse().toString().toCharArray();

        int lena = a2.length;
        int lenb = b2.length;

        int len = lena > lenb ? lena : lenb;
        len++;

        //创建一个比最长子数组长1的数组，便于最后储存进位
        char[] res = new char[len];

        //先全部设为0，再分别加上两个数组
        for (int i = 0; i < len; i++) res[i]='0';
        for (int i = 0; i < lena; i++) res[i] += a2[i] - 48;
        for (int i = 0; i < lenb; i++) res[i] += b2[i] - 48;

        //遍历数组，大于等于2的减去2再进一位
        for (int i = 0; i < len - 1; i++) {
            if(res[i] >= 50){
                res[i] -= 2;
                res[i+1] += 1;
            }
        }

        StringBuilder sb = new StringBuilder();
        if(res[len-1] == '1') sb.append(1);
        for (int i = len - 2; i >= 0 ; i--) {
            sb.append(res[i]);
        }

        return sb.toString();
    }
}

/*Result:
Success
Details:
Runtime: 1 ms, faster than 100.00% of Java online submissions for Add Binary.
Memory Usage: 36.3 MB, less than 100.00% of Java online submissions for Add Binary.
Next challenges: 
*/