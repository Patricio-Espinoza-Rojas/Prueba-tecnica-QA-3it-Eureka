# Prueba técnica Selenium
***

## Descripción
***
Este ejercicio consiste en realizar un test automático sobre el sitio web del banco central en el cual se utilizará el siguiente link **http://www.bcentral.cl** , las pruebas deben hacer lo siguiente:
- **Abrir el sitio web del banco central**
- **Mostrar la cantidad de etiquetas (h1) e imprimir los resultados por consola**
- **Contar las etiquetas de párrafo (p) que existen en el sitio**
- **Validar que el título del sitio sea inicio - Banco Central de Chile si lo es debe indicar Título Correcto y si no lo es    debe mostrar Error en el título**
- **indicar el valor encontrado en la UF, UTM, Dólar observado y Euro y mostrarlo por consola**
Estas pruebas se realizarán con Java , Selenium y Cucumber.

## Instalación
***
Para poder ejecutar estas pruebas se debe tener un editor de texto instalado, **Se debe instalar según el sistema operativo de sus computadores**, para descargarlo lo pueden hacer desde la página oficial, puede ser Intellij, visual Studio code o el que sea de su preferencia, dejaré los enlaces para que descarguen el IDE que sea de su preferencia como recomendación si están aprendiendo o no tienen algún IDE de preferencia  podrían utilizar el visual studio code ya que es bastante amigable  e intuitivo y existe mucha documentación y videos explicativos en internet.

Intellij = https://www.jetbrains.com/es-es/idea/download/#section=mac **importante deben seleccionar el sistema operativo según sus computadores, pueden seleccionar el pagado o la versión free. como recomendación la versión free va bastante bien**

Visual Studio Code = https://code.visualstudio.com/ **En la parte de Download deben desplegar el menú con la flecha hacia abajo en donde deben elegir el sistema operativo que necesiten según sus computadores**

Deben descargar chromedriver de la página oficial (dejaré el link también), deben dejar el archivo en un directorio que recuerden (el directorio que se usa por defecto también está bien).
**Importante para saber que versión de chrome driver deben instalar vean este video ya que la descarga de chromedriver depende de la versión de su navegador**
**video para saber qué versión de chromedriver descargar = https://www.youtube.com/watch?v=Q1CiZIYCsWM**

chromedriver = https://chromedriver.chromium.org/downloads

Descargar el JDK 11  o de su eleccion en la página oficial de oracle y ejecuten el instalador, las intrucciones son sencillas y no deberian presentar problemas dejaré los link de igual manera **Para descargarlo también deben ver la versión de su sistema operativo**.
**video paara  instalación  y  descarga de JDK = https://www.youtube.com/watch?v=81WQ7oSwIgU**
JDK 11 = https://www.oracle.com/database/sqldeveloper/technologies/download/

**si están utilizando el visual studio code instalen las extensiones de Gradle Languaje Support y  Gradle Task en VSCode.**

- Para la instalación de **Gradle**:
**Windows**

Descargan Gradle de la página oficial que no puedo linkearles acá.

El archivo lo pueden descomprimir en C: o donde prefieran (les recomiendo directamente en el C). La carpeta extraída la renombran como gradle.

Abriendo el Panel de Control -> Sistema -> Configuración avanzada del sistema -> Variables de entorno … o ejecutando el comando ENV al tocar la lupa de Windows van a llegar a donde configuramos las locaciones de JAVA HOME, Gradle entre otros.

Añadimos C:\gradle\bin a la variable PATH

Listo para Windows!

**MacOS**

Acá el tema es más fácil. Con Homebrew instalado vamos a ejecutar, en la terminal: brew install gradle

Listo para Mac!
**para utilizar el brew deben instalar Homebrew en su MacOS en la página de brew sale claramente como se realizá la instalación dejaré el link**
**link Homebrew = https://brew.sh/** 

**con estas intalaciones debería ser suficiente para poder correr las pruebas que se encuentran en este repositorio**

## Uso
***
Para poder ejecutar los test con selenium, se debe abrir la carpeta de repositorio **Selenium_prueba_tecnica_eureka** con algún IDE **es importante señalar que todos los archivos dentro de la carpeta señalada deben estar abiertos con el IDE a elección y en el mismo  orden en el que se encuentran en el repositorio**, una vez hecho lo anterior si están utilizando visual studio code deben seleccionar en el menu principal del IDE donde dice **testing** es un ícono con forma de Matraz Erlenmeyer **esta ubicado abajo de las extensiones** y en el test padre es decir el que los contiene a todos seleccionar **run test** que esta al lado derecho con un **simbolo de play**, y las pruebas se comenzarán a ejecutar, si siguieron las intrucciones y está todo correctamente instalado se debiese ejecutar sin ningún problema.

## Contribuir
***
Si desea contribuir al proyecto, indicar algun metodo que funcione de mejor manera o corregir alguna línea de código que usted considere que puede mejorar el proyecto lo puede hacer, realizando el commit pertinente se revisará y aprobará para ser mergeado.

## Tecnologías ocupadas
***
1. java
2. Selenium
3. Cucumber

## Licencia
***

Contacto
Puede ponerse en contacto mediante mail escribiendo al (mis datos de contacto se encuentran en mi perfil de github) indicando en el asunto **prueba técnica selenium github 2023**.

**SE AGRADECERIA QUE PUDIESE DARLE UNA ESTRELLA AL REPOSITORIO**
