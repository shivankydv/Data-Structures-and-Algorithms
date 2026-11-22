class Solution {
    public boolean checkString(String s) {
        boolean found = false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='b'){
                found = true;
            }
            if(s.charAt(i)=='a' && found){
                return false;
            }
        }
        return true;
    }
}