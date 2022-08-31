public class TesteContas {

  public static void main(String[] args) {
    ContaCorrente cc = new ContaCorrente(111, 111);
    cc.deposita(100.00);

    ContaPoupanca cp = new ContaPoupanca(222, 222);
    cp.deposita(200.00);

    cc.transfere(10.00, cp);

    System.out.println(cc.getSaldo());
    System.out.println(cp.getSaldo());
  }
}
