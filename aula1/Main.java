import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Cadastro cadastro = new Cadastro();

    while (true) {
      System.out.println("1. Cadastrar cliente");
      System.out.println("2. Listar cliente");
      System.out.println("3. Sair");
      System.out.print("Escolha uma opção: ");

      int opcao = scanner.nextInt();
      scanner.nextLine();
      System.out.println("");

      switch (opcao) {
        case 1:
          System.out.println("Digite o nome do cliente: ");
          String nome = scanner.nextLine();
          System.out.println("Digite o email do cliente: ");
          String email = scanner.nextLine();
          System.out.println("Digite o telefone do cliente: ");
          String telefone = scanner.nextLine();
          System.out.println("");
          // Criando cadastro do novo cliente
          Cliente cliente = new Cliente(nome, email, telefone);
          cadastro.cadastrarCliente(cliente);
          break;
        case 2:
          // System.out.println("Lista de cadastros: ");
          // listando todos os clientes
          cadastro.listarClientes();
          System.out.println("");
          break;

        case 3:
          System.out.println("Saindo...");
          scanner.close();
          return;

        default:
          System.out.println("Opção inválida ou vazia... Tente novamente!");
          System.out.println("");
      }
    }
  }
}