public class TesteGerente {

  public static void main(String[] args) {
    Autenticavel referencia = new Gerente();

    Gerente g1 = new Gerente();
    g1.setNome("Marco");
    g1.setCpf("654168461");
    g1.setSalario(5000.00);

    System.out.println(g1.getNome());
    System.out.println(g1.getCpf());
    System.out.println(g1.getSalario());

    System.out.println(g1.getBonificacao());
  }
}
