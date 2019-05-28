/*
初步思路，再定义一个数组B，然后遍历A，偶数从左往右放，奇数从右往左放
*/
class Solution {
    public int[] sortArrayByParity(int[] A) {
        int left = 0;
        int right = A.length-1;
        int[] B = new int[A.length];
        for(int i = 0;i < A.length;i++){
            int num = A[i];
            if(num%2==0){
                B[left] = A[i];
                left++;
            }else{
                B[right] = A[i];
                right--;
            }
        }
        
        return B;
    }
}
/*
Success		Details->
Runtime: 1 ms, faster than 100.00% of Java online submissions for Sort Array By Parity.
Memory Usage: 40.4 MB, less than 90.43% of Java online submissions for Sort Array By Parity.

时间复杂度没问题，不过额外创建了一个数组，所以耗费了一定的空间
有想到在数组内交换位置，类似于快排的左右两个索引往中逼近，将在接下来进一步完善
*/