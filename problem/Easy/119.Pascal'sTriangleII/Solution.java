/*
找到规律即是，对于有k个元素的数组，从第一位开始值分别为C(1,k),C(2,k)...C(k-2,k),C(k-1,k),C(k,k)即是排列组合中的c
*/

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        
        if(rowIndex == 0) return intList;
        long tempres = 1;
        int bel = 1;
        int num = rowIndex;
        for(int i = 1;i < rowIndex + 1;i++){
            tempres = tempres*num;
            tempres = tempres/bel;
            intList.add((int)tempres);
            num--;
            bel++;
        }
        return intList;
    }
}
/*
result：accepted
Runtime: 0 ms
Memory Usage: 33.7 MB	空间比大部分的要多一些。
*/