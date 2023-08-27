import java.util.InputMismatchException;
import java.util.Scanner;

public class fluxoDeCaixaGui {
    public static void main(String[] args) {

        Scanner scannerDaPagina = new Scanner(System.in);


        System.out.println("Qual é seu nome?");
        String nome = scannerDaPagina.nextLine();

        System.out.println("Digite o nome do seu banco?");
        String cpf = scannerDaPagina.nextLine();

        System.out.println("Qual é o tipo da sua conta, corrente ou poupança?");
        String tipo = scannerDaPagina.nextLine();

        int saldoInicial = 1000;


        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("""
                **************************
                Nome: %s
                Tipo: %s
                Saldo inicial: %d
                **************************
                """.formatted(nome, tipo, saldoInicial));

        System.out.println();
        System.out.println();
        System.out.println("Seu saldo atual é de R$" + saldoInicial);
        System.out.println();
        System.out.println();


        for (int j = 0; j < 99999; ) {

            System.out.println("""                    
                    Escolha uma das opções abaixo:
                    
                     1 - Consultar saldos
                     2 - Receber valor
                     3 - Transferir valor
                     4 - Sair     
                         """);


            String opcaoEscolhida = scannerDaPagina.next();
            System.out.println("Você escolheu a opção de número: "+opcaoEscolhida);
            System.out.println();

            if (opcaoEscolhida.equals("1")) {
                System.out.println("Seu saldo atual é de R$" + saldoInicial);
                System.out.println();
                System.out.println();
            }

            else if (opcaoEscolhida.equals("2")) {
                System.out.println("Informe o valor a ser depositado: ");



                try {
                    int valorAReceber = scannerDaPagina.nextInt();
                    int saldoAtualizado = saldoInicial + valorAReceber;
                    saldoInicial = saldoAtualizado;
                    System.out.println();
                    System.out.println();


                    System.out.println("Valor depositado com sucesso, saldo atual em: " + saldoAtualizado);
                    System.out.println();
                    System.out.println();
                } catch (InputMismatchException e) {
                    System.out.println("Informe um valor numérico...");

                }
            }


            else if (opcaoEscolhida.equals("3")) {
                for (int i = 0; i < 99999; ) {
                    System.out.println("Informe o valor que deseja transferir:");

                    try {
                        int valorASerTransferido = scannerDaPagina.nextInt();

                        if (valorASerTransferido < saldoInicial) {
                            int saldoNegativoAtualizado = saldoInicial - valorASerTransferido;
                            saldoInicial = saldoNegativoAtualizado;
                            System.out.println("Valor de R$" + valorASerTransferido +
                                    " reais foi transferido com sucesso, " +
                                    "saldo atual é de R$ " + saldoNegativoAtualizado);
                            break;
                        } else if (valorASerTransferido > saldoInicial) {
                            System.out.println("Não há saldo o suficiente, digite um valor menor que:" + saldoInicial);
                        }

                    }

                    catch (InputMismatchException e) {
                        System.out.println("Entrada inválida, digite um valor númerico...");
                        System.out.println();
                        System.out.println();

                        break;
                    }
                }} else if (opcaoEscolhida.equals("4")) {
                System.out.println("Aplicação encerrada");
                break;
            } else {
                System.out.println ();
                System.out.println("Opção inválida, digite novamente...");

                System.out.println();System.out.println();

            }
        }
    }

}











