/*
思路：运用双指针，将收尾交换，再移动指针再交换
*/
class Solution {
    public void reverseString(char[] s) {
        int head = 0;
        int end = s.length-1;
        
        for(int i = 0;i < (s.length - 1)/2;i++){
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
Result：wrong
Input:    ["A"," ","m","a","n",","," ","a"," ","p","l","a","n",","," ","a"," ","c","a","n","a","l",":"," ","P","a","n","a","m","a"]
Output:   ["a","m","a","n","a","P"," ",":","l","a","n","a","c"," "," ","a",",","n","a","l","p"," ","a"," ",",","n","a","m"," ","A"]
Expected: ["a","m","a","n","a","P"," ",":","l","a","n","a","c"," ","a"," ",",","n","a","l","p"," ","a"," ",",","n","a","m"," ","A"]
其实经过对照可以看出，就是在最后边界条件设置不周全
如果是0，1那么交换0次，2，3则一次，4，5就两次。所以结束条件应该是s.length/2而不是(s.length - 1)/2

*/