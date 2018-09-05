package SeleniumPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TestClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.marionette", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        String expectedTitle = "Guru99 Bank Manager HomePage";
        String newTitle = "";
        String uid = "mngr152056";
        String password="China123!";
        String baseUrl = "http://demo.guru99.com/v4/";
        driver.navigate().to(baseUrl);
         
        driver.findElement(By.name("uid")).sendKeys(uid);
        driver.findElement(By.name("password")).sendKeys(password);

        driver.findElement(By.name("btnLogin")).click();
        
        newTitle = driver.getTitle();
        if (newTitle.contentEquals(expectedTitle)) {
        	System.out.println("Test pass");
        }
        else {
        	System.out.println("Test Fail");
        }
        
	}
}
