package br.com.bancosantander;

public class ContaPoupanca extends Conta{


    @Override
    public double sacar(double valor) {

        if(this.getSaldo() <= valor){
            double saldoAtualizado = getSaldo() - valor;
            System.out.println("O saldo atual é: " + saldoAtualizado);
            this.setSaldo(saldoAtualizado);
        } else {

            System.out.println("Saldo insuficiente!");
        }
    }

    @Override
    public double depositar(double valor) {
        double saldoAtualizado = getSaldo() + valor;
        System.out.println("O saldo atual é: " + saldoAtualizado);
        this.setSaldo(saldoAtualizado);
    }

    @Override
    public void consultarSaldo(String mensagem) {

    }

    public void recolherJuros (double Juros){

    }
}
