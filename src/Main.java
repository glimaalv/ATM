import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int operation = 0;
        double checkingCash = 0;
        double investedCash = 0;
        double yearInvestedCash = investedCash + (investedCash*0.12);
        int inicialOption = 0;

        String textInicialOptions = """
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

        do{
            System.out.println(textInicialOptions);
            inicialOption = scanner.nextInt();

            if (inicialOption == 1) {
                System.out.println(textDataCheckingAccount);
                while (operation != 5) {
                    System.out.println(textOperations);
                    operation = scanner.nextInt();

                    switch (operation) {
                        case 1:
                            System.out.println(textInicialOptions);
                            break;
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

                System.out.println(textDataInvestingAccount);
                while (operation != 5) {
                    System.out.println(textOperations);
                    operation = scanner.nextInt();

                    switch (operation) {
                        case 1:
                            System.out.println(textInicialOptions);
                            break;
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
            }else if (inicialOption == 2) {
                System.out.println(textDataInvestingAccount);
                while (operation != 5) {
                    System.out.println(textOperations);
                    operation = scanner.nextInt();

                    switch (operation) {
                        case 1:
                            System.out.println(textInicialOptions);
                            break;
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
            } else{
                break;
            }
        }while (inicialOption != 3);
    }
}