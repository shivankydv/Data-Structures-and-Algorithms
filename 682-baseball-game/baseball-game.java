class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(String s : operations){
            int n = ans.size();
            if(s.equals("C")){
                ans.remove(n-1);
            }
            else if(s.equals("D")){
                ans.add(2*(ans.get(n-1)));
            }
            else if(s.equals("+")){
                ans.add(ans.get(n-1)+ans.get(n-2));
            }
            else{
                ans.add(Integer.parseInt(s));
            }
        }
        int sum = 0;
        for(int num : ans){
            sum += num;
        }
        return sum;
    }
}