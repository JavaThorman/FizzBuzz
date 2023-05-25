public class FizzBuzz {

    public static void main(String[] args) {

        // 3 % 3 = 0 Fizz
        // 5 % 5 = 0 Buzz
        // 3 % 3 = 0 && 5 % 5 = 0 FizzBuzz

        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }

        }
    }
}