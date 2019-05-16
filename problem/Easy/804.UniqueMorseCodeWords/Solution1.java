/**
*初步想法
*定义一个字符串数组储存摩斯电码，其按照索引0-25即是字符‘a’到‘z’对应的码，所以在外面给出的字符串数组中
*将每一个字母-‘a’，即将ASCII码减去48，那么得到的值刚好就可以对应上面字符串数组的索引了
*
*/
class Solution {
    public int uniqueMorseRepresentations(String[] words) {
		
		//电码数组
        String[] morse ={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","  -.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
		ArrayList<String> arr_str = new ArrayList<>();
		for(String word:words){
			StringBuilder code = new StringBuilder();
			for(char ch:word.toCharArray()){
				code.append(morse[ch - 'a']);
			}
			String cd = code.toString();
			if(!arr_str.contains(cd))
				arr_str.add(cd);
		}
        return arr_str.size();
    
	}
}

/*Wrong Answer		Details
Input	["rwjje","aittjje","auyyn","lqtktn","lmjwn"]
Output
2
Expected
1

第一次提交是错误的，暂时还没想清楚是什么原因
*/