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
