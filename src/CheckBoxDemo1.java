
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
		
public class CheckBoxDemo1 
{


		

			public static void main(String[] args) 
			{
				WebDriver driver = new ChromeDriver();
				driver.get("https://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");
				boolean Checkbox =driver.findElement(By.xpath("//input[@id='identifierId']")).isSelected();
				
				if (Checkbox==true) 
				{
					System.out.println("inputbutton is Displyed");
				}
				else
			 {
	            System.out.println("Checkbox is enabled");
	       
			}
				 boolean inputenable =driver.findElement(By.xpath("]")).isEnabled();
				 
				 {
			            System.out.println("Checkbox is enabled");
			        } 
				 
			}}
			