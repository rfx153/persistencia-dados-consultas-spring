@startuml
start

:Início da aplicação;
:Spring Boot inicializa;
:ScreenmatchApplication.main() é chamado;
:SpringApplication.run(...);

:CommandLineRunner.run() é chamado;
:Cria instância da Principal;
:Chama Principal.exibeMenu();

partition Usuario {
    :Menu é exibido;
    :Usuário escolhe uma opção;
}

:Principal direciona para a funcionalidade escolhida;
repeat
    :Executa funcionalidade selecionada;
    :Menu é exibido novamente;
repeat while (Usuário não escolhe sair?)

stop
@enduml