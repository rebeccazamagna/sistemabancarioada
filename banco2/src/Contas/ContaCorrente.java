package Contas;
import Interfaces.Operacao;
import Transacoes.AcoesRealizadas;
import Usuario.Cliente;
import Enum.Status;

public class ContaCorrente extends Conta {
    private Operacao investimentoOperacao;

    public ContaCorrente(String id, double saldo, Status status, Cliente cliente) {
        super(id, saldo, status, cliente);
    }


    @Override
    public AcoesRealizadas saque(double valor) {
        saqueOperacao.executar(this, valor);
        return null;
    }


    public void investimento (double valor) {
        investimentoOperacao.executar(this, valor);
    }
}