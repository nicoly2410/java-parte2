import java.util.ArrayList;
import java.util.List;

import org.junit.experimental.results.ResultMatchers;

public class Cadastro {
  private List<Cliente> clientes;

  public Cadastro() {
    this.clientes = new ArrayList<Cliente>();
  }

  public void cadastrarCliente(Cliente cliente) {
    clientes.add(cliente);
    System.out.println("Cliente cadastrado com sucesso!");
    System.out.println("");
  }

  public void listarClientes() {
    if (clientes.isEmpty()) {
      System.out.println("Nenhum cadastro encontrado no momento.");
      return;
    }
    System.out.println("Listando clientes...");
    for (Cliente cliente : clientes) {
      System.out.println(cliente);
    }
  }
}