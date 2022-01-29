package com.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefn {
	WebDriver driver;

	
	@Given("User is on the adactin page")
	public void user_is_on_the_adactin_page() {
		
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	@When("User should enter {string}{string}")
	public void user_should_enter(String name, String pass) {
		WebElement txtUser = driver.findElement(By.id("username"));
		txtUser.sendKeys(name);
		
		WebElement txtPass = driver.findElement(By.id("password"));
		txtPass.sendKeys(pass);
	}

	@When("User should click login button")
	public void user_should_click_login_button() {
		WebElement btnLogin = driver.findElement(By.id("login"));
		btnLogin.click();
		
	}
	@When("User should select {string} ,{string} ,{string} ,{string} ,{string} ,{string},{string},{string}")
	public void user_should_select(String location, String hotel, String roomType, String noOfRoom, String checkIn, String checkOut, String adults, String childs) {
		WebElement dDnLoc = driver.findElement(By.id("location"));
		
		  Select select =new Select(dDnLoc);
		  select.selectByValue(location);
		  
			WebElement dDnHotel = driver.findElement(By.id("hotels"));
			 Select select1 =new Select(dDnHotel);
			select1.selectByValue(hotel);
			
			
			WebElement dDnroom = driver.findElement(By.id("room_type"));
			 Select select2 =new Select(dDnroom);
			 select2.selectByVisibleText(roomType);
			 
			 WebElement roomNos = driver.findElement(By.id("room_nos"));
			 Select select3 =new Select(roomNos);
			 select3.selectByVisibleText(noOfRoom);
			 
	     WebElement dateIn = driver.findElement(By.id("datepick_in"));
		 JavascriptExecutor executor= (JavascriptExecutor) driver;
		 executor.executeScript("arguments[0].setAttribute('value','"+checkIn+"')",dateIn );
		 
		  WebElement dateOut = driver.findElement(By.id("datepick_out"));
			 JavascriptExecutor executor1= (JavascriptExecutor) driver;
			 executor1.executeScript("arguments[0].setAttribute('value','"+checkOut+"')",dateOut );
			 
			 WebElement people = driver.findElement(By.id("adult_room"));
			 Select select4 =new Select(people);
			 select4.selectByVisibleText(adults);
			 
			 WebElement child = driver.findElement(By.id("child_room"));
			 Select select5 =new Select(child);
			 select5.selectByVisibleText(childs);
			 
			 
			 WebElement btnSubmit = driver.findElement(By.id("Submit"));
			 btnSubmit.click();
	}

	@Then("User should verify {string} message")
	public void user_should_verify_message(String check) {
		
		String text = driver.findElement(By.className("login_title")).getText();
		Assert.assertEquals("Verify Select page" ,check, text);
		
	}
	

	

	
	
	
	
	
	
//	@When("User should Search for Hotels")
//	public void user_should_Search_for_Hotels() {
//		
//		WebElement dDnLoc = driver.findElement(By.id("location"));
//		
//		  Select select =new Select(dDnLoc);
//		  select.selectByIndex(1);
//		  
//			WebElement dDnHotel = driver.findElement(By.id("hotels"));
//			 Select select1 =new Select(dDnHotel);
//			select1.selectByValue("Hotel Sunshine");
//			
//			
//			WebElement dDnroom = driver.findElement(By.id("room_type"));
//			 Select select2 =new Select(dDnroom);
//			 select2.selectByVisibleText("Deluxe");
//			 
//			 WebElement roomNos = driver.findElement(By.id("room_nos"));
//			 Select select3 =new Select(roomNos);
//			 select3.selectByIndex(2);
//			 
//	     WebElement dateIn = driver.findElement(By.id("datepick_in"));
//		 JavascriptExecutor executor= (JavascriptExecutor) driver;
//		 executor.executeScript("arguments[0].setAttribute('value','13/01/2022')",dateIn );
//		 
//		  WebElement dateOut = driver.findElement(By.id("datepick_out"));
//			 JavascriptExecutor executor1= (JavascriptExecutor) driver;
//			 executor1.executeScript("arguments[0].setAttribute('value','14/01/2022')",dateOut );
//			 
//			 WebElement people = driver.findElement(By.id("adult_room"));
//			 Select select4 =new Select(people);
//			 select4.selectByIndex(2);
//			 
//			 WebElement child = driver.findElement(By.id("child_room"));
//			 Select select5 =new Select(child);
//			 select5.selectByIndex(3);
//			 
//			 WebElement btnSubmit = driver.findElement(By.id("Submit"));
//			 btnSubmit.click();
//		
//	}
//
//	@When("User should Select hotel")
//	public void user_should_Select_hotel() {
//		 WebElement radbtn = driver.findElement(By.id("radiobutton_0"));
//		 radbtn.click();
//		 
//		 
//		 WebElement btnCntue = driver.findElement(By.id("continue"));
//		 btnCntue.click();
//		
//		
//	}
//
//	@When("User Should Book Hotel")
//	public void user_Should_Book_Hotel() {
//		 WebElement txtFrstName = driver.findElement(By.id("first_name"));
//		 txtFrstName.sendKeys("Margot");
//		 
//		 WebElement txtLastName = driver.findElement(By.id("last_name"));
//		 txtLastName.sendKeys("Robbie");
//		 
//		 WebElement txtAddress = driver.findElement(By.id("address"));
//		 txtAddress.sendKeys("No.7 Vivekanandar Theru,Dubai Kuruk Santhu, Dubai Main Road, Dubai. ");
//		 
//		 WebElement txtCC = driver.findElement(By.id("cc_num"));
//		 txtCC.sendKeys("9879876543219517");
//		 
//		 WebElement dDnCCtype = driver.findElement(By.id("cc_type"));
//		 Select select6 =new Select(dDnCCtype);
//		 select6.selectByIndex(1);
//		 
//		 WebElement dDnCCexMon = driver.findElement(By.id("cc_exp_month"));
//		 Select select7 =new Select(dDnCCexMon);
//		 select7.selectByIndex(7);
//		 
//		 WebElement dDnCCexYr = driver.findElement(By.id("cc_exp_year"));
//		 Select select8 =new Select(dDnCCexYr);
//		 select8.selectByIndex(7);
//		 
//		 
//		 WebElement txtCvv = driver.findElement(By.id("cc_cvv"));
//		 txtCvv.sendKeys("258");
//		 
//		 
//		 WebElement btnBook = driver.findElement(By.id("book_now"));
//		 btnBook.click();
//		
//	}
//	
//
//	@When("User Shold Get Order Id")
//	public void user_Shold_Get_Order_Id() {
//		 WebElement txtOrder = driver.findElement(By.id("order_no"));
//			String text = txtOrder.getAttribute("value");
//			System.out.println(text);
//		
//	}
//
//
//	@Then("User should verify success message")
//	public void user_should_verify_success_message() {
//		Assert.assertTrue("Verify Order Id",true);
//	   
//	   
//	}


}
 




