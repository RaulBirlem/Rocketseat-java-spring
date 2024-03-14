# Rocketseat-java-spring
Desafio Back-end PicPay

Primeiramente, obrigado pelo seu interesse em trabalhar na melhor plataforma de pagamentos do mundo! Abaixo você encontrará todos as informações necessárias para iniciar o seu teste.

Avisos antes de começar
Crie um repositório no seu GitHub sem citar nada relacionado ao PicPay.
Faça seus commits no seu repositório.
Envie o link do seu repositório para o email do recrutador responsável.
Você poderá consultar o Google, Stackoverflow ou algum projeto particular na sua máquina.
Dê uma olhada nos Materiais úteis.
Dê uma olhada em como será a entrevista.
Fique à vontade para perguntar qualquer dúvida aos recrutadores.
Fique tranquilo, respire, assim como você, também já passamos por essa etapa. Boa sorte! :)
Corpo do Email com o link do repositório do desafio

Seu Nome

Nome do recrutador

Link do repositório

Link do Linkedin

Sobre o ambiente da aplicação:
Escolha qualquer framework que se sinta confortável em trabalhar. Esse teste não faz nenhuma preferência, portanto decida por aquele com o qual estará mais seguro em apresentar e conversar com a gente na entrevista ;)

Você pode, inclusive, não optar por framework nenhum. Neste caso, recomendamos a implementação do serviço via script para diminuir a sobrecarga de criar um servidor web.

Ainda assim, se optar por um framework tente evitar usar muito métodos mágicos ou atalhos já prontos. Sabemos que essas facilidades aumentam a produtividade no dia-a-dia mas aqui queremos ver o seu código e a sua forma de resolver problemas.

Valorizamos uma boa estrutura de containeres criada por você.

Para o dia da entrevista técnica
Na data marcada pelo recrutador tenha sua aplicação rodando na sua máquina local para execução dos testes e para nos mostrar os pontos desenvolvidos e possíveis questionamentos. Faremos um code review junto contigo como se você já fosse do nosso time ❤️, você poderá explicar o que você pensou, como arquitetou e como pode evoluir o projeto.

Objetivo: PicPay Simplificado
Temos 2 tipos de usuários, os comuns e lojistas, ambos têm carteira com dinheiro e realizam transferências entre eles. Vamos nos atentar somente ao fluxo de transferência entre dois usuários.

Requisitos:

Para ambos tipos de usuário, precisamos do Nome Completo, CPF, e-mail e Senha. CPF/CNPJ e e-mails devem ser únicos no sistema. Sendo assim, seu sistema deve permitir apenas um cadastro com o mesmo CPF ou endereço de e-mail.

Usuários podem enviar dinheiro (efetuar transferência) para lojistas e entre usuários.

Lojistas só recebem transferências, não enviam dinheiro para ninguém.

Validar se o usuário tem saldo antes da transferência.

Antes de finalizar a transferência, deve-se consultar um serviço autorizador externo, use este mock para simular (https://run.mocky.io/v3/5794d450-d2e2-4412-8131-73d0293ac1cc).

A operação de transferência deve ser uma transação (ou seja, revertida em qualquer caso de inconsistência) e o dinheiro deve voltar para a carteira do usuário que envia.

No recebimento de pagamento, o usuário ou lojista precisa receber notificação (envio de email, sms) enviada por um serviço de terceiro e eventualmente este serviço pode estar indisponível/instável. Use este mock para simular o envio (https://run.mocky.io/v3/54dc2cf1-3add-45b5-b5a9-6bf7e7f1f4a6).

Este serviço deve ser RESTFul.