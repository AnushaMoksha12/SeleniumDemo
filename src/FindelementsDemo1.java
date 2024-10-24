import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindelementsDemo1 
    {
   public static void main(String[] args)
	{
	   
	WebDriver driver = new ChromeDriver();
	driver.get("http://gmail.com");
	driver.findElement(By.id("identifier")).sendKeys("RBG Technologies");
	WebElement element1 = driver.findElement(By.id("identifierid"));
	element1.sendKeys("RBG Technologies");
	

	}

}
