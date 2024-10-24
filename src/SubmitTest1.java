import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SubmitTest1
{

			public static void main(String[] args) 
			{
			WebDriver  loginButton =  new ChromeDriver();
					loginButton.get("https://jqueryui.com/button");
				 boolean inputButtonDisplayed = loginButton.findElement(By.xpath("input[class='ui-button ui-widget ui-corner-all']")).isDisplayed();
				
				if (inputButtonDisplayed )				
				{
					System.out.println("input ASubbmit Button  is Displyed");
				}
				else
			{
				System.out.println("input ASubbmit Button is not Displayed");	
			
			}
				   String actualbutton =  loginButton.findElement(By.xpath(input value='A submit button']")).getAttribute(" ");
				   String expectedbutton = "Asumitbutton";
				   if(actualbutton.equals(expectedbutton))
					  
				   {
					   System.out.println("Asubmitbutton is correct");
				   }
		else
		{
			 System.out.println(" Asubmitbutton is not correct");
			
		}}}
		
			
			