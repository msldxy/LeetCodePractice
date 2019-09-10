class Solution {
    public int strStr(String haystack, String needle) {
        
        if("".equals(haystack)){
            if("".equals(needle)){
                return 0;
            } else return -1;
        }
        
        int count = 0;
        boolean flag = false;

        for (int i = 0; i < haystack.length(); i++) {
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
Result：wrong

Input: "mississippi"
"pi"
Output: -1
Expected: 9

问题出现的原因是第13行的结束判断条件，因为在本题中，haystack的长度是不断在变化的，所以没有循环到足够的次数

*/