package com.parasoft.parabank.pages;

import com.parasoft.parabank.utility.Utility;
import org.openqa.selenium.By;

public class AccountOverviewPage extends Utility {
    By logOut=By.xpath("//a[contains(text(),'Log Out')]");

    public void clickOnLogOutBtn(){
        clickOnElement(logOut);
    }
}
