public class Main {
    public static void main(String[] args){
        Cliente arthur = new Cliente();
        arthur.setNome("Arthur");

        Conta cc = new ContaCorrente(nome);
        Conta poupanca = new ContaPoupanca(nome);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
