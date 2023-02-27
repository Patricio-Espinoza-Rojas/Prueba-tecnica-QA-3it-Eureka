Feature: pagina de banco central

Scenario: pagina de banco central
    Given cargar la pagina web del banco central
    And timer pagina banco centrtal
    And busco etiquetas H1
    And cuento la cantidad de etiquetas de parrafo
    And el titulo de la pagina debe ser "Inicio - Banco Central de Chile"
    When obtengo el valor de la UF, UTM, Dólar observado y Euro
    Then imprimo los valores obtenidos en consola

    

