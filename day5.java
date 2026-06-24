public class day5 {
    public int findNthDigit(int n) {
        long digitLength = 1;
        long count = 9;
        long start = 1;
        
        while (n > digitLength * count) {
            n -= digitLength * count;
            digitLength++;
            count *= 10;
            start *= 10;
        }
        
        long number = start + (n - 1) / digitLength;
        int digitIndex = (int)((n - 1) % digitLength);
        String numberStr = Long.toString(number);
        
        return numberStr.charAt(digitIndex) - '0';
    }

    public static void main(String[] args) {
        day5 solution = new day5();
        
        // Test cases
        System.out.println("Test 1: n = 3");
        System.out.println("Output: " + solution.findNthDigit(3));
        System.out.println("Expected: 3\n");
        
        System.out.println("Test 2: n = 11");
        System.out.println("Output: " + solution.findNthDigit(11));
        System.out.println("Expected: 0\n");
        
        System.out.println("Test 3: n = 100");
        System.out.println("Output: " + solution.findNthDigit(100));
        System.out.println("Expected: 5\n");
    }
}