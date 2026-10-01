class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();
        for(char digit : num.toCharArray()){
            while(!stack.isEmpty() && k > 0 && stack.peek()>digit){
                stack.pop();
                k--;
            }
            stack.push(digit);
        }
        while(k>0){
            stack.pop();
            k--;
        }
        StringBuilder ans = new StringBuilder();
        for(char x : stack){
            ans.append(x);
        }  
        int i = 0;
        while (i < ans.length() - 1 && ans.charAt(i) == '0') {
            i++;
        }
        if(ans.length()==0){
            return "0";
        }
        return ans.substring(i);
    }
}