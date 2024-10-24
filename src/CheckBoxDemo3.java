
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo3
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
        driver.get("https://faculty.washington.edu/chudler/java/boxes.html");
         WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox'][5]"));
         boolean isSelected = checkBox.isSelected();
        if (isSelected) 
        {
            System.out.println("Checkbox is  selected");
        } 
        else 
        {
            System.out.println("Checkbox is not selected");
        }
     
        checkBox.click();       
        boolean isSelectedAfterClick = checkBox.isSelected();
        if (isSelectedAfterClick) 
        {
            System.out.println("Checkbox is selected");
                               
        } 
        else 
        {
            System.out.println("Checkbox is  not selected");
        }}}