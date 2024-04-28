class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        for (int price : prices) {
            // Update the minimum price seen so far
            minPrice = Math.min(minPrice, price);
            // Update the maximum profit if selling on this day would yield a higher profit
            maxProfit = Math.max(maxProfit, price - minPrice);
        }
        
        return maxProfit;
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] prices = {7, 1, 5, 3, 6, 4};
solution.maxProfit(prices);
    }
}
