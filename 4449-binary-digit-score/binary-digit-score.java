class Solution {
    public int calculateScore(int a, int b) {
        int s1 = Integer.bitCount(a);
        int s2 = Integer.bitCount(b);
        if(s1>=s2){
            return s1*s2;
        }
        return s2/s1;
    }
}