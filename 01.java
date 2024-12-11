import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 0;
        int sum = 0;
        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o valor para a posição " + i +":");
            arr[i] = scanner.nextInt();

            if (i == 0) {
                min = arr[0];
                max = arr[0];
            } else {
                if (arr[i] < min) {
                    min = arr[i];
                }

                if (arr[i] > max) {
                    max = arr[i];
                }
            }

            sum += arr[i];
        }

        System.out.println("Soma de todos os elementos: " + sum);
        System.out.println("Maior elemento: " + max);
        System.out.println("Menor elemento: " + min);
    }
}
