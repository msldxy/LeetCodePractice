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
Result：accept
Runtime: 45 ms	Your runtime beats 11.09 % of java submissions.
Memory Usage: 36.8 MB

目前这个解法时间复杂度太高了，因为要创建很多的String对象还要切分，通过观察别人的解法得知
还是自己对startwith这个方法不熟悉，有重载方法就有给定索引判断是否从该索引开始
*/