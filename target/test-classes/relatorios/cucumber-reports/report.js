$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/desafio1.feature");
formatter.feature({
  "name": "Desafio1",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Desafios"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Formulario",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@desafio2"
    }
  ]
});
formatter.step({
  "name": "que acesso a pagina \"https://www.grocerycrud.com/v1.x/demo/my_boss_is_in_a_hurry/bootstrap\"",
  "keyword": "When "
});
formatter.step({
  "name": "seleciono Switch theme \"Bootstrap V4 Theme\"",
  "keyword": "And "
});
formatter.step({
  "name": "clico no link \"Add Record\"",
  "keyword": "And "
});
formatter.step({
  "name": "preencho os campos do formulario \"\u003cname\u003e\", \"\u003clastName\u003e\", \"\u003ccontactFirstName\u003e\", \"\u003cphone\u003e\", \"\u003caddressLine1\u003e\", \"\u003caddressLine2\u003e\", \"\u003ccity\u003e\", \"\u003cstate\u003e\", \"\u003cpostalCode\u003e\", \"\u003ccountry\u003e\", \"\u003cfromEmployeer\u003e\", \"\u003ccreditLimit\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "clico no botao \"Save\"",
  "keyword": "And "
});
formatter.step({
  "name": "devera apresentar mensagem \"Your data has been successfully stored into the database. Edit Record or Go back to list\"",
  "keyword": "Then "
});
formatter.step({
  "name": "clico no link \"Go back to list\"",
  "keyword": "And "
});
formatter.step({
  "name": "filtro por CustomerName",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "name",
        "lastName",
        "contactFirstName",
        "phone",
        "addressLine1",
        "addressLine2",
        "city",
        "state",
        "postalCode",
        "country",
        "fromEmployeer",
        "creditLimit"
      ]
    },
    {
      "cells": [
        "Teste Sicredi",
        "Teste",
        "Lucas",
        "51 9999-9999",
        "Av Assis Brasil, 3970",
        "Torre D",
        "Porto Alegre",
        "RS",
        "91000-000",
        "Brasil",
        "Fixter",
        "200"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Formulario",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Desafios"
    },
    {
      "name": "@desafio2"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que acesso a pagina \"https://www.grocerycrud.com/v1.x/demo/my_boss_is_in_a_hurry/bootstrap\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.formularioSteps.que_acesso_o_sistema(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleciono Switch theme \"Bootstrap V4 Theme\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.formularioSteps.seleciono_Switch_theme(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico no link \"Add Record\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.formularioSteps.clico_no_link(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencho os campos do formulario \"Teste Sicredi\", \"Teste\", \"Lucas\", \"51 9999-9999\", \"Av Assis Brasil, 3970\", \"Torre D\", \"Porto Alegre\", \"RS\", \"91000-000\", \"Brasil\", \"Fixter\", \"200\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.formularioSteps.preencho_os_campos_do_formulario(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico no botao \"Save\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.formularioSteps.clico_no_botao(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "devera apresentar mensagem \"Your data has been successfully stored into the database. Edit Record or Go back to list\"",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.formularioSteps.devera_apresentar_mensagem(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico no link \"Go back to list\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.formularioSteps.clico_no_link(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "filtro por CustomerName",
  "keyword": "And "
});
formatter.match({
  "location": "steps.formularioSteps.filtro_por_CustomerName()"
});
