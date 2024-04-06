package Transacoes;

import Interfaces.Operacao;
import Contas.Conta;

public class Transferencia implements Operacao {



    @Override
    public void executar(Conta conta, double valor) {

    }


    public static void executarTransferencia(Conta contaOrigem, Conta contaDestino, double valor) {
        // if(conta.getCliente().getClassificacao() == Classificacao.PESSOAJURIDICA) {
        // double taxa = valor * 0.005; // 0.5% do valor
        //  valor += taxa; // adiciona a taxa ao valor do saque
        //  }
            if (valor <= 0) {
                System.out.println("O valor da transferência deve ser maior que zero.");
                return;
            }

            // Verifica se a conta de origem tem saldo suficiente
            if (contaOrigem.getSaldo() < valor) {
                System.out.println("Saldo insuficiente na conta de origem.");
                return;
            }

            // Realiza a transferência
            contaOrigem.saque(valor);
            contaDestino.deposito(valor);

            System.out.println("Transferência realizada com sucesso!");
        }
    }

