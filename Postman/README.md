# Prueba técnica POSTMAN
***

## Descripción
***
Este ejercicio consiste en realizar una colección en postman llamada **API CMF** los cuales se dividiran en dos ejercicios que contenga una serie de request según lo solicitado.
En el primer request se debe utilizar el siguiente enlace perteneciente a la API con la que se trabajara **https://api.cmfchile.cl/api-sbifv3/recursos_api/dolar/2022?apikey={APIKEY}&formato=json** , los requerimientos del primre ejercicio son los siguientes:
- Validar que la respuesta se procese por debajo de 500 milisegundos
- Validar que la respuesta contenga un texto que diga **Dolares**
- Validar que la respuesta contenga un dato para el 31 de agosto de 2022

En el segundo request se debe utilizar ele siguiente enlace **https://api.cmfchile.cl/api-sbifv3/recursos_api/euro?apikey={APIKEY}&formato=json** , los requerimientos de este ejercicio son los siguientes:
- Validar que la respuesta contenta un encabezado **Content- Type** en el header
- Validar que la respuesta contenga un texto que diga **Euros**
- Validar que la respuesta no contine valores nulos en los campos **Valor y Fecha**.

### IMPORTANTE PARA UTILIZACIÓN DE LOS ENLACES EN ESTAS PRUEBAS SE DEBE CONSIDERAR QUE CADA USUSARIO DEBERA CONSEGUIR SU PROPIA API KEY DEL SITIO DE LA CMF. TAMBIÉN DARE LA OPCION DE DEJAR MI API KEY LA CUAL EN LA PARTE DE INSTALACIÓN EXPLICARE COMO CONSEGUIRLA Y DEJARE LA QUE UTILICE YO, PARA QUE TENGAN DOS OPCIONES.

## Instalación
***
Para poder ejecutar estas pruebas se debe tener postman instalado, **Se debe instalar según el sistema operativo de sus computadores**, para descargarlo lo pueden hacer desde la pagina oficial, existe mucha documentación tanto en la pagina oficial de postman como en otros sitios (**siempre se recomienda recurrir a la documentación oficial como primera instancia**), también existen muchos videos explicativos en internet sobre uso de postman ya que es muy popular.
Para uso de postman como primer paso se deben crear una cuenta ingresando al siguiente link:
https://identity.getpostman.com/login?addAccount=1 , **una opcion es ingresar con su cuenta de google**.

Para descargar postman deben ingresar en el siguiente enlace:
https://www.postman.com/ , veran un apartado que dice **Download the desktop app** ahi eligen el sistema operativo segun sus computadores y podrán descargar la app.
Para el caso de MAC OS existe la posibilidad de instalar postman mediante Homebrew:
**para utilizar el brew deben instalar Homebrew en su MacOS en la pagina de brew sale claramente como se realiza la instalacion dejare el link**
**link Homebrew** = https://brew.sh/
**dejo link de video en donde se explica como utilizar homebrew:** https://www.youtube.com/watch?v=BAjBObxlfDY

### A continuación Les dejo un video en dondee se explica de manera general de como se utiliza postman 
**video explicativo de uso de postman** = https://www.youtube.com/watch?v=FQAQO90LoQU&t=92s 

### USO DE API KEY
Para conseguir una API Key lo puede hacer directamente en el sitio de la Comisión del mercado financiero ingresando al siguente link https://api.sbif.cl/api/contactanos.jsp , en donde deberan ingresar sus datos y el CMF generara una **API KEY** la cual la enviaran al correo electronico.
En el caso que quieran ocupar la API KEY que utilice yo es esta:
fc4cb71f3eaae78ff5cab0fc75025fa1ee041968 .
### importante esta api key se debe ingresar en este link https://api.cmfchile.cl/api-sbifv3/recursos_api/euro?apikey={APIKEY}&formato=json en donde deben remplazar la API KEY a utilizar por {APIKEY}

## Uso
***
1. Para poder ejecutar los test con postman se debe crear un workpace en donde se utiliza un nombre a elección en mi caso es **API CMF** ya que este es el nombre que se debe utilizar segun las indicaciones.
2. Luego dentro de ese workpace ingresar los archivos que se encuentran en el repositorio dentro de la carpeta de postman.
3. Luego revisar si estan las variables que se utilizan para hacer la consulta a las APIS, en el menú de postman ingresar a la opcion que dice evironment quick loock es un boton que se encuentra al lado superior derecho su icono es un cuadro con un ojo, se encuentra abajo del avatar de cada usuario.
4. En el caso de no tener las variables se deben agregar, en la variable general se debe nombrar con el nombre de **GLOBAL** al cual le deben agregar este link https://api.cmfchile.cl/api-sbifv3/recursos_api ,
en la variable de ambiente agregar la variable con el nombre API KEY con el siguiente link fc4cb71f3eaae78ff5cab0fc75025fa1ee041968 , **importante los link se deben agregar en la parte de current value**
5. Ya teniendo todo configurado y listo se debe apretar en el request get el boton Send y debera devolver la respuesta en formato json y en la pestaña de test result debera aparecer con color verde 3/3 y si pinchan esa pestaña aparecera el resultado de los test.


## Contribuir
***
Si desea contribuir al proyecto, indicar algun metodo que funcione de mejor manera o corregir alguna linea de codigo que ud considere que puede mejorar el proyecto lo puede hacer, realizando el commit pertinente se revisara y aprobara para ser mergeado.

## Tecnologías ocupadas
***
1. Postman

## Licencia
***

Contacto
Puede ponerse en contacto mediante mail escribiendo al mail (mis datos de contacto se encuentran en mi perfil de github) indicando en el asunto **prueba tecnica postman github 2023**.

**SE AGRADECERIA QUE PUDIESE DARLE UNA ESTRELLA AL REPOSITORIO**
