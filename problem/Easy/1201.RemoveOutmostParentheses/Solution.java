/*
*初步设想：
*设一个flag，遍历字符串，遇到'('则flag++，遇到')'则flag--，那么当flag==0时，就可以知道大括号闭合了
*这时候截取这其中的字符串添加到StringBuilder中。
*最后就能得到去掉了大括号之后的字符串了
*/

class Solution {
    public String removeOuterParentheses(String S) {
        StringBuilder sb = new StringBuilder();
        int flag = 0;		//indicator to determine whether the parantheses are closed
        int index = 0;		//the index of the big parantheses's ')'
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if(c == '('){
                flag++;
            } else flag--;

            if(flag == 0){	//big parantheses is closed;
                sb.append(S.substring(index+1,i));	//get the String of the big parantheses
                index = i+1;
            }
        }
        return sb.toString();
    }
}

/*Result:
	Success		Details->
			Runtime: 3 ms, faster than 70.84% of Java online submissions for Remove Outermost Parentheses.
			Memory Usage: 35 MB, less than 100.00% of Java online submissions for Remove Outermost Parentheses.
	
	The Runtime is a little large,which should be improved,