class Solution {
    public String removeOuterParentheses(String s) {
        int n = s.length();
        int count = 0;
        String ans = "";
        boolean flag = true;
        for (int i=0; i<n; i++) {
            if (s.charAt(i)=='(') {
                count++;
            }
            else {
                count--;
            }
            if (count==1 && flag==true) {
                flag = false;
                continue;
            }
            if (count==0 && flag==false) {
                flag = true;
                continue;
            }
            ans += s.charAt(i);
        }
        return ans;
    }
}