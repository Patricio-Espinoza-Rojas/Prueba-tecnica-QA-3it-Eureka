# Prueba técnica para QA automatizador Programa Eureka de 3it

## Descripción
Esta es la prueba técnica para los QA Automatizadores del proyecto Eureka de la empresa 3it. En este repositorio de github encontraran dos carpetas una con el nombre de selenium que corresponde a la primera fase de la prueba y la otra con el nombre de postman que corresponde a la segunda fase de la prueba.
**En el repositorio encontraran un archivo el cual se llama *Prueba QA Automatizador Eureka 3IT* en el que encontraran la prueba técnica en formato pdf en donde podran ver las preguntas y ejercicios de esta**.

#### Fase 1
la primera fase se debe automatizar pruebas para la pagina web del banco central en la que se debe mostrar la pagina osea se debe abrir automaticamente llevando a la pagina de inicio, y luego obtener cantidad de etiquetas (H1) e imprimir los textos existentes en ellas, contar la cantidad de parrafos es decir las etiquetas (p) que existen en el sitio, validar que el título del sitio sea **inicio - Banco Central de Chile** y si es asi debe imprimir consola titulo correcto y de no ser asi debe mostrar **error de titulo**. y por ultimo indicar el valor encontrado de la **UF, UTM,Dólar observado y Euro**.
#### Fase 2
En esta fase se debe realizar unas pruebas en postman en donde se debe realizar una colección llamada **API CMF**, se deben realizar dos request el primero con esta url https://api.cmfchile.cl/api-sbifv3/recursos_api/dolar/2022?apikey={APIKEY}&formato=json . El primer request debe incluir los siguientes test: validar que la respuesta de la api sea **inferior a 500 milisegundos**, validar que la respuesta de la consulta contenga un **texto que diga Dolares** y validar que la respuesta de la consulta contenga un dato para el **31 de agosto de 2022**.
El segundo request se debe ocupar este link https://api.cmfchile.cl/api-sbifv3/recursos_api/euro?apikey={APIKEY}&formato=json . En este request se deben validar estos test que la respuesta contenga el encabezado **"Content-Type"** , validar que la respuesta contenga un texto que diga **"Euros"**, validar que la respuesta no contenga valores nulos en los campos **Valor y Fecha**


## Dentro de cada carpeta encontra el README tanto de selenium como de postman, explicando en que  consisten las pruebas y como ejecutarlas.

## Instalación
***
Aquí se proporcionan instrucciones sobre cómo instalar el proyecto o sus dependencias.

## Uso
***
Aquí se explica cómo utilizar el proyecto. Se deben proporcionar ejemplos de uso y capturas de pantalla si es posible.

## Contribuir
***
Si desea contribuir al proyecto, indicar algun metodo que funcione de mejor manera o corregir alguna línea de código que usted considere que puede mejorar el proyecto lo puede hacer, realizando el commit pertinente se revisará y aprobará para ser mergeado.

## Licencia
***

## Contacto
***
Puede ponerse en contacto mediante mail escribiendo al (mis datos de contacto se encuentran en mi perfil de github) indicando en el asunto **prueba técnica selenium github 2023**.

**SE AGRADECERIA QUE PUDIESE DARLE UNA ESTRELLA AL REPOSITORIO**