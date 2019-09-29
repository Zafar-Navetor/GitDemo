package Extend;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Extend.TestListener.class)
public class Testcase extends Base {
	
	@Test
	public void PageTitle(){
	
		String actualtitle = driver.getTitle();
		String expectedtitle= "Welcome to GSRF - 5";
	
		try{
		Assert.assertEquals(expectedtitle, actualtitle);
		logs.info("Page Title is Correct");
			
		}catch(Exception e){
			logs.info("Page Title is not Correct");
			
		}
	}
	
	@Test
	public void Browser(){
		try{
			WebElement name = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(front_end.getProperty("Name"))));
			name.sendKeys(fake.name().firstName());
		//driver.findElement(By.xpath(front_end.getProperty("Name"))).sendKeys(fake.name().firstName());
		}catch(Exception e){
			logs.info("Unable to locator" +" " +front_end.getProperty("Name"));
		}
		try{
			driver.findElement(By.xpath(front_end.getProperty("lname"))).sendKeys(fake.name().lastName());
		}catch(Exception e){
			logs.info("Unable to locator" +" " +front_end.getProperty("lname"));
		}
		try{
			driver.findElement(By.xpath(front_end.getProperty("company"))).sendKeys(fake.company().industry());
		}catch(Exception e){
			logs.info("Unable to locator" +" " +front_end.getProperty("company"));
		}
		try{
			driver.findElement(By.xpath(front_end.getProperty("suggestion"))).sendKeys(fake.lorem().paragraph());
		}catch(Exception e){
			logs.info("Unable to locator" +" " +front_end.getProperty("suggestion"));
		}
		try{
			driver.findElement(By.xpath(front_end.getProperty("state"))).sendKeys(fake.address().state());
		}catch(Exception e){
			logs.info("Unable to locator" +" " +front_end.getProperty("state"));
		}
		try{
			driver.findElement(By.xpath(front_end.getProperty("city"))).sendKeys(fake.address().cityName());
		}catch(Exception e){
			logs.info("Unable to locator" +" " +front_end.getProperty("city"));
		}
		
		try{
			Thread.sleep(6000);	
			Select country = new Select(driver.findElement(By.xpath(front_end.getProperty("country"))));
			country.selectByIndex(2);
			}catch(Exception e){
				logs.info("Unable to locate"+""+ front_end.getProperty("country"));
			}
		try{
			Thread.sleep(6000);	
			Select occupation = new Select(driver.findElement(By.xpath(front_end.getProperty("occupation"))));
			occupation.selectByIndex(2);
			}catch(Exception e){
				logs.info("Unable to locate"+""+ front_end.getProperty("occupation"));
			}
		try{
			driver.findElement(By.xpath(front_end.getProperty("email"))).sendKeys(front_end.getProperty("email_input"));
		}catch(Exception e){
			logs.info("Unable to locator" +" " +front_end.getProperty("email"));
		}
		try{
			driver.findElement(By.xpath(front_end.getProperty("cell"))).sendKeys(fake.phoneNumber().cellPhone());
		}catch(Exception e){
			logs.info("Unable to locator" +" " +front_end.getProperty("cell"));
		}
		
		try{
			driver.findElement(By.xpath(front_end.getProperty("date"))).sendKeys(front_end.getProperty("date_input"));
		}catch(Exception e){
			logs.info("Unable to locator" +" " +front_end.getProperty("date"));
		}
		
		try{
			driver.findElement(By.xpath(front_end.getProperty("zipcode"))).sendKeys(fake.address().zipCode());
		}catch(Exception e){
			logs.info("Unable to locator" +" " +front_end.getProperty("zipcode"));
		}
		
		try{
			driver.findElement(By.xpath(front_end.getProperty("gender"))).click();
		}catch(Exception e){
			logs.info("Unable to locator" +" " +front_end.getProperty("gender"));
		}
		try{
			driver.findElement(By.xpath(front_end.getProperty("customer"))).click();
		}catch(Exception e){
			logs.info("Unable to locator" +" " +front_end.getProperty("customer"));
		}
		
		try{
			driver.findElement(By.xpath(front_end.getProperty("button"))).click();
		}catch(Exception e){
			logs.info("Unable to locator" +" " +front_end.getProperty("button"));
		}
		
		
		


		
		
	}
	
	

}
