
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonDemo1
{

	public static void main(String[] args) 
	{

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/reservation.php");

        WebElement radioButton = driver.findElement(By.xpath("//input[@value='oneway']"));

        boolean isRadioButtonSelected = radioButton.isSelected();
        if (isRadioButtonSelected) 
        {
            System.out.println("Radio button is selected");
        } 
        else 
        {
            System.out.println("Radio button is not selected");
        }

        boolean isRadioButtonEnabled = radioButton.isEnabled();
        if (isRadioButtonEnabled) 
        {
            System.out.println("Radio button is enabled");
        } 
        else 
        {
            System.out.println("Radio button is not enabled");
        }

        radioButton.click();

        boolean isSelectedAfterClick = radioButton.isSelected();
        if (isSelectedAfterClick) 
        {
            System.out.println("Radio button is selected after click");
        } 
        else 
        {
            System.out.println("Radio button is not selected after click");
        }
      }
	}