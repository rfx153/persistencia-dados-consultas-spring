package br.com.alura.screenmatch.service;

import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.service.OpenAiService;

public class ConsultaChatGPT {
    public static String obterTraducao(String texto) {
        OpenAiService service = new OpenAiService("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");


        CompletionRequest requisicao = CompletionRequest.builder()
                //.model("text-davinci-003")
                .model("gpt-3.5-turbo")
                .prompt("traduza para o português o texto: " + texto)
                .maxTokens(1000)
                .temperature(0.7)
                .build();


        var resposta = service.createCompletion(requisicao);
        return resposta.getChoices().get(0).getText();
    }
}