package com.orangehrm.pages.dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.orangehrm.pages.BasePage;

public class DashBoardPage extends BasePage {

	public DashBoardPage(EventFiringWebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public By dashBoardLabel = By.xpath("//h1[text()='Dashboard']");
	@FindBy(xpath = "//h1[text()='Dashboard']")
	public WebElement lblDashboard;

}
