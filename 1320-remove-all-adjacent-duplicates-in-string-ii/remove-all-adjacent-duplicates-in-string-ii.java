class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<int[]> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(!st.isEmpty() && st.peek()[0] == ch){
                st.peek()[1]++;
                if(st.peek()[1] == k){
                    st.pop();
                }
            }
            else{
                st.push(new int[]{ch, 1});
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int[] x : st){
            for(int i=0;i<x[1];i++){
                sb.append((char) x[0]);
            }
        }
        return sb.toString();
    }
}