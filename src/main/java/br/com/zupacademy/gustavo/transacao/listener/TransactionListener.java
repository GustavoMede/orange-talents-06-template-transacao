package br.com.zupacademy.gustavo.transacao.listener;

import br.com.zupacademy.gustavo.transacao.eventoTransacao.TransactionResponse;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class TransactionListener {

    @KafkaListener(topics = "${spring.kafka.topic.transactions}")
    public void ouvir(TransactionResponse transactionResponse) {
        System.out.println(transactionResponse);
    }
}
