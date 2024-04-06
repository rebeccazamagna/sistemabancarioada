import Contas.ContaCorrente;
import Transacoes.AcoesRealizadas;
import Usuario.Cliente;
import Enum.Status;
import Enum.Classificacao;
import java.time.LocalDate;
import Transacoes.Transferencia;

public class Main {

    public static void main(String[] args) {
        AcoesRealizadas acoes = new AcoesRealizadas();
        // Criação de dois novos clientes
        Cliente cliente1 = new Cliente("0345678901", Classificacao.PESSOAJURIDICA, "Cliente Um", LocalDate.now(), Status.ATIVA);
        Cliente cliente2 = new Cliente("0789101112", Classificacao.PESSOAFISICA, "Cliente Dois", LocalDate.now(), Status.ATIVA);

        // Criação de contas correntes para cada cliente
        ContaCorrente conta1 = new ContaCorrente("conta1", 0, Status.ATIVA, cliente1);
        ContaCorrente conta2 = new ContaCorrente("conta2", 0, Status.ATIVA, cliente2);

        // Operações para cada conta
        System.out.println("\n------- Conta 1 -------");
        conta1.deposito(1000);  // Deposita 1000 na conta1
        conta1.saque(200);  // Saque 200 da conta1


        System.out.println("\n------- Conta 2 -------");
        conta2.deposito(500);  // Deposita 500 na conta2
        conta2.saque(100);  // Saque 100 da conta2


        // Transferência da conta1 para a conta2
        System.out.println("\n------- Transferência da conta 1 para a conta 2 -------");
        Transferencia.executarTransferencia(conta1, conta2, 200);  // Transfere 200 da conta1 para a conta2
        System.out.println("Saldo atual da conta1: " + conta1.getSaldo());  // Mostra o saldo atual da conta1 após a transferência
        System.out.println("Saldo atual da conta2: " + conta2.getSaldo());  // Mostra o saldo da conta2 após receber a transferência


        acoes.adicionarTransacao(new AcoesRealizadas.Transacao(LocalDate.now(), "SAQUE", 100, 95, cliente1, cliente2, "Transacao realizada"));
        acoes.printTransacoes();

    }
}