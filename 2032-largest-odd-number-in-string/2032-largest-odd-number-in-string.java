class Solution {
    public String largestOddNumber(String num) {
        if (num.length() == 0)
            return "";
        else {
            String odd = "13579";
            for (int i = num.length()-1; i >= 0; i--) {
                if (odd.indexOf(num.charAt(i)) >= 0)
                    return num.substring(0, i + 1);
            }
        }
        return "";
    }
}