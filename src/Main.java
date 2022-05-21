public class Main {

    public static void main(String[]args) {
        contaCorrente cc = new contaCorrente() ;
        ContaPoupanca poupanca = new ContaPoupanca();

        cc.depositar(100);
        cc.transferir(100,poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
