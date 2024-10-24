
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LableTest1 {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.google.com/");
		WebElement Element =driver.findElement(By.xpath("//span[text()='to continue to Gmail']"));
		
		String actualData = Element.getText();                                
		String expectedData = "to Continue to Gmail";
		System.out.println( expectedData);
	
if (actualData.equals(expectedData) )
	
{
	System.out.println("Data is matching");
} 	
else
{
	System.out.println("Data is not matching");
	}}}

