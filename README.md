# prova_sicredi

## Prova técnica de Automação de Teste - https://www.grocerycrud.com/v1.x/demo/my_boss_is_in_a_hurry/bootstrap

### Como executar o cenário ?
#### src/test/java > runner > RunnerTest.java > Botão direito do mouse > Run As > 1 JUnit Test

#### ou

#### src/test/resources > features > desafio1.feature > Botão direito do mouse > 1 Cucumber Feature


### Feature:

```java
#enconding: utf-8
#author: Lucas M Callefe
@Desafios
Feature: Desafio1

  @desafio1
  Scenario Outline: Formulario
    When que acesso a pagina "https://www.grocerycrud.com/v1.x/demo/my_boss_is_in_a_hurry/bootstrap"
    And seleciono Switch theme "Bootstrap V4 Theme"
    And clico no link "Add Record"
    And preencho os campos do formulario "<name>", "<lastName>", "<contactFirstName>", "<phone>", "<addressLine1>", "<addressLine2>", "<city>", "<state>", "<postalCode>", "<country>", "<fromEmployeer>", "<creditLimit>"
    And clico no botao "Save"
    Then devera apresentar mensagem "Your data has been successfully stored into the database. Edit Record or Go back to list"

    Examples: 
      | name          | lastName | contactFirstName | phone        | addressLine1          | addressLine2 | city         | state | postalCode | country | fromEmployeer | creditLimit |
      | Teste Sicredi | Teste    | Lucas            | 51 9999-9999 | Av Assis Brasil, 3970 | Torre D      | Porto Alegre | RS    | 91000-000  | Brasil  | Fixter        |         200 |

   ```
