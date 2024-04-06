package Transacoes;

import Interfaces.Operacao;

import Contas.Conta;

public class Deposito implements Operacao {
    private Conta conta;
    private double valor;
    private double saldo;

    public Deposito() {

    }


    public void executar(Conta conta, double valor) {
        // Implementar lógica de deposito
        if(valor > 0){
            double novoSaldo = conta.getSaldo() + valor;
            conta.setSaldo(novoSaldo);
            System.out.println("Depósito realizado com sucesso. Novo saldo é: " + novoSaldo);
        } else {
            System.out.println("Valor do depósito deve ser maior que zero.");
        }
    }


}
