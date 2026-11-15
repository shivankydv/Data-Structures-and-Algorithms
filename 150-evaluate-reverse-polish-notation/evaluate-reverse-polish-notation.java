class Solution {
    public int evalRPN(String[] token) {
        Stack<Integer> st = new Stack<>();
        for(String s : token){
            if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")){
                int b = st.pop();
                int a = st.pop();
                if(s.equals("+")){
                    st.push(a+b);
                }
                else if(s.equals("-")){
                    st.push(a-b);
                }
                else if(s.equals("*")){
                    st.push(a*b);
                }
                else{
                    st.push(a/b);
                }
            }
            else{
                st.push(Integer.parseInt(s));
            }
        }
        return st.pop();
    }
}