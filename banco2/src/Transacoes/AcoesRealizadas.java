package Transacoes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import Usuario.Cliente;

public class AcoesRealizadas {


    public static class Transacao {
        public LocalDate data;
        public String tipo;
        public double valorPretendido;
        public double valorReal;
        public Cliente usuarioOrigem;
        public Cliente usuarioDestino;
        public String observacao;

        public Transacao(LocalDate data, String tipo, double valorPretendido, double valorReal, Cliente usuarioOrigem, Cliente usuarioDestino, String observacao) {
            this.data = data;
            this.tipo = tipo;
            this.valorPretendido = valorPretendido;
            this.valorReal = valorReal;
            this.usuarioOrigem = usuarioOrigem;
            this.usuarioDestino = usuarioDestino;
            this.observacao = observacao;
        }
    }

    private List<Transacao> listaTransacoes;

    public AcoesRealizadas() {
        this.listaTransacoes = new ArrayList<>();
    }

    public void adicionarTransacao(Transacao transacao) {
        this.listaTransacoes.add(transacao);
    }

    public List<Transacao> getTransacoes() {
        return this.listaTransacoes;
    }

    public void printTransacoes() {
        for(Transacao transacao : this.listaTransacoes) {
            System.out.println("Data: " + transacao.data);
            System.out.println("Tipo: " + transacao.tipo);
            System.out.println("Valor Pretendido: " + transacao.valorPretendido);
            System.out.println("Valor Real: " + transacao.valorReal);
            System.out.println("Usúario Origem: " + transacao.usuarioOrigem.getNome()); // Supondo que Cliente tenha um método getNome()
            System.out.println("Usuário Destino: " + transacao.usuarioDestino.getNome()); // Supondo que Cliente tenha um método getNome()
            System.out.println("Observação: " + transacao.observacao);
            System.out.println("---------------------------------");
        }
    }
}
