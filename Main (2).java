public class Main {
    public static void main(String[] args) {
        System.out.println(countNumbersWithUniqueDigits(3));
        System.out.println("Hello world!");
    }


    public static int countNumbersWithUniqueDigits(int n) {
        if (n == 0) {
            return 1;
        }

        int result = 10;
        int uniqueDigits = 9;
        int availableDigits = 9;

        for (int i = 2; i <= n && availableDigits > 0; i++) {
            uniqueDigits = uniqueDigits * availableDigits;
            result += uniqueDigits;
            availableDigits--;
        }

        return result;
    }


}