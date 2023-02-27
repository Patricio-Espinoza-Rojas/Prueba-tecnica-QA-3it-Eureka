# Prueba técnica Selenium
***

## Descripción
***
Este ejercicio consiste en realizar un test automático sobre el sitio web del banco central en el cual se utilizara el siguiente link **http://www.bcentral.cl** , las pruebas deben hacer lo siguiente:
- **Abrir el sitio web del banco central**
- **Mostrar la cantidad de etiquetas <h1> e imprimir los resultados por consola**
- **Contar la etiquetas de párrafo (<p>) que existen en el sitio**
- **Validar que el titulo del sitio sea iniccio - Banco Central de Chile si lo es debe indicar Titulo Correcto y si no lo es    debe mostrar Error en el titulo**
- **indicar el valor encontrado en la UF, UTM, Dólar observado y Euro y mostrarlo por consola**
Estas pruebas se realizaran con Java , Selenium y Cucumber.

## Instalación
***
Para poder ejecutar estas pruebas se debe tener un editor de texto instalado, **Se debe instalar según el sistema operativo de sus computadores**, para descargarlo lo pueden hacer desde la pagina oficial, puede ser Intellij, visual Studio code o el que sea de su preferencia, dejare los link para que descargen el IDE que sea de su preferencia como recomendación si están aprendiendo o no tienen algun IDE de preferencia  podrian utilizar el visual studio code ya que es bastante amigable  e intuitivo y existe mucha documentación y videos explicativos en internet.

Intellij = https://www.jetbrains.com/es-es/idea/download/#section=mac **importante deben seleccionar el sistema operativo segun sus computadores, pueden seleccionar el pagado o la versión free. como recomendación la version free va bastante bien**

Visual Studio Code = https://code.visualstudio.com/ **En la parte de Dowload deben desplegar el menu con la flecha hacia abajo en donde deben elegir el sistema operativo que necesiten segun sus computadores**

Deben descargar chromedriver de la pagina oficial (dejare el link tambien), deben dejar el archivo en un directorio que recuerden (el directorio que se usa por defecto tambien esta bien).
**Importante para saber que version de chrome driver deben instalar vean esta video ya que la descarga de chromedriver depende de la version de su navegador**
**video para saber que version de chromedriver descargar = https://www.youtube.com/watch?v=Q1CiZIYCsWM**

chromedriver = https://chromedriver.chromium.org/downloads

Descargar el JDK 11  o de su eleccion en la pagina oficial de oracle y ejecuten el instalador, las intrucciones son sencillas y no deberian presentar problemas deejare los link de igual manera **Para descargarlo tambien deben ver la version de su sistema operativo**.
**video paara  instalacion  y  descarga de JDK = https://www.youtube.com/watch?v=81WQ7oSwIgU**
JDK 11 = https://www.oracle.com/database/sqldeveloper/technologies/download/

**si estan utilizando el visuaal studio code instalen las extensiones de Gradle Languaje Support y  Gradle Task en VSCode.**

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
**para utilizar el brew deben instalar Homebrew en su MacOS en la pagina de brew sale claramente como se realiza la instalacion dejare el link**
**link Homebrew = https://brew.sh/** 

**con estas intalaciones deberia ser suficiente para poder correr las pruebas que se encuentran en este repositorio**

## Uso
***
Para poder ejecutar los test con selenium si estan en visual studio code deben seleccionar en el menu principal del IDE donde dice **testing** es un icono con forma de Matraz Erlenmeyer **esta ubicado abajo de las extensiones** y en el test padre es decir el que los contiene a todos selecionar **run test** que esta al lado derecho con un **simbolo de play**, y las pruebas se comenzaran a ejecutar, si siguieron las intrucciones y esta todo correctamente instalado se debiese ejecutar sin ningun problema.

## Contribuir
***
Si desea contribuir al proyecto, indicar algun metodo que funcione de mejor manera o corregir alguna linea de codigo que ud considere que puede mejorar el proyecto lo puede hacer, realizando el commit pertinente se revisara y aprobara para ser mergeado.

## Tecnologías ocupadas
***
1. java
2. Selenium
3. Cucumber

## Licencia
***

Contacto
Puede ponerse en contacto mediante mail escribiendo al mail (mis datos de contacto se encuentran en mi perfil de github) indicando en el asunto **prueba tecnica selenium github 2023**.

**SE AGRADECERIA QUE PUDIESE DARLE UNA ESTRELLA AL REPOSITORIO**
