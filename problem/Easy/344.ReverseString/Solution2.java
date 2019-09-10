class Solution {
    public void reverseString(char[] s) {
        if(s.length == 0 || s.length == 1) {
            return;
        }
        int head = 0;
        int end = s.length-1;
        
        for(int i = 0;i < s.length/2;i++){
            swap(s,head,end);
            head++;
            end--;
        }
    }
    
    private void swap(char[] s,int l,int r){
        char temp = s[l];
        s[l] = s[r];
        s[r] = temp;
    }
    
}
/*
result：accept
Runtime: 1 ms
Memory Usage: 52.7 MB #memory usage比较多，推测是变量用得比较多
由于该主题是双指针的，于是使用双指针
以下是空间较少的：
class Solution {
    public void reverseString(char[] s) {
        int length = s.length -1;
        for(int i = 0;i < s.length/2;i++){
            char temp = s[i];
            s[i] = s[length-i];
            s[length-i] = temp;

        }
    }   
}

*/