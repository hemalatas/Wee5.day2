package Week5.day2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Baseclass {
	public ChromeDriver driver;
	@Parameters({"username","password"})
	@BeforeMethod(alwaysRun = true)
public void beforeMethod(String uName,String pWord) {

}
