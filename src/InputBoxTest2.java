
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

		

public class InputBoxTest2
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		 driver.get("https://www.facebook.com/login.php");
		 boolean inputButtonDisplayed =driver.findElement(By.xpath("//input[@id='loginbutton']")).isDisplayed();
		
		if ((inputButtonDisplayed)==true) 
		{
			System.out.println("inputbutton is Displyed");
		}
		else
	{
		System.out.println("inputbutton is Enable");	
	
	}
		   String actualPlaceholder= driver.findElement(By.xpath("//input[@id='email']")).getAttribute("placeholder");
		   String expectedPlaceholder = "Email or Phone";
		   if(actualPlaceholder.equals(expectedPlaceholder))
			  
		   {
			   System.out.println("Placeholder is correct");
		   }
else
{
	 System.out.println("Placeholder is not correct");
	
}}}


