package MainClass;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.driverfactory.DriverFactory;
import com.pages.Signup;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;

public class MainClassMethod {
	private Signup SignUp = new Signup(DriverFactory.getDriver());
	@Given("Open the TXO App")
	public void open_the_txo_app() throws InterruptedException {
		DriverFactory.getDriver().get("https://Stagingtxo.e-bizsoft.net/");
	}



	@Given("Close the browser")
	public void close_the_browser(DataTable dataTable) throws InterruptedException {
		Thread.sleep(35000);
		DriverFactory.getDriver().findElement(By.id("a-main2")).click();
//		Actions action = new Actions(DriverFactory.getDriver());
//		action.moveToElement(DriverFactory.getDriver().findElement(By.id("a-main2")).click());
		
		
	}

}
