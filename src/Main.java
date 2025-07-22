import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int operation = 0;
        double cash = 0;
        String userData = """
                ------------------------------
                Dados do cliente:
                
                Nome:          Gustavo Alves
                Tipo de Conta: Conta Corrente
                Saldo Inicial: %f
                ------------------------------
                
                """.formatted(cash);

        String textOptions = """
                
                Operações:
                
                1- Consultar Saldo
                2- Receber Valor
                3- Transferir Valor
                4- Sair
                
                Digite a opção desejada:
                """;

        System.out.println(userData);

        while (operation != 4){
            System.out.println(textOptions);
            operation = scanner.nextInt();

            switch (operation) {
                case 1:
                    System.out.println("Seu saldo atual é de: " + cash);
                    break;
                case 2:
                    System.out.println("Digite o valor a ser recebido:");
                    double addedValue = scanner.nextDouble();
                    cash = cash + addedValue;
                    System.out.println("Seu saldo atual é de: " + cash);
                    break;
                case 3:
                    System.out.println("Digite o valor a ser transferido:");
                    double subtractedValue = scanner.nextDouble();
                    if (subtractedValue > cash){
                        System.out.println("Você não possui saldo suficiente para realizar esta transferência!");
                    } else{
                        cash = cash - subtractedValue;
                        System.out.println("Dinheiro transferido, seu saldo agora é de: " + cash);
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opção incorreta, digite novamente:");
            }

        }

        /*System.out.println("""
                Para iniciar sua conta, digite:
                Seu nome:
                Saldo inicial:
                """);
        String name = scanner.nextLine();
        double currentBalance = scanner.nextDouble();

        String inicialPage = """
                -----------------------------------------------------
                  Dados iniciais do cliente:
                  Nome:          %s
                  Tipo de Conta: Corrente
                  Saldo Inicial: %f
                -----------------------------------------------------
                | Operações:                                        |
                | 1- Consultar Saldo                                |
                | 2- Receber Valor                                  |
                | 3- Transferir Valor                               |
                | 4- Sair                                           |
                -----------------------------------------------------
                  Digite a opção desejada:
                -----------------------------------------------------
                """.formatted(name, currentBalance);

        int option = 0;
        while (option!=4){
            System.out.println(inicialPage);
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Seu saldo atual é de: " + currentBalance);
                    break;
                case 2:
                    System.out.println("Digite o valor a ser recebido:");
                    double addedValue = scanner.nextDouble();
                    currentBalance = currentBalance + addedValue;
                    System.out.println(textBalance);
                    break;
                case 3:
                    System.out.println("Digite o valor a ser transferido:");
                    double subtractedValue = scanner.nextDouble();
                    if (subtractedValue > currentBalance){
                        System.out.println("Você não possui saldo suficiente para realizar esta transferência!");
                    } else{
                        currentBalance = currentBalance - subtractedValue;
                        System.out.println(textBalance);
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opção incorreta, digite novamente:");
            }
        }*/

        /*switch (option) {
            case 1:
                System.out.println(textBalance);
                break;
            case 2:
                System.out.println("Digite o valor a ser recebido:");
                double addedValue = scanner.nextDouble();
                currentBalance += addedValue;
                System.out.println(textBalance);
                break;
            case 3:
                System.out.println("Digite o valor a ser transferido:");
                double subtractedValue = scanner.nextDouble();
                currentBalance -= subtractedValue;
                System.out.println(textBalance);
                break;
            case 4:
                break;
            default:
                System.out.println("Opção incorreta, digite novamente:");
        }*/
    }
}