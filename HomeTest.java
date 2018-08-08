package com.cg.MK_153057Test;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomeTest {

	WebDriver driver = null; 
	   @Given("Open Webpage$") 
	   public void goToRegPage() { 
		    System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			 driver = new ChromeDriver();
			 driver.navigate().to("D:\\JavaWorkspaceSTS\\MK_153057Test\\src\\test\\java\\com\\cg\\MK_153057Test\\ConferenceRegistartion.html");
	   }
	   @When("^I enter firstname empty$") 
	   public void enterUsername3() throws InterruptedException { 
		   HomePage home1=PageFactory.initElements(driver, HomePage.class);	
		 home1.txtFirstName.sendKeys("");
		 home1.next.click();
			Alert alert=driver.switchTo().alert();
			System.out.println(alert.getText());
			
			assertEquals(alert.getText(), "Please fill the First Name");
			driver.switchTo().alert().accept();
			Thread.sleep(1000);
		   /*home.twotabsearchtextbox.sendKeys(arg1);
		   home.submit.click();
		   home.redmi5.click();
		   driver.navigate().to("https://www.amazon.in/Mi-Redmi-5-Black-32GB/dp/B077PWBC7J/ref=sr_1_1?s=electronics&ie=UTF8&qid=1533615417&sr=1-1&keywords=redmi+5");
		   home.navigateto.click();*/
	   }
	   @Then("^I enter my firstname as (.*)$")
	   public void checkPass3(String arg1) throws InterruptedException {  
		  HomePage home1=PageFactory.initElements(driver, HomePage.class);
		  home1.txtFirstName.sendKeys(arg1);
		  Thread.sleep(1000);
		   //assertEquals(home.geth1.getText(),"Added to Cart");
	   }
	   @When("^I enter lastname empty$") 
	   public void enterUsername() throws InterruptedException { 
		   HomePage home1=PageFactory.initElements(driver, HomePage.class);	
		 home1.txtLastName.sendKeys("");
		 home1.next.click();
			Alert alert=driver.switchTo().alert();
			System.out.println(alert.getText());
			Thread.sleep(1000);
			assertEquals(alert.getText(), "Please fill the Last Name");
			driver.switchTo().alert().accept();
			Thread.sleep(1000);
	   }
	   @Then("^I enter my lastname as (.*)$")
	   public void checkPass(String arg1) throws InterruptedException {  
		  HomePage home1=PageFactory.initElements(driver, HomePage.class);
		  home1.txtLastName.sendKeys(arg1);
		  Thread.sleep(1000);
		   //assertEquals(home.geth1.getText(),"Added to Cart");
	   }
	   @When("^email format wrong$") 
	   public void email() throws InterruptedException { 
		   HomePage home1=PageFactory.initElements(driver, HomePage.class);	
		 home1.txtEmail.sendKeys("abcdds");
		 home1.next.click();
			Alert alert1=driver.switchTo().alert();
			System.out.println(alert1.getText());
			Thread.sleep(1000);
			assertEquals(alert1.getText(), "Please enter valid Email Id.");
			driver.switchTo().alert().accept();
			Thread.sleep(1000);
	   }
	   @Then("^my email as (.*)$")
	   public void pass(String arg1) {  
		  HomePage home1=PageFactory.initElements(driver, HomePage.class);
		  home1.txtEmail.sendKeys(arg1);
		   //assertEquals(home.geth1.getText(),"Added to Cart");
	   }
	   @When("^contact number wrong$") 
	   public void contactnum() throws InterruptedException { 
		   HomePage home1=PageFactory.initElements(driver, HomePage.class);	
		 home1.txtPhone.sendKeys("");
		 home1.next.click();
			Alert alert=driver.switchTo().alert();
			System.out.println(alert.getText());
			Thread.sleep(1000);
			assertEquals(alert.getText(), "Please fill the Contact No.");
			driver.switchTo().alert().accept();
			Thread.sleep(1000);
	   }
	   @Then("^entered contact number as (.*)$")
	   public void contact(String arg1) throws InterruptedException {  
		  HomePage home1=PageFactory.initElements(driver, HomePage.class);
		  home1.txtPhone.sendKeys(arg1);
		  Thread.sleep(1000);
		   //assertEquals(home.geth1.getText(),"Added to Cart");
	   }
	   @When("^number of people attending none$") 
	   public void people1() throws InterruptedException { 
		   HomePage home1=PageFactory.initElements(driver, HomePage.class);	
		// home1.peopleAttending.click();
		 home1.next.click();
			Alert alert=driver.switchTo().alert();
			System.out.println(alert.getText());
			Thread.sleep(1000);
			assertEquals(alert.getText(), "Please fill the Number of people attending");
			driver.switchTo().alert().accept();
			Thread.sleep(1000);
	   }
	   @Then("^no of people attended are 3$")
	   public void peopleAttended() throws InterruptedException {  
		  HomePage home1=PageFactory.initElements(driver, HomePage.class);
		  home1.people.click();
		  Thread.sleep(1000);
		   
	   }
	   @When("^address1 of building is empty$") 
	   public void address() throws InterruptedException { 
		   HomePage home1=PageFactory.initElements(driver, HomePage.class);	
		 home1.txtAddress1.sendKeys("");
		 home1.next.click();
			Alert alert=driver.switchTo().alert();
			System.out.println(alert.getText());
			Thread.sleep(1000);
			assertEquals(alert.getText(), "Please fill the Building & Room No");
			driver.switchTo().alert().accept();
			Thread.sleep(1000);
	   }
	   @Then("^Correct Address1 is (.*)$")
	   public void addressCorrect(String arg1) throws InterruptedException {  
		  HomePage home1=PageFactory.initElements(driver, HomePage.class);
		  home1.txtAddress1.sendKeys(arg1);
		  Thread.sleep(1000);
		   //assertEquals(home.geth1.getText(),"Added to Cart");
	   }
	   @When("^address2 of building is empty$") 
	   public void address2() throws InterruptedException { 
		   HomePage home1=PageFactory.initElements(driver, HomePage.class);	
		 home1.txtAddress2.sendKeys("");
		 home1.next.click();
			Alert alert=driver.switchTo().alert();
			System.out.println(alert.getText());
			Thread.sleep(1000);
			assertEquals(alert.getText(), "Please fill the Area name");
			driver.switchTo().alert().accept();
			Thread.sleep(1000);
	   }
	   @Then("^Address2 is (.*)$")
	   public void addressCorrect2(String arg1) throws InterruptedException {  
		  HomePage home1=PageFactory.initElements(driver, HomePage.class);
		  home1.txtAddress2.sendKeys(arg1);
		  Thread.sleep(1000);
		
	   }
	   @When("^Entering city is empty$") 
	   public void city() throws InterruptedException { 
		   HomePage home1=PageFactory.initElements(driver, HomePage.class);	
		// home1.txtAddress2.sendKeys("");
		 home1.next.click();
			Alert alert=driver.switchTo().alert();
			System.out.println(alert.getText());
			Thread.sleep(1000);
			assertEquals(alert.getText(), "Please select city");
			driver.switchTo().alert().accept();
			Thread.sleep(1000);
	   }
	   @Then("^City is Bangalore$")
	   public void cityCorrect2() throws InterruptedException {  
		  HomePage home1=PageFactory.initElements(driver, HomePage.class);
		  home1.cityname.click();
		  Thread.sleep(1000);
		
	   }
	   @When("^State column is empty$") 
	   public void state() throws InterruptedException { 
		   HomePage home1=PageFactory.initElements(driver, HomePage.class);	
		 //home1.txtAddress2.sendKeys("");
		 home1.next.click();
			Alert alert=driver.switchTo().alert();
			System.out.println(alert.getText());
			Thread.sleep(1000);
			assertEquals(alert.getText(), "Please select state");
			driver.switchTo().alert().accept();
			Thread.sleep(1000);
	   }
	   @Then("^name of the State is Telangana$")
	   public void stateCorrect() throws InterruptedException {  
		  HomePage home1=PageFactory.initElements(driver, HomePage.class);
		  home1.statename.click();
		  Thread.sleep(1000);
	   }
	   @When("^membership not selected$") 
	   public void membership() throws InterruptedException { 
		   HomePage home1=PageFactory.initElements(driver, HomePage.class);	
		 
		 home1.next.click();
			Alert alert=driver.switchTo().alert();
			System.out.println(alert.getText());
			Thread.sleep(1000);
			assertEquals(alert.getText(), "Please Select MemeberShip status");
			driver.switchTo().alert().accept();
			Thread.sleep(1000);
	   }
	   @Then("^clicking on membership as a member$")
	   public void membership1() throws InterruptedException {  
		  HomePage home1=PageFactory.initElements(driver, HomePage.class);
		  home1.memberbutton.click();
			 home1.next.click();
			 Alert alert=driver.switchTo().alert();
				System.out.println(alert.getText());
				Thread.sleep(1000);
			 assertEquals(alert.getText(), "Personal details are validated.");
				driver.switchTo().alert().accept();
		  Thread.sleep(1000);
	   }
	   @When("^CardHoldername is empty$") 
	   public void cardholder() throws InterruptedException { 
		   HomePage home1=PageFactory.initElements(driver, HomePage.class);	
		 home1.txtCardholderName.sendKeys("");
		 home1.makepayment.click();
			Alert alert=driver.switchTo().alert();
			System.out.println(alert.getText());
			Thread.sleep(1000);
			assertEquals(alert.getText(), "Please fill the Card holder name");
			driver.switchTo().alert().accept();
			Thread.sleep(1000);
	   }
	   @Then("^name of the card holder name is (.*)$")
	   public void cardholder1(String arg1) throws InterruptedException {  
		  HomePage home1=PageFactory.initElements(driver, HomePage.class);
		  home1.txtCardholderName.sendKeys(arg1);
		  Thread.sleep(1000);
		   //assertEquals(home.geth1.getText(),"Added to Cart");
	   }
	  
	   @When("^debitcardnumber is empty$") 
	   public void debitcardnumber() throws InterruptedException { 
		   HomePage home1=PageFactory.initElements(driver, HomePage.class);	
		 home1.txtDebit.sendKeys("");
		 home1.makepayment.click();
			Alert alert=driver.switchTo().alert();
			System.out.println(alert.getText());
			Thread.sleep(1000);
			assertEquals(alert.getText(), "Please fill the Debit card Number");
			driver.switchTo().alert().accept();
			Thread.sleep(1000);
	   }
	   @Then("^debit card number is(.*)$")
	   public void debitcardnumber1(String arg1) throws InterruptedException {  
		  HomePage home1=PageFactory.initElements(driver, HomePage.class);
		  home1.txtDebit.sendKeys(arg1);
		  Thread.sleep(1000);
		   //assertEquals(home.geth1.getText(),"Added to Cart");
	   }
	   @When("^cvv is empty$") 
	   public void cvv() throws InterruptedException { 
		   HomePage home1=PageFactory.initElements(driver, HomePage.class);	
		 home1.txtCvv.sendKeys("");
		 home1.makepayment.click();
			Alert alert=driver.switchTo().alert();
			System.out.println(alert.getText());
			Thread.sleep(1000);
			assertEquals(alert.getText(), "Please fill the CVV");
			driver.switchTo().alert().accept();
			Thread.sleep(1000);
	   }
	   @Then("^cvv number is (.*)$")
	   public void cvv1(String arg1) throws InterruptedException {  
		  HomePage home1=PageFactory.initElements(driver, HomePage.class);
		  home1.txtCvv.sendKeys(arg1);
		  Thread.sleep(1000);
		   //assertEquals(home.geth1.getText(),"Added to Cart");
	   }
	   @When("^card expiration month$") 
	   public void expiration() throws InterruptedException { 
		   HomePage home1=PageFactory.initElements(driver, HomePage.class);	
		 home1.txtMonth.sendKeys("");
		 home1.makepayment.click();
			Alert alert=driver.switchTo().alert();
			System.out.println(alert.getText());
			Thread.sleep(1000);
			assertEquals(alert.getText(), "Please fill expiration month");
			driver.switchTo().alert().accept();
			Thread.sleep(1000);
	   }
	   @Then("^expiration month is (.*)$")
	   public void expiration1(String arg1) throws InterruptedException {  
		  HomePage home1=PageFactory.initElements(driver, HomePage.class);
		  home1.txtMonth.sendKeys(arg1);
		  Thread.sleep(1000);
		   //assertEquals(home.geth1.getText(),"Added to Cart");
	   }
	   @When("^card expiration year$") 
	   public void expiration2() throws InterruptedException { 
		   HomePage home1=PageFactory.initElements(driver, HomePage.class);	
		 home1.txtYear.sendKeys("");
		 home1.makepayment.click();
			Alert alert=driver.switchTo().alert();
			System.out.println(alert.getText());
			Thread.sleep(1000);
			assertEquals(alert.getText(), "Please fill the expiration year");
			driver.switchTo().alert().accept();
			Thread.sleep(1000);
	   }
	   @Then("^Year of expiration is (.*)$")
	   public void expiration3(String arg1) throws InterruptedException {  
		  HomePage home1=PageFactory.initElements(driver, HomePage.class);
		  home1.txtYear.sendKeys(arg1);
		  Thread.sleep(1000);
		  home1.makepayment.click();
		  Alert alert=driver.switchTo().alert();
			System.out.println(alert.getText());
			Thread.sleep(1000);
			assertEquals(alert.getText(), "Conference Room Booking successfully done!!!");
		   //assertEquals(home.geth1.getText(),"Added to Cart");
	   }
	   
}
