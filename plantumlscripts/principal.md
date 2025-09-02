
@startuml
start

partition Usuario {
    :Ver menu principal;
    :Escolher opção;
}

while (Opção != 0) is (loop menu)
    if (Opção == 1) then (Buscar séries)
        :Chamar getDadosSerie();
        :Fazer requisição à API;
        :Converter JSON em DadosSerie;
        :Adicionar em dadosSeries;
        :Converter DadosSerie em Serie;
        :Ordenar por sinopse;
        :Exibir série;
    elseif (Opção == 2) then (Buscar episódios)
        :Chamar getDadosSerie();
        :Para cada temporada:
            :Fazer requisição à API;
            :Converter JSON em DadosTemporada;
        :Exibir episódios da série;
    elseif (Opção == 3) then (Listar séries buscadas)
        :Converter dadosSeries em Serie;
        :Ordenar por gênero;
        :Exibir séries buscadas;
    else (Opção inválida)
        :Exibir mensagem "Opção inválida";
    endif

    :Ver menu principal;
    :Escolher opção;
endwhile

stop
@enduml