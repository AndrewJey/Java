import java.util.Scanner;

/**
 * Converts decimal integers to their octal representation safely.
 */
public class DecimalToOctal {

    public static String toOctal(int n) {
        if (n == 0) {
            return "0";
        }
        boolean negative = n < 0;
        long value = Math.abs((long) n);
        StringBuilder sb = new StringBuilder();
        while (value > 0) {
            sb.append(value % 8);
            value /= 8;
        }
        if (negative) {
            sb.append('-');
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Decimal number: ");
            int n = sc.nextInt();
            System.out.println("Octal equivalent: " + toOctal(n));
        }
    }
}
