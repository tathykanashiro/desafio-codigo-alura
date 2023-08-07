import java.util.Scanner;

public class Desafio {
    public static void main(String Args[]){
        Scanner ler = new Scanner(System.in);

        String nome = "Brad Pitt";
        String tipoConta = "Corrente";
        double saldo = 1599.99;
        int opcao = 0;

        System.out.println("----------------------------------");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo da conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n----------------------------------");

        String menu = """
                
                ** Digite sua opção **
                
                1 - Consultar saldo
                2 - Tranferir valor
                3 - Receber valor
                4 - Sair
                """;

        while(opcao != 4){
            System.out.println(menu);
            opcao = ler.nextInt();

            if (opcao == 1){
                System.out.println("O saldo atualizado é " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor que deseja transferir?");
                double valor = ler.nextDouble();
                if(valor > saldo){
                    System.out.println("Não há saldo para realizar a transferência");
                } else {
                    saldo -= valor;
                    System.out.println("Novo saldo: " + saldo);
                }
            } else if (opcao == 3){
                System.out.println("Valor recebido: ");
                double valor = ler.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo: " + saldo);
            }else if (opcao != 4){
                System.out.println("Opção invalida!");

            }
        }

    }
}
