public class Pattern11 {
    public static void main(String[] args) {
        pattern1(5); 
    }

    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            // For every row, run the col
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after printing a row
        }
    }
}