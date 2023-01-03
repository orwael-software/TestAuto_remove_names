package testAuto;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TestAuto {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","D:\\my new driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("http://127.0.0.1:5500/index.html");
		List <WebElement> myOptions = driver.findElements(By.tagName("option"));
		
		for(int i=0 ; i<myOptions.size() ; i++) {
			if(i%2 ==0) {
				myOptions.get(i).click();
				System.err.println("Sorry i wiil remove"+myOptions.get(i).getText());
				driver.findElement(By.id("remove")).click();
				}
			else {
				System.out.println("i will keep the --->"+myOptions.get(i).getText());
			}
		}
	}

}
