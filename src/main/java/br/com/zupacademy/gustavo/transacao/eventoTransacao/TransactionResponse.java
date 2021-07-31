package br.com.zupacademy.gustavo.transacao.eventoTransacao;

import br.com.zupacademy.gustavo.transacao.cartao.Cartao;
import br.com.zupacademy.gustavo.transacao.compras.Compra;
import br.com.zupacademy.gustavo.transacao.estabelecimento.Estabelecimento;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TransactionResponse {

    private String id;
    private BigDecimal valor;
    private Estabelecimento estabelecimento;
    private Cartao cartao;
    private LocalDateTime efetivadaEm;

    public TransactionResponse() {
    }

    public TransactionResponse(String id, BigDecimal valor, Estabelecimento estabelecimento,
                               Cartao cartao, LocalDateTime efetivadaEm) {
        this.id = id;
        this.valor = valor;
        this.estabelecimento = estabelecimento;
        this.cartao = cartao;
        this.efetivadaEm = efetivadaEm;
    }

    public String getId() {
        return id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public Estabelecimento getEstabelecimento() {
        return estabelecimento;
    }

    public Cartao getCartao() {
        return cartao;
    }

    public LocalDateTime getEfetivadaEm() {
        return efetivadaEm;
    }

    public Compra converte() {
        return new Compra(this.id, this.valor, this.estabelecimento.getNome(), this.cartao.getId(),
                this.efetivadaEm);
    }
}
