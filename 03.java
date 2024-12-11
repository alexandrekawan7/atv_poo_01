import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double min = Double.MAX_VALUE;
        double max = 0;
        double sum = 0;
        ArrayList<Double> rs = new ArrayList<>();

        while (true) {
            System.out.print("Digite uma nota (ou um número negativo para sair): ");
            double r = scanner.nextDouble();

            if (r < 0) {
                break;
            }

            if (r < min) {
                min = r;
            }

            if (r > max) {
                max = r;
            }

            sum += r;

            rs.add(r);
        }

        rs.sort(null);

        System.out.println("Maior nota: " + max);
        System.out.println("Menor nota: " + min);
        System.out.println("Média das notas: " + sum / rs.size());

        System.out.println("Todas as notas: ");

        for (Double r : rs) {
            System.out.println("* " + r);
        }
    }
}
