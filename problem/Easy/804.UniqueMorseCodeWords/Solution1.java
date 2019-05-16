/**
*初步想法
*定义一个字符串数组储存摩斯电码，其按照索引0-25即是字符‘a’到‘z’对应的码，所以在外面给出的字符串数组中
*将每一个字母-‘a’，即将ASCII码减去48，那么得到的值刚好就可以对应上面字符串数组的索引了
*
*经过输出校验，发现在给出错误事例的答案"rwjje","aittjje","auyyn","lqtktn","lmjwn"中
*前面两个相同，后面三个相同，而两者只是最后一点不一样，所以推测出可能是字母‘n’出问题了
*去代码中查找发现，字母‘n’对应的摩斯电码为“  -.”，比题中给出的多了两个空格。猜测是在将摩斯电码复制到代码的时候
*由于自动换行而导致缩进了两格
*/
class Solution {
    public int uniqueMorseRepresentations(String[] words) {
		
		//电码数组
        String[] morse ={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
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


///*Wrong Answer		Details
//Input	["rwjje","aittjje","auyyn","lqtktn","lmjwn"]
//Output
//2
//Expected
//1
//
//第一次提交是错误的，暂时还没想清楚是什么原因
//*/

/**
 *Success  Details->
 * Runtime: 1 ms, faster than 100.00% of Java online submissions for Unique Morse Code Words.
 * Memory Usage: 34.7 MB, less than 97.97% of Java online submissions for Unique Morse Code Words.
 * 
 *The result is true.From the details we can konw ,it's nearly perfect.
 */