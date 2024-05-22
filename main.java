import java.util.ArrayList;
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Empregado> empregados = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Criar novo empregado");
            System.out.println("2. Promover empregado");
            System.out.println("3. Aumentar salário do empregado");
            System.out.println("4. Demitir empregado");
            System.out.println("5. Fazer aniversário do empregado");
            System.out.println("6. Mostrar detalhes dos empregados");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    Empregado.criarNovoEmpregado(scanner, empregados);
                    break;
                case 2:
                    Empregado.promoverEmpregado(scanner, empregados);
                    break;
                case 3:
                    Empregado.aumentarSalarioEmpregado(scanner, empregados);
                    break;
                case 4:
                    Empregado.demitirEmpregado(scanner, empregados);
                    break;
                case 5:
                    Empregado.fazerAniversarioEmpregado(scanner, empregados);
                    break;
                case 6:
                    Empregado.mostrarDetalhesEmpregados(empregados);
                    break;
                case 7:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 7);
    }

}
