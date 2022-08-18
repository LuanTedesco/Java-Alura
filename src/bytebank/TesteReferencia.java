package bytebank;

public class TesteReferencia {

  public static void main(String[] args) {
    Conta primeirConta = new Conta(0, 0);
    primeirConta.saldo = 300;

    System.out.println("Saldo da primeira: " + primeirConta.saldo);
  }
}
