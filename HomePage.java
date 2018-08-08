package com.cg.MK_153057Test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

	@FindBy(how=How.ID,using="txtFirstName")
	 WebElement txtFirstName;
	@FindBy(how=How.ID,using="txtLastName")
	 WebElement txtLastName;
	@FindBy(how=How.ID,using="txtEmail")
	 WebElement txtEmail;
	@FindBy(how=How.ID,using="txtPhone")
	 WebElement txtPhone;
	@FindBy(how=How.NAME,using="size")
	 WebElement peopleAttending;
	@FindBy(how=How.XPATH,using="/html/body/form/table/tbody/tr[5]/td[2]/select/option[3]")
	 WebElement people;	 
	@FindBy(how=How.ID,using="txtAddress1")
	 WebElement txtAddress1;
	@FindBy(how=How.ID,using="txtAddress2")
	 WebElement txtAddress2;
	@FindBy(how=How.XPATH,using="/html/body/form/table/tbody/tr[9]/td[2]/select")
	 WebElement city;
	@FindBy(how=How.XPATH,using="/html/body/form/table/tbody/tr[9]/td[2]/select/option[3]")
	 WebElement cityname;
	@FindBy(how=How.XPATH,using="/html/body/form/table/tbody/tr[10]/td[2]/select")
	 WebElement state;
	@FindBy(how=How.XPATH,using="/html/body/form/table/tbody/tr[10]/td[2]/select/option[5]")
	 WebElement statename;
	 @FindBy(how=How.NAME,using="memberStatus")
	 WebElement memberbutton;
	 @FindBy(how=How.XPATH,using="/html/body/form/table/tbody/tr[14]/td/a")
	 WebElement next;
	 @FindBy(how=How.ID,using="txtCardholderName")
	 WebElement txtCardholderName;
	 @FindBy(how=How.ID,using="txtDebit")
	 WebElement txtDebit;
	 @FindBy(how=How.ID,using="txtCvv")
	 WebElement txtCvv;
	 @FindBy(how=How.ID,using="txtMonth")
	 WebElement txtMonth;
	 @FindBy(how=How.ID,using="txtYear")
	 WebElement txtYear;
	 @FindBy(how=How.XPATH,using="//*[@id=\"btnPayment\"]")
	 WebElement makepayment;
}
