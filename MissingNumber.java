public class MissingNumber {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        
        for (int num : nums) {
            actualSum += num;
        }
        
        return expectedSum - actualSum;
    }

    // Main method for testing
    public static void main(String[] args) {
        MissingNumber solution = new MissingNumber();
        
        // Test case 1
        int[] nums1 = {3, 0, 1};
        System.out.println("Missing number: " + solution.missingNumber(nums1)); // Output: 2
        
        // Test case 2
        int[] nums2 = {0, 1};
        System.out.println("Missing number: " + solution.missingNumber(nums2)); // Output: 2
        
        // Test case 3
        int[] nums3 = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println("Missing number: " + solution.missingNumber(nums3)); // Output: 8
    }
}