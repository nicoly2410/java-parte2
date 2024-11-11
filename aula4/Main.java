
import java.util.Scanner;

import javax.management.InvalidAttributeValueException;


public class Main {
  public static void main(String[] args) {
   String nome = "João";
    String tipoConta = "Corrente";
    double saldo = 1500;
    int opcao = 0;

    System.out.println("***************");
    System.out.println("\n Nome do cliente " + nome);
    System.out.println("Tipo de conta " + tipoConta);
    System.out.println("Saldo atual " + saldo);
    System.out.println("***************");

    //menu do cliente
    System.out.println("\n\nEscolha uma opção: ");
    System.out.println("1 - Consultar saldo");
    System.out.println("2 - Transfirir Valor");
    System.out.println("3 - Receber");
    System.out.println("4 - Sair");

    Scanner leitura = new Scanner(System.in);
    while(opcao != 4){
      //valor recebido do teclado
      opcao = leitura.nextInt();
      //Opções 
      if(opcao == 1){
        System.out.println("Seu saldo é de: " + saldo);
      }else if(opcao == 2){
        System.out.println("Qual o valo que deseja transferir? ");
        double valor = leitura.nextDouble();
        if(valor > saldo){
          System.out.println("Saldo insuficiente");
        }else{
          saldo -= valor;
          System.out.println("O novo é: " + saldo);
        }
      }else if(opcao == 3){
        System.out.println("Valor a  receber: ");
        double valor = leitura.nextDouble();
        saldo += valor;
        System.out.println("O novo saldo é: " + saldo);
        
      }else if(opcao == 4){
        System.out.println("Opção Invalida");
      }
    }
    leitura.close();
  }

}