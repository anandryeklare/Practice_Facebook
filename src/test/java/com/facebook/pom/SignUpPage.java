package com.facebook.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage extends BasePage
{
	//Declaration
	
	@FindBy(xpath = "//div[@id='fullname_field']/div[1]/div[1]/div/div[1]/input")
	private WebElement firstNameTB;
	
	@FindBy(xpath = "//div[@id='fullname_field']/div[1]/div[2]/div/div[1]/input")
	private WebElement surNameTB;
	
	@FindBy(xpath = "//div[@id='reg_form_box']/div[2]/div/div[1]/input")
	private WebElement emailTB;
	
	@FindBy(xpath = "//div[@id='reg_form_box']/div[3]/div/div/div/input")
	private WebElement ReEnterEmailTB;
	
	@FindBy(xpath = "//input[@id='password_step_input']")
	private WebElement passwordTB;
	
	@FindBy(name = "birthday_day")
	private WebElement birthDay;
	
	@FindBy(name = "birthday_month")
	private WebElement birthMonth;
	
	@FindBy(name = "birthday_year")
	private WebElement birthYear;
	
	@FindBy(xpath = "//label[text()='Male']")
	private WebElement maleRadioButton;
	
	@FindBy(xpath = "(//button[text()='Sign Up'])[1]")
	private WebElement signUpButton;
	
	//Initialization
	
	public SignUpPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	
	public void setFirstName(String fn)
	{
		firstNameTB.sendKeys(fn);
	}
	
	public void setSurName(String sn)
	{
		surNameTB.sendKeys(sn);
	}
	
	public void setEmail(String email)
	{
		emailTB.sendKeys(email);
	}
	
	public void setReEnterEmail(String ReEnterEmail)
	{
		ReEnterEmailTB.sendKeys(ReEnterEmail);
	}
	
	public void setPassword(String pn)
	{
		passwordTB.sendKeys(pn);
	}

	public void setBirthDate()
	{
		birthDay.click();
		
		Select sc=new Select(birthDay);
		sc.selectByIndex(4);
	}
	
	public void setBirthMonth()
	{
		birthMonth.click();
		
		Select sc=new Select(birthMonth);
		sc.selectByValue("7");
	}
	
	public void setBirthYear()
	{
		birthYear.click();
		
		Select sc=new Select(birthYear);
		sc.selectByVisibleText("1990");
	}
	
	public void clickOnMaleRadioButton()
	{
		maleRadioButton.click();
	}
	
	public void clickOnSignUpButton()
	{
		signUpButton.click();
	}
	
}