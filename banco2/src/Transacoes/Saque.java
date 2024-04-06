package Transacoes;

import Interfaces.Operacao;

import Contas.Conta;
import Enum.Classificacao;

import Usuario.Cliente;

public class Saque implements Operacao {



    @Override
    public void executar(Conta conta, double valor) {
       // if(conta.getCliente().getClassificacao() == Classificacao.PESSOAJURIDICA) {
           // double taxa = valor * 0.005; // 0.5% do valor
          //  valor += taxa; // adiciona a taxa ao valor do saque
      //  }

        if(valor > 0){
            double novoSaldo = conta.getSaldo() - valor;
            conta.setSaldo(novoSaldo);
            System.out.println("Saque realizado com sucesso. Novo saldo é: " + novoSaldo);
        } else {
            System.out.println("Valor do saque deve ser maior que zero.");
        }
    }
}