package Contas;
import Usuario.Cliente;
import Enum.Status;
import Enum.Classificacao;

public class ContaInvestimento extends Conta {


    public ContaInvestimento(String id, double saldo, Status status, Cliente cliente) {
        super(id, saldo, status, cliente);
    }

    //public void geraRendimento() {
        //double rendimento;

        //if (this.getCliente().getClassificacao() == Classificacao.PESSOAFISICA) {
            //rendimento = this.getSaldo() * 0.01;  // Rendimento de 1%
        //} else { // Classificacao.PESSOAJURIDICA
            //rendimento = this.getSaldo() * 0.02;  // Rendimento de 2%
        //}

        //this.deposito(rendimento);

}





