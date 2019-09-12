class Solution {
    public void rotate(int[] nums, int k) {
        
        //第一种，暴力硬算
        // if(k == 0) System.out.println(nums.toString());
        // for(int i = 0 ;i < k;i++){
        //     int temp = nums[nums.length-1];
        //     for(int j = nums.length - 1 ; j > 0 ;j--){
        //         nums[j] = nums[j-1];
        //     }
        //     nums[0] = temp;
        // }
        // System.out.println(nums.toString());
        
        
        //第二种，另创一个数组
//         int len = nums.length;
//         k = k % len;
//         int[] res = new int[len];
//         for(int i = 0; i< len;i++){
//             res[i] = nums[i];   
//         }
//         if(k == 0);
//         else{
//             for(int i = 0; i < len; i++){
//             int index = (i+k)%len;
//             nums[index] = res[i];
//             }
//         }
        
        
        //第三种
        /**
         * 可以通过一定的取巧，先把数组倒置，再把前n为倒置，后面的再倒置
         */
		int len = nums.length;
		k = k % len;
		reverse(nums,0,len-1);
		reverse(nums,0,k);
		reverse(nums,k + 1,len-1);
    }
	private void reverse(int[] arr,int start,int end){
		int temp;
		while(start < end){
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
}

/*
result：accepted

*/