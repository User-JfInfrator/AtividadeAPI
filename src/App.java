import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tipo de veículo que deseja consultar: " + "Ex: carros, motos ou caminhoes");
        String veiculo = sc.next();
        System.out.println("Digite o código da marca do veículo:");
        int codigo = sc.nextInt();
        ConsumoApi consumoApi = new ConsumoApi();
        String dadosVeiculo = consumoApi.buscaVeiculosMarcas(veiculo, codigo);
        System.out.println("Dados do veículo: ");
        System.out.println(dadosVeiculo + "\n");

        sc.close();
    }
}
