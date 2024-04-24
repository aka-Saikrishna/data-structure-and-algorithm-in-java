class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int[] nums1 = new int[m];
        for (int i = 0; i < m; i++) {
            nums1[i] = scanner.nextInt();
        }
        
        int n = scanner.nextInt();
        int[] nums2 = new int[n];

        for (int i = 0; i < n; i++) {
            nums2[i] = scanner.nextInt();
        }
        
        solution.merge(nums1, m, nums2, n);

        for (int i = 0; i < m + n; i++) {
            System.out.print(nums1[i] + " ");
        }
        
        scanner.close();
    }
}
