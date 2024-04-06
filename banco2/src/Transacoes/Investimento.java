package Transacoes;
import Contas.ContaCorrente;
import Contas.ContaInvestimento;
import Interfaces.Operacao;

import Contas.Conta;

public class Investimento implements Operacao {
    private Conta conta;
    private ContaCorrente contaCorrente;
    private ContaInvestimento contaInvestimento;
    private double valor;


    @Override
    public void executar(Conta conta, double valor) {

    }
}



