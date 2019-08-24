/**
 *思路：将数组转化为int类型，相加得到和，再转化成数组，遍历寻找大于等于2的减去2再进位，最后再转化为字符串
 */
class Solution {
    public String addBinary(String a, String b) {


        int ai = Integer.parseInt(a);
        int bi = Integer.parseInt(b);

        int result = ai + bi;

        StringBuilder sb1 = new StringBuilder(String.valueOf(result));

        sb1.reverse();


        int[] arr1 = new int[sb1.length()];
        for(int i = 0; i < sb1.length(); i++)
        {

            arr1[i] = Integer.parseInt( String.valueOf(sb1.toString().charAt(i)));

        }

        for(int i = 0;i < arr1.length-1;i++){
            if(arr1[i] >= 2){
                arr1[i] -= 2;
                arr1[i+1] += 1;
            }
        }
        if(arr1[arr1.length - 1] >= 2){
            int[] arr2 = new int[arr1.length+1];
            for(int i =0;i<arr1.length-2;i++){
                arr2[i] = arr1[i];
            }
            arr2[arr1.length - 1] = arr1[arr1.length - 1] - 2;
            arr2[arr1.length] = 1;
            StringBuilder sb2 = new StringBuilder();
            for(int i:arr2){
                sb2.append(i);
            }
            return sb2.reverse().toString();
        } else {
            StringBuilder sb3 = new StringBuilder();
            for(int i:arr1){
                sb3.append(i);
            }
            return sb3.reverse().toString();
        }

    }
}
/*
Submission Detail

Runtime Error Message: Line 19: java.lang.NumberFormatException: For input string: "-"
Last executed input: 
"1110110101"
"1110111011"

用Integer来装载二进制的数字太勉强，跟容易就溢出了

*/