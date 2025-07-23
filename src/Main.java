import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int operation = 0;
        double investedCash = 0;
        double yearInvestedCash = investedCash + (investedCash * 0.12);
        int inicialOption = 0;
        double transferValue = 0;

        String textInicialOptions = """
                Tipos de Conta:
                
                1- Conta Corrente
                2- Conta Poupança
                3- Fechar App
                
                Digite a opção desejada:
                """;

        String textAccountOptions = """
                
                Operações:
                
                1- Consultar Saldo
                2- Receber Valor
                3- Transferir Entre Contas
                4- Transferir Para Fora
                5- Sair Desta Conta
                
                Digite a opção desejada:
                """;

        System.out.println("Para inicizar, digite seu nome:");
        String name = scanner.nextLine();
        System.out.println("Primeiro depósito de sua Conta Corrente:");
        double checkingCash = scanner.nextDouble();

        String textDataCheckingAccount = """
                ------------------------------
                Dados do cliente:
                
                Nome:          %s
                Tipo de Conta: Conta Corrente
                Saldo Atual: %.2f
                ------------------------------
                
                """.formatted(name, checkingCash);

        String textDataInvestingAccount = """
                ------------------------------
                Dados do cliente:
                
                Nome:           %s
                Tipo de Conta:  Conta Poupança
                Saldo Atual:    %.2f
                Saldo Em 1 Ano: %.2f
                """.formatted(name, investedCash, yearInvestedCash);

        while (inicialOption != 3) {
            System.out.println(textInicialOptions);
            inicialOption = scanner.nextInt();

            if (inicialOption == 1) {
                System.out.println(textDataCheckingAccount);
                while (operation != 5) {
                    System.out.println(textAccountOptions);
                    operation = scanner.nextInt();

                    switch (operation) {
                        case 1:
                            System.out.println("Seu saldo atual na conta corrente é de: " + checkingCash);
                            break;
                        case 2:
                            System.out.println("Digite o valor a ser recebido:");
                            transferValue = scanner.nextDouble();
                            checkingCash = checkingCash + transferValue;
                            System.out.println("Seu saldo atual é de: " + checkingCash);
                            break;
                        case 3:
                            System.out.println("Digite o valor a ser transferido para a Conta Poupança:");
                            transferValue = scanner.nextDouble();
                            if (transferValue > checkingCash) {
                                System.out.println("Você não possui saldo suficiente para realizar esta transferência!");
                            } else {
                                checkingCash = checkingCash - transferValue;
                                investedCash = investedCash + transferValue;
                                System.out.println("Dinheiro transferido, seu saldo agora é de: " + checkingCash);
                            }
                            break;
                        case 4:
                            System.out.println("Digite o valor a ser transferido:");
                            transferValue = scanner.nextDouble();
                            if (transferValue > checkingCash) {
                                System.out.println("Você não possui saldo suficiente para realizar esta transferência!");
                            } else {
                                checkingCash = checkingCash - transferValue;
                                System.out.println("Dinheiro transferido, seu saldo agora é de: " + checkingCash);
                            }
                            break;
                        case 5:
                            break;
                        default:
                            System.out.println("Opção incorreta, digite novamente:");
                    }
                }
            } else if (inicialOption == 2) {
                System.out.println(textDataInvestingAccount);
                while (operation != 5) {
                    System.out.println(textAccountOptions);
                    operation = scanner.nextInt();

                    switch (operation) {
                        case 1:
                            System.out.println("Seu saldo atual na Poupança é de: " + investedCash);
                            break;
                        case 2:
                            System.out.println("Digite o valor a ser recebido:");
                            transferValue = scanner.nextDouble();
                            if (transferValue > checkingCash) {
                                System.out.println("Você não possui saldo para essa transferência!");
                            } else {
                                investedCash = investedCash + transferValue;
                                System.out.println("Dinheiro recebido, seu saldo Poupança atual é de: " + investedCash);
                            }
                            break;
                        case 3:
                            System.out.println("Digite o valor a ser transferido para a Conta Corrente:");
                            transferValue = scanner.nextDouble();
                            if (transferValue > investedCash) {
                                System.out.println("Você não possui saldo para essa transferência!");
                            } else {
                                investedCash = investedCash - transferValue;
                            }
                            checkingCash = checkingCash + transferValue;
                            System.out.println("Seu saldo atual é de: " + checkingCash);
                            break;
                        case 4:
                            System.out.println("Digite o valor a ser transferido:");
                            double subtractedValue = scanner.nextDouble();
                            if (subtractedValue > checkingCash) {
                                System.out.println("Você não possui saldo suficiente para realizar esta transferência!");
                            } else {
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
            } else {
                break;
            }
        inicialOption = 0;
        }
    }
}