package br.com.zupacademy.gustavo.transacao.estabelecimento;

public class Estabelecimento {

    private String nome;
    private String cidade;
    private String endereco;

    public Estabelecimento() {
    }

    public Estabelecimento(String nome, String cidade, String endereco) {
        this.nome = nome;
        this.cidade = cidade;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }
}
