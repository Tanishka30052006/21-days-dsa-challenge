public class HappyNumber {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        
        do {
            slow = getSumOfSquares(slow);
            fast = getSumOfSquares(getSumOfSquares(fast));
        } while (slow != fast && slow != 1);
        
        return slow == 1;
    }
    
    private int getSumOfSquares(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num = num / 10;
        }
        return sum;
    }

    // Main method for testing
    public static void main(String[] args) {
        HappyNumber solution = new HappyNumber();
        
        // Test cases
        System.out.println(solution.isHappy(19));  // true
        System.out.println(solution.isHappy(2));   // false
        System.out.println(solution.isHappy(1));   // true
        System.out.println(solution.isHappy(7));   // true
    }
}