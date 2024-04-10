package pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Createanaccountpage {
	public void Createanaccountpage(WebDriver driver) {
		PageFactory.initElements(driver, this);

}
	@FindBy (xpath = "(//li[@class='authorization-link'])[1]")private WebElement SignIn;
	@FindBy (id = "email")private WebElement email;
	@FindBy (id="pass")private WebElement password;
	@FindBy (xpath ="(//span[text()='Sign In'])[1]")private WebElement signin;
	public void cutomerlogin() throws Exception {
		FileInputStream k = new FileInputStream(".\\SoftwareTestingBoard\\ExcelData\\SoftwaretestingBoardData.xls");
		HSSFWorkbook workbook = new HSSFWorkbook(k);
		HSSFSheet sheet = workbook.getSheet("Sheet2");
		Thread.sleep(2000);
		email.sendKeys(sheet.getRow(6).getCell(1).toString());
		password.sendKeys(sheet.getRow(7).getCell(1).toString());
		Thread.sleep(2000);
		signin.click();
	}
	public void siginlink() {
		SignIn.click();
	}
}