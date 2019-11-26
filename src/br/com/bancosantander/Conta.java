package br.com.bancosantander;

public abstract class  Conta {

    private Double saldo;

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }




    // Metodos
    public abstract double sacar (double valor);
    public abstract double depositar (double valor);
    public abstract void consultarSaldo (String mensagem);


}
