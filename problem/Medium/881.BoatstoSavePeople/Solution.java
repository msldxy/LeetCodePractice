/*
*思路：先将数组排序，判断最后一位是否小于船的载重limit，然后再怕末端第一位是否大于船载重的二分之一
*对于剩下的情况
*将最小的与最大的相加，判断时候大于limit，如果大于则最大的索引-1，再继续判断，反之则记录一次，再将最小的索引+1，最大的索引-1，继续递归判断
*当两个索引相等或者前面的索引大于后面的索引的时候递归结束
*
*/

class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int[] flag = new int[people.length];
        Arrays.sort(people);
        if(people[people.length-1]>limit)
            return 0;
        else if(people[0]>limit/2)
            return people.length;
        int head = 0;
        int behind = people.length-1;
        zuhe(people,head,behind,limit,flag);
        int count = 0;
        for (int i : flag) {
            if(i == 1){
                count ++;
            }
        }

        return people.length-count;
    }
    private void zuhe(int[] people,int h,int b,int limit,int[] flag){
        if(h < b) {
            if (people[h] + people[b] <= limit) {
                flag[h] = 1;
                zuhe(people, ++h, --b, limit, flag);
            } else zuhe(people, h, --b, limit, flag);
        }else return;
    }
}

/*
result:
Success		Details->
Runtime: 23 ms, faster than 36.62% of Java online submissions for Boats to Save People.
Memory Usage: 52.5 MB, less than 46.25% of Java online submissions for Boats to Save People.

由结果可知，时间和空间的消耗还有很大的进步空间，接下来的改进可以考虑不使用递归