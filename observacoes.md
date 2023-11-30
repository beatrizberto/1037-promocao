# Observações

## Sobre o projeto

1. Projeto relativamente simples e muito bem implementado
2. O endpoint de consulta por promoção não cumpre o contrato. No contrato definido e disponibilizado no readme.md contém a seguinte estrutura:

>> Request

```bash
http://localhost:9080/promocao/<pacoteID>
```

>> Response

```json
{
  "porcentagemDesconto": "0"
}
```

Porém o disponibilizado foi:
>> Request

```bash
http://localhost:8080/promocao/<pacoteID>
```

>> Response

```json
{
  0
}
```

Para o response correspondente ao definido no readme de vocês a classe com o payload correspondente deveria ser: 

```java
@Data
public class PromocaoConsultaResponse {
    public Integer porcentagemDesconto;
    
}

```
