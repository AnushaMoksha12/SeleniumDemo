
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		
public class CheckBoxDemo2 
{


		

			public static void main(String[] args) 
			{
				WebDriver driver = new ChromeDriver();
				driver.get("https://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");
				boolean Checkbox =driver.findElement(By.xpath("//*[@id='content']/div[4]/div/form/table/tbody/tr[6]/td/label/span']")).isSelected();
				
				if (Checkbox==true) 
				{
					System.out.println("inputbutton is Displyed");
				}
				else
			 {
	            System.out.println("Checkbox is enabled");
	       
			}
				 boolean inputenable =driver.findElement(By.xpath("//*[@id='content'/div[4]/div/form/table/tbody/tr[6]/td/label/span']").isEnable();
				 
				 {
			            System.out.println("Checkbox is enabled");
			        } 
				 
			}}
			