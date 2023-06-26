package br.com.alura.tmmt.screenmatch.domain.filme;

import br.com.alura.tmmt.screenmatch.controller.DadosAlteracaoFilmes;
import jakarta.persistence.*;

@Entity
@Table(name="filmes")
public class Filme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Integer duracaoEmMinutos;
    private Integer ano;
    private String genero;
    public Filme (DadosCadastroFilmes dados) {
        this.nome = dados.nome();
        this.duracaoEmMinutos = dados.duracao();
        this.ano = dados.ano();
        this.genero = dados.genero();
    }

    public Filme() {}

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(Integer duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void atualizaDados(DadosAlteracaoFilmes dados) {
        this.nome = dados.nome();
        this.duracaoEmMinutos = dados.duracao();
        this.ano = dados.ano();
        this.genero = dados.genero();
    }
}
