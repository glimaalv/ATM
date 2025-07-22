import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int operation = 0;
        double checkingCash = 0;
        double investedCash = 0;
        double yearInvestedCash = investedCash + (investedCash*0.12);

        String textAccountType = """
                Tipos de Conta:
                
                1- Conta Corrente
                2- Conta Poupança
                3- Fechar App
                
                Digite a opção desejada:
                """;

        String textOperations = """
                
                Operações:
                
                1- Página Inicial
                2- Consultar Saldo
                3- Receber Valor
                4- Transferir Valor Para A Outra Conta
                5- Sair Desta Conta
                
                Digite a opção desejada:
                """;

        System.out.println("Para inicizar, digite seu nome:");
        String name = scanner.nextLine();

        String userDataCheckingAccount = """
                ------------------------------
                Dados do cliente:
                
                Nome:          %s
                Tipo de Conta: Conta Corrente
                Saldo Atual: %.2f
                ------------------------------
                
                """.formatted(name, checkingCash);

        String userDataInvestingAccount = """
                ------------------------------
                Dados do cliente:
                
                Nome:           %s
                Tipo de Conta:  Conta Poupança
                Saldo Atual:    %.2f
                Saldo Em 1 Ano: %.2f
                """.formatted(name, investedCash, yearInvestedCash);

        System.out.println(textAccountType);
        while (operation != 3){

        }

        System.out.println(userDataCheckingAccount);

        while (operation != 5){
            System.out.println(textOperations);
            operation = scanner.nextInt();

            switch (operation) {
                case 1:
                    System.out.println(userDataCheckingAccount);
                case 2:
                    System.out.println("Seu saldo atual é de: " + checkingCash);
                    break;
                case 3:
                    System.out.println("Digite o valor a ser recebido:");
                    double addedValue = scanner.nextDouble();
                    checkingCash = checkingCash + addedValue;
                    System.out.println("Seu saldo atual é de: " + checkingCash);
                    break;
                case 4:
                    System.out.println("Digite o valor a ser transferido:");
                    double subtractedValue = scanner.nextDouble();
                    if (subtractedValue > checkingCash){
                        System.out.println("Você não possui saldo suficiente para realizar esta transferência!");
                    } else{
                        checkingCash = checkingCash - subtractedValue;
                        System.out.println("Dinheiro transferido, seu saldo agora é de: " + checkingCash);
                    }
                    break;
                case 5:
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