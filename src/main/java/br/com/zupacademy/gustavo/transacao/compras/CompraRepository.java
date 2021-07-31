package br.com.zupacademy.gustavo.transacao.compras;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompraRepository extends JpaRepository<Compra, String> {

    Page<Compra> findAllByIdCartao(Pageable paginacao, String idCartao);
}
