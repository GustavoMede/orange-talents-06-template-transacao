package br.com.zupacademy.gustavo.transacao.compras;

import org.springframework.data.domain.Page;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class CompraDto {

    private BigDecimal valor;
    private LocalDateTime efetivadaEm;
    private String nomeEstabelecimento;

    public CompraDto(Compra compra){
        this.valor = compra.getValor();
        this.efetivadaEm = compra.getEfetivadaEm();
        this.nomeEstabelecimento = compra.getNomeEstabelecimento();
    }

    public static Page<CompraDto> converte(Page<Compra> compras) {
        return compras.map(CompraDto::new);
    }

    public BigDecimal getValor() {
        return valor;
    }

    public LocalDateTime getEfetivadaEm() {
        return efetivadaEm;
    }

    public String getNomeEstabelecimento() {
        return nomeEstabelecimento;
    }
}
