class Solution {
    public boolean checkValidString(String s) {
        int low = 0;
        int high = 0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                low++;
                high++;
            }
            else if(ch == ')'){
                low--;
                high--;
            }
            else{
                low--;
                high++;
            }
            if(high<0){
                return false;
            }
            low = Math.max(0, low);
        }
        return low == 0;
    }
}