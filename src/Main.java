import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int i, j, N;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        N = sc.nextInt();

        for (i = N; i >= 1; i -= 2) {
            for (j = 1; j <= 2 * N; j++) {
                if (j <= i || j > 2 * N - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (i = 1; i <= N; i += 2) {
            for (j = 1; j <= 2 * N; j++) {
                if (j <= i || j > 2 * N - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        }
    }


