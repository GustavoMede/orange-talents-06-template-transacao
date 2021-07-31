package br.com.zupacademy.gustavo.transacao.listener;

import br.com.zupacademy.gustavo.transacao.compras.Compra;
import br.com.zupacademy.gustavo.transacao.compras.CompraRepository;
import br.com.zupacademy.gustavo.transacao.eventoTransacao.TransactionResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class TransactionListener {

    @Autowired
    CompraRepository compraRepository;

    @KafkaListener(topics = "${spring.kafka.topic.transactions}")
    public void ouvir(TransactionResponse transactionResponse) {
        System.out.println(transactionResponse);
        Compra compra = transactionResponse.converte();

        compraRepository.save(compra);
    }
}
