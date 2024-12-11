import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> cities = new ArrayList<>();

        while (true) {
            System.out.println("Opções:");
            System.out.println("1. Adicionar nova cidade");
            System.out.println("2. Remover cidade pelo nome");
            System.out.println("3. Exibir todas as cidades");
            System.out.println("4. Verificar se cidade está cadastrada");
            System.out.println("5. Sair");

            System.out.print("Selecione uma opção: ");
            int option = scanner.nextInt();


            scanner.nextLine();

            if (option == 1) {
                System.out.print("Digite o nome da cidade: ");
                cities.add(scanner.nextLine());
            } else if (option == 2) {
                System.out.print("Digite o nome da cidade: ");
                String city = scanner.nextLine();

                if (cities.contains(city)) {
                    cities.remove(city);
                    System.out.println("Cidade removida!");
                } else {
                    System.out.println("A cidade não está cadastrada!");
                }
            } else if (option == 3) {
                System.out.println("Listando cidades: ");

                for (String city : cities) {
                    System.out.println("* " + city);
                }
            } else if (option == 4) {
                System.out.print("Digite o nome da cidade: ");
                String city = scanner.nextLine();

                if (cities.contains(city)) {
                    System.out.println("Cidade cadastrada!");
                } else {
                    System.out.println("Cidade não cadastrada!");
                }
            } else if (option == 5) {
                System.out.println("Saindo...");
                break;
            } else {
                System.out.println("Opção inválida!");
            }
        }
    }
}
