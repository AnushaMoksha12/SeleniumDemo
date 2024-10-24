import org.checkerframework.common.value.qual.BoolVal;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class InputBoxTest1
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.google.com/");
        boolean inputdisplay =driver.findElement(By.xpath("//input[@id='identifierId']")).isDisplayed();
		
		if (inputdisplay==true) 
		{
			System.out.println("input is Displyed");
		}
		else
	{
		System.out.println("input is Displyed");	

	}
		   boolean inputenable =driver.findElement(By.xpath("//input[@id='identifierId']")).isEnabled();
		
		   if(inputenable==true) 
		{
			System.out.println("input is enable");
		}
		else
	{
		System.out.println("input is not enable");
		

	}
		   String actualwatrmark = driver.findElement(By.xpath("//input[@id='identifierId']")).getAttribute("aria-lable");
		   String expectedwatermark = "Email or Phone";
		   if(actualwatrmark.equals(expectedwatermark))
			  
		   {
System.out.println("Water mark is displaying");
		   }
else
{
	System.out.println("Water mark is not displaying");
	
}}}


