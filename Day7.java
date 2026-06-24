class Day7 {
    public int trailingZeroes(int n) {
        int count = 0;
        
        while (n > 0) {
            n /= 5;
            count += n;
        }
        
        return count;
    }   
    
    public static void main(String[] args) {
        Day7 solution = new Day7();
        
        System.out.println("n = 3  → " + solution.trailingZeroes(3));
        System.out.println("n = 5  → " + solution.trailingZeroes(5));
        System.out.println("n = 10 → " + solution.trailingZeroes(10));
        System.out.println("n = 25 → " + solution.trailingZeroes(25));
        System.out.println("n = 0  → " + solution.trailingZeroes(0));
    }
}