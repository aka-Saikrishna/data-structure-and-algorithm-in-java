class Solution {
    public List<List<Integer>> generate(int numRows) {
         List<List<Integer>> triangle = new ArrayList<>();

        // Base case: first row contains only 1
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);

        // Generate subsequent rows
        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = triangle.get(i - 1);
            List<Integer> currRow = new ArrayList<>();

            // First element of each row is always 1
            currRow.add(1);

            // Calculate middle elements based on previous row
            for (int j = 1; j < i; j++) {
                currRow.add(prevRow.get(j - 1) + prevRow.get(j));
            }

            // Last element of each row is always 1
            currRow.add(1);

            // Add current row to triangle
            triangle.add(currRow);
        }

        return triangle;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int numRows = 5;
        List<List<Integer>> pascalsTriangle = solution.generate(numRows);
        System.out.println(pascalsTriangle);
    }
}