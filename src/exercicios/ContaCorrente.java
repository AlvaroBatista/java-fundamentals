package src.exercicios;

public class ContaCorrente {
    int numeroConta = 450326;
    int numeroAgencia = 3995;
    String nomeCliente = "Alvaro Batista";
    String dataNascimento = "15/03/2000";
    double saldoConta = 200;

    public void sacar(double valor) {
        if (saldoConta < valor) {
            System.out.println("Saldo insuficiente!");
        } else {
            this.saldoConta -= valor;
            System.out.println(String.format("Você sacou %.2f, seu saldo é %.2f", valor, this.saldoConta));
        }
    }
}
