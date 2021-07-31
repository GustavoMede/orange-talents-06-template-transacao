package br.com.zupacademy.gustavo.transacao.cartao;

public class Cartao {

    private String id;
    private String email;

    public Cartao() {
    }

    public Cartao(String id, String email) {
        this.id = id;
        this.email = email;
    }

    public String getId() {
        return id;
    }
}
