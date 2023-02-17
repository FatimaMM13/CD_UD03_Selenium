import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
   
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        WebDriver driver = new ChromeDriver();

        
        try {
            driver.get("https://es.wikipedia.org/");
            /*WebElement cajaBusqueda = driver.findElement(By.id("searchInput"));
            cajaBusqueda.sendKeys("Selenium");
            System.out.println(driver.getTitle());
            driver.findElement(By.id("n-portal")).click();
            driver.findElement(By.linkText("Página aleatoria")).click();
            WebElement tituloPagina = driver.findElement(By.id("firstHeading"));
            System.out.println(tituloPagina.getText());
            assertEquals("Portal:Comunidad", tituloPagina.getText());
            */

            /* 
            List<WebElement> elementosDiv = driver.findElements(By.tagName("div"));
            
            for (WebElement webElement : elementosDiv) {
                System.out.println(webElement.getText());
            }

            for(int i=0; i<elementosDiv.size(); i++){
                WebElement webElement = elementosDiv.get(i);
                System.out.println(webElement.getText());
            }

            for (WebElement webElement : elementosDiv) {
                System.out.println(webElement.getAttribute("innerText"));
            }
            */

            WebElement cajaBusqueda = driver.findElement(By.id("searchInput"));

            WebElement botonBusqueda = driver.findElement(By.id("searchButton"));
            cajaBusqueda.sendKeys("Boiro");
            botonBusqueda.sendKeys(Keys.ENTER);

            assertEquals("Boiro", driver.getTitle());
            

            Thread.sleep(3000);
           
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
 
        driver.quit();
    }
    

}