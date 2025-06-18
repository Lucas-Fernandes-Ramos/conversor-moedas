import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ConsultaMoeda objMoeda = new ConsultaMoeda();
        String moedaDestino, moedaOrigem;
        double moeda;
        int opcao;

        System.out.println("Projeto Conversor de Moedas: ");
        Scanner entrada = new Scanner(System.in);
        Scanner ValorUsuario = new Scanner(System.in);


        do {
            System.out.println("  1 - Dolar           ======> Peso Argentino");
            System.out.println("  2 - Dolar           ======> Real Brasileiro");
            System.out.println("  3 - Real Brasileiro ======> Peso Argentino");
            System.out.println("  4 - Real Brasileiro ======> Dólar canadense");
            System.out.println("  5 - Real Brasileiro ======> Euro");
            System.out.println("  6 - EURO            ======> Real Brasileiro");
            System.out.println("  7 - Sair");

            System.out.print("Opção: ");

            opcao = entrada.nextInt(); //controle do loop

            switch (opcao) {
                case 1:

                    System.out.println("Digite o valor do Dolar para obter a conversao: ");

                    moeda = ValorUsuario.nextDouble();

                    moedaOrigem = "USD";
                    moedaDestino = "ARS";

                    System.out.println("-------------------------------------------------");
                    objMoeda.buscaMoeda(moedaOrigem, moedaDestino, moeda);
                    System.out.println(" Dolar[USD] ======> [ARS]Peso Argentino");
                    System.out.println("--------------------------------------------------\n\n");

                    break;
                case 2:

                    System.out.println("Digite o valor do Dolar para obter a conversao: ");

                    moeda = ValorUsuario.nextDouble();

                    moedaOrigem = "USD";
                    moedaDestino = "BRL";

                    System.out.println("--------------------------------------------------");
                    objMoeda.buscaMoeda(moedaOrigem, moedaDestino, moeda);
                    System.out.println(" Dolar[USD] ======> [BRL]-Real Brasileiro]");
                    System.out.println("--------------------------------------------------\n\n");
                    break;

                case 3:

                    System.out.println("Digite o valor do Real Brasileiro para obter a conversao: ");

                    moeda = ValorUsuario.nextDouble();

                    moedaOrigem = "BRL";
                    moedaDestino = "ARS";

                    System.out.println("--------------------------------------------------");
                    objMoeda.buscaMoeda(moedaOrigem, moedaDestino, moeda);
                    System.out.println(" Real Brasileiro [BRL] ======> [ARS]-Peso Argentino");
                    System.out.println("--------------------------------------------------\n\n");
                    break;

                case 4:
                    System.out.println("Digite o valor do Real Brasileiro para obter a conversao: ");

                    moeda = ValorUsuario.nextDouble();

                    moedaOrigem = "BRL";
                    moedaDestino = "CAD";

                    System.out.println("--------------------------------------------------");
                    objMoeda.buscaMoeda(moedaOrigem, moedaDestino, moeda);
                    System.out.println(" Real Brasileiro [BRL] ======> [CAD]-Dólar canadense");
                    System.out.println("--------------------------------------------------\n\n");
                    break;
                case 5:
                    System.out.println("Digite o valor do Real Brasileiro para obter a conversao: ");

                    moeda = ValorUsuario.nextDouble();

                    moedaOrigem = "BRL";
                    moedaDestino = "EUR";

                    System.out.println("--------------------------------------------------");
                    objMoeda.buscaMoeda(moedaOrigem, moedaDestino, moeda);
                    System.out.println(" Real Brasileiro [BRL] ======> [EUR]- EURO");
                    System.out.println("--------------------------------------------------\n\n");
                    break;
                case 6:
                    System.out.println("Digite o valor do EURO para obter a conversao: ");

                    moeda = ValorUsuario.nextDouble();

                    moedaOrigem = "EUR";
                    moedaDestino = "BRL";

                    System.out.println("--------------------------------------------------");
                    objMoeda.buscaMoeda(moedaOrigem, moedaDestino, moeda);
                    System.out.println("  EURO [EUR] ======> [BRL]- Real Brasileiro");
                    System.out.println("--------------------------------------------------\n\n");
                    break;

                case 7:
                    System.out.println("\n10 - Sair");
                    System.out.println("\nFinalizando a aplicação");
                    break;
            }
        } while (opcao != 7);

        entrada.close();


    }
}
