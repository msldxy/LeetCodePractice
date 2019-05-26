/**
 *根据排序二叉树的特性可知，如果一个节点在另外两个节点中间，那么它的值也在这两个节点的值中间
 *
 *所以初步思路
 *从根节点开始与给出的节点进行判断，如果比两个节点都小，那么取右边的子节点，再重复之前的操作（递归），如果都大则反之往左节点
 *如果在两个节点的值之间，那么用加上这个数，再分别取左右节点重复之前的操作
 *最后如果等于某个节点的值，则取该节点，不再递归
 *
 
 *由于关于树的数据结构还未学习（代码实现等），所以这道题暂时搁置
 
 
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int rangeSumBST(TreeNode root, int L, int R) {
        AeeayList<Integer> array = root;
        int sum;
        for(Integer i:array){
            if(i != null && i > L && i < R){
                sum+=array[i];
            }
        }
        return sum;
    }
}