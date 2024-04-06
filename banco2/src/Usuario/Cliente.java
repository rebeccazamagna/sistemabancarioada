package Usuario;
import Enum.Classificacao;

import Enum.Status;

import java.time.LocalDate;

public class Cliente {
    private String id;
    private Classificacao classificacao;
    private String nome;
    private LocalDate dataCadastro;
    private Status status;





        public Cliente(String id, Classificacao classificacao, String nome, LocalDate dataCadastro, Status status) {
        this.id = id;
        this.classificacao = classificacao;
        this.nome = nome;
        this.dataCadastro = dataCadastro;
        this.status = status;

    }

    public Classificacao getClassificacao() {
        return classificacao;
    }

    public String getNome() { return nome;
    }
}