package bytebank;

public class TesteMetodo {

  public static void main(String[] args) {
    Conta contaDoPaulo = new Conta(0, 0);
    contaDoPaulo.deposita(50);
    System.out.println(contaDoPaulo.saldo);
    contaDoPaulo.saca(20);
    System.out.println(contaDoPaulo.saldo);
  }
}
