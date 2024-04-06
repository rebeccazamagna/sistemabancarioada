package Contas;

import java.time.LocalDate;

import Transacoes.Deposito;
import Transacoes.Saque;
import Transacoes.Transferencia;
import Transacoes.AcoesRealizadas;
import Usuario.Cliente;
import Enum.Classificacao;

import Enum.Status;

public abstract class Conta {

    protected String id;
    protected double saldo;
    protected LocalDate dataAtualizacao;
    protected Status status;
    protected Cliente cliente;
    protected Deposito depositoOperacao;
    protected Saque saqueOperacao;
    protected Transferencia transferenciaOperacao;
    protected Classificacao classificacao;



    public Conta(String id, double saldo, Status status, Cliente cliente) {
        this.id = id;
        this.saldo = saldo;
        this.dataAtualizacao = LocalDate.now();
        this.status = Status.ATIVA;
        this.cliente = cliente;

        depositoOperacao = new Deposito ();
        saqueOperacao = new Saque ();
        transferenciaOperacao = new Transferencia ();
        AcoesRealizadas acoes = new AcoesRealizadas();
    }

    public Conta() {

    }

    public void deposito(double valor) {
        depositoOperacao.executar(this, valor);
    }

    public AcoesRealizadas saque(double valor) {
        saqueOperacao.executar(this, valor);

        return null;
    }

    public void transferencia(Conta contaOrigem, Conta contaDestino, double valor) {
        transferenciaOperacao.executarTransferencia(this, this, valor);
    }

    public void atualizarData() {
        dataAtualizacao = LocalDate.now();
    }

    public LocalDate getDataAtualizacao() {
        return dataAtualizacao;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

   public double getSaldo() {
      return saldo;
    }
    public void setSaldo(double saldo) { this.saldo = saldo; }


    public Object getCliente() {
        return cliente;
    }

    public Object getClassificacao () {
        return classificacao;
    }
}