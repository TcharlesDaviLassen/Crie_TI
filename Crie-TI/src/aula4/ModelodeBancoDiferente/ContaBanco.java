package aula4.ModelodeBancoDiferente;

import ferramentas.Entrada;

public class ContaBanco {
    
    private String agencia;
    private String conta;
    private String titular;
    private double saldo;
    private double chequeEspecial;

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }
    
    public void saque() {
        
            double valor = Entrada.leiaDouble(this.toString()
                        + "\n\nValor que deseja sacar:");
        
        if ((saldo - valor) < (-1 * chequeEspecial)) {
            
            System.out.println("Você ficaria com " + (saldo - valor)
                    + "\nUltrapassando o limite do seu cheque especial."
                    + "\nÉ impossível sacar.");
            
        } else {
            
            this.saldo -= valor;
            
        }
        
    }
    
    public void deposito() {
        
            double valor = Entrada.leiaDouble(this.toString()
                        + "\n\nValor que deseja depositar:");
        
        this.saldo += valor;
        
    }
    
    public void transferir(ContaBanco contaRecebimento, double valorTransferencia) {
        
        if ((saldo - valorTransferencia) < (-1 * chequeEspecial)) {
            
            System.out.println("Você ficaria com " + (saldo - valorTransferencia)
                    + "\nUltrapassando o limite do seu cheque especial."
                    + "\nÉ impossível transferir.");
        
        } else {
            
            contaRecebimento.saldo += valorTransferencia;
        
            this.saldo -= valorTransferencia;
            
        }
        
    }
    
    @Override
    public String toString() {
        
        return "\nAgencia: " + agencia + "\n"
                + "Conta: " + conta + "\n"
                + "Titular: " + titular + "\n"
                + "Saldo: " + saldo + "\n"
                + "Cheque especial: " + chequeEspecial;
        
    }
    
}