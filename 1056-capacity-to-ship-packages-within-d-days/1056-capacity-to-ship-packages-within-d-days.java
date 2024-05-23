
class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = 0, right = 0;
        
        // Find the minimum and maximum capacity required for the ship
        for (int w : weights) {
            left = Math.max(left, w); // minimum capacity should be able to handle the heaviest package
            right += w; // maximum capacity should be able to handle all packages
        }
        
        // Use binary search to find the least weight capacity required for the ship
        while (left < right) {
            int mid = (left + right) / 2;
            int need = 1, cur = 0;
            
            // Count the number of days required to ship all packages with current mid capacity
            for (int w : weights) {
                if (cur + w > mid) { // current capacity can't handle the current package
                    need++; // increment the number of days required
                    cur = 0; // reset the current capacity
                }
                cur += w; // add the current package to the current capacity
            }
            
            // If the number of days required is greater than the given number of days, increase the weight capacity
            if (need > days) {
                left = mid + 1;
            } 
            // If the number of days required is less than or equal to the given number of days, decrease the weight capacity
            else {
                right = mid;
            }
        }
        
        // Return the least weight capacity required to ship all packages within the given number of days
        return left;
    }

}