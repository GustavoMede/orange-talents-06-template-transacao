package br.com.zupacademy.gustavo.transacao.compras;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/compra")
public class CompraController {

    @Autowired
    CompraRepository compraRepository;

    @GetMapping("/{idCartao}")
    public ResponseEntity<Page<CompraDto>> consulta(@PathVariable String idCartao, @PageableDefault(sort = "efetivadaEm",
    direction = Sort.Direction.DESC, page = 0, size = 10)Pageable paginacao){
        Page<Compra> compras = compraRepository.findAllByIdCartao(paginacao, idCartao);

        return ResponseEntity.ok().body(CompraDto.converte(compras));
    }
}
