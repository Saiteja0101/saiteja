public class PrimeNumbers {
    public static void main(String[] args) {
        int i, j;
        boolean isPrime;

        System.out.println("Prime numbers from 1 to 100 are:");
        for (i = 2; i <= 100; i++) {
            isPrime = true;

            for (j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
