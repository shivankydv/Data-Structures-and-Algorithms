class Solution {
    public int minAddToMakeValid(String s) {
        int bal = 0;
        int add = 0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                bal++;
            }
            else{
                if(bal>0){
                    bal--;
                }
                else{
                    add++;
                }
            }
        }
        return bal+add;
    }
}