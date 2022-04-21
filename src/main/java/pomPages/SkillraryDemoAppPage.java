package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoAppPage {
	
	@FindBy(id="course")
	private WebElement coursetab;
	
	@FindBy(xpath="//a[text()='Selenium Training']")
	private WebElement seleniumtraining;
	
	@FindBy(name="addresstype")
	private WebElement testingdd;
	
	public WebElement getTestingdd() {
		return testingdd;
	}

	public SkillraryDemoAppPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getCoursetab() {
		return coursetab;
	}
	
	public void seleniumtab() {
		seleniumtraining.click();
	}
	
	
	

}
