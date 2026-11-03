class Solution {
    public boolean validPalindrome(String s) {
        int n = s.length();
        int i = 0;
        int j = n-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return isPal(s.substring(i+1, j+1)) || isPal(s.substring(i, j));
            }
            i++;
            j--;
        }
        return true;
    }
    private boolean isPal(String s){
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}