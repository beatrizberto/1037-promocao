# Microserviço de Promoção

## Visão Geral do Projeto

### Descrição Breve
O microserviço de promoção é um componente essencial de um sistema distribuído voltado para a gestão de promoções de pacotes. Ele se comunica via REST API para consulta de informações de promoção associadas a um pacote.

### Arquitetura
O projeto é baseado em uma arquitetura de microsserviços, integrando-se de maneira assíncrona com outros serviços. Sua principal funcionalidade é oferecer informações sobre promoções para pacotes por meio de requisições REST.

## Configuração do Ambiente de Desenvolvimento

### Requisitos
- Java 17
- Maven
- Banco de Dados H2 (ou PostgreSQL)

### Instruções de Configuração
1. Clone o repositório.
2. Configure as dependências e o ambiente Java.
3. Configure o banco de dados conforme necessário.

## Funcionalidades
 
### 1. Consultar Promoção
O microserviço oferece um endpoint REST para consultar informações de promoções associadas a um determinado pacote:

. Endpoint: 'GET /promocao/{PacoteId}'

PacoteId: Identificador do pacote para o qual deseja-se obter informações de promoção.

Se houver promoções disponíveis para o pacote consultado, o serviço retorna a porcentagem referente a promoção, caso contrário retorna 0.

### Contrato de Comunicação

Requisição de Promoção

![1f5c28c6-d43e-4c3b-b546-a5362891fa6b](https://github.com/lucianasfoliveira/teste/assets/116811743/912a28d8-6db0-47fa-9aa6-0d6ec1db10a3)

## Contribuição

- Beatriz Berto
- Bruna Torres
- Fernanda Soares
- Jessica Alves
- Jessica Lima
- Luciana Oliveira
