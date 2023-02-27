package steps;
//con el * indico que me traiga toda la libreria en vez de importarla una a una(esto aplica para los given, when, and y then)

import cucumber.api.java.en.*;

import org.openqa.selenium.WebElement;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

public class BancocentralSteps {

    private WebDriver driver;
    int cantidadEtiquetas;
    private int cantidadParrafos;
    

    @Given("cargar la pagina web del banco central")
    public void loadWebpage() { 
        driver = new ChromeDriver();
        driver.get("https://www.bcentral.cl/");
    }
// Este timer es para que la pagina se cierre automaticamente despues de una cierta cantidad de tiempo
    @And("^timer pagina banco centrtal$")
    public void waitForSeconds() throws InterruptedException {
        Thread.sleep(15000);
    }    

    @And("^busco etiquetas H1$")
    public void buscoEtiquetasH1() {
        List<WebElement> h1Tags = driver.findElements(By.tagName("h1"));
        System.out.println("Cantidad de etiquetas H1: " + h1Tags.size());
        for (WebElement tag : h1Tags) {
            System.out.println(tag.getText());
        }
    }

    @And("^cuento la cantidad de etiquetas de parrafo$")
    public void cuento_la_cantidad_de_parrafos() {
        cantidadParrafos = driver.findElements(By.tagName("p")).size();
        System.out.println("Cantidad de parrafos : " + cantidadParrafos);
    }
    

    @And("^el titulo de la pagina debe ser \"([^\"]*)\"$")
    public void el_titulo_de_la_pagina_debe_ser(String tituloEsperado) {
        String tituloActual = driver.getTitle();
        Assert.assertEquals(tituloEsperado, tituloActual);
        if (tituloActual.equals(tituloEsperado)) {
            System.out.println("Título correcto");
        } else {
            System.out.println("Error en el título");
        }
    }
    
    @When("^obtengo el valor de la UF, UTM, Dólar observado y Euro$")
    public void obtener_valores() throws Throwable {
        WebElement uf = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/p[2]"));
        WebElement utm = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/p[2]"));
        WebElement dolar = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/p[2]"));
        WebElement euro = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/p[2]"));
        
        String valor_uf = uf.getText();
        String valor_utm = utm.getText();
        String valor_dolar = dolar.getText();
        String valor_euro = euro.getText();
        
        System.out.println("Valor UF: " + valor_uf);
        System.out.println("Valor UTM: " + valor_utm);
        System.out.println("Valor Dólar Observado: " + valor_dolar);
        System.out.println("Valor Euro: " + valor_euro);
    }

    @Then("^imprimo los valores obtenidos en consola$")
    public void imprimir_valores() throws Throwable {
        driver.quit();
    }
}