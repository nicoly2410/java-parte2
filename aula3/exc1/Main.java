public class Main {
  public static void main(String[] args) {
    Pessoa p1 = new Pessoa("Pedro", 25);
    Pessoa p2 = new Pessoa("Thiago", 21);
    Pessoa p3 = new Pessoa("Pedro", 25);

    System.out.println("A pessoa p1 é igual a p2? " + p1.equals(p2));

    System.out.println("A pessoa p1 é igual a p3? " + p1.equals(p3));

    System.out.println("A pessoa p2 é igual a p3? " + p2.equals(p3));
  }
}