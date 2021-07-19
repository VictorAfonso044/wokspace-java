package com.framework.victorafonso.service;

import org.springframework.stereotype.Service;

import com.framework.victorafonso.client.FeingClient;
import com.framework.victorafonso.client.JavaHttpClient;
import com.framework.victorafonso.client.RestTemplateClient;
import com.framework.victorafonso.dto.MessageSend;
import com.framework.victorafonso.dto.ResultBotTelegram;
import com.framework.victorafonso.dto.ResultBotTelegramList;

@Service
public class Telegram {
    private RestTemplateClient restTemplateClient;
    private FeingClient feingClient;
    private JavaHttpClient javaHttpClient;

    public Telegram(RestTemplateClient restTemplateClient, FeingClient feingClient, JavaHttpClient javaHttpClient) {
        this.restTemplateClient = restTemplateClient;
        this.feingClient = feingClient;
        this.javaHttpClient = javaHttpClient;
    }

    public void enviarMensagem(MessageSend mensagem) {
        //HTTP CLIENT
        ResultBotTelegram resultBotTelegramResponseEntity = javaHttpClient.enviarMensagem(mensagem);

        //RestTemplate
        restTemplateClient.enviarMensagem(mensagem);

        //FeingClient
        ResultBotTelegram resultBotTelegram = feingClient.enviarMensagem1(mensagem);
    }

    public ResultBotTelegramList buscarAtualizacao() {
        //HTTP CLIENT
        ResultBotTelegramList resultBotTelegramList = javaHttpClient.buscarAtualizacao();

        //RestTemplate
        ResultBotTelegramList resultBotTelegramList1 = restTemplateClient.buscarAtualizacao();

        //FeingClient
        feingClient.buscaratualizacao();
        return resultBotTelegramList;
    }
}
