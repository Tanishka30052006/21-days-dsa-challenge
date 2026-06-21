public class plusOne {
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        // Test cases
        int[] digits1 = {1, 2, 3};
        int[] result1 = plusOne(digits1);
        printArray(result1);

        int[] digits2 = {9, 9, 9};
        int[] result2 = plusOne(digits2);
        printArray(result2);

        int[] digits3 = {4, 3, 2, 1};
        int[] result3 = plusOne(digits3);
        printArray(result3);

        int[] digits4 = {9};
        int[] result4 = plusOne(digits4);
        printArray(result4);
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}