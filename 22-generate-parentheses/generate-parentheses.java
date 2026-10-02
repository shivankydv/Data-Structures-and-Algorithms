class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        generate("", 2*n, ans);
        return ans;
    }
     
    private void generate(String s, int length, List<String> ans){
        if(s.length()==length){
            if(isValid(s)){
                ans.add(s);
            }
            return;
        }
        generate(s+"(", length, ans);
        generate(s+")", length, ans);
    } 

    private boolean isValid(String s){
        int val = 0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                val++;
            }
            else{
                val--;
            }
            if(val<0){
                return false;
            }
        }
        return val==0;
    }
}