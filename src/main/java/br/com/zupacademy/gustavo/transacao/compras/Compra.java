package br.com.zupacademy.gustavo.transacao.compras;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class Compra {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;
    private String idCompra;
    private BigDecimal valor;
    private String nomeEstabelecimento;
    private String idCartao;
    private LocalDateTime efetivadaEm;

    public Compra() {
    }

    public Compra(String idCompra, BigDecimal valor, String nomeEstabelecimento, String idCartao,
                  LocalDateTime efetivadaEm) {
        this.idCompra = idCompra;
        this.valor = valor;
        this.nomeEstabelecimento = nomeEstabelecimento;
        this.idCartao = idCartao;
        this.efetivadaEm = efetivadaEm;
    }

    public String getIdCompra() {
        return idCompra;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public String getNomeEstabelecimento() {
        return nomeEstabelecimento;
    }

    public LocalDateTime getEfetivadaEm() {
        return efetivadaEm;
    }
}
