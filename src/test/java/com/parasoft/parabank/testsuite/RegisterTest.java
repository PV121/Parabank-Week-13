package com.parasoft.parabank.testsuite;

import com.parasoft.parabank.pages.HomePage;
import com.parasoft.parabank.pages.SignUpPage;
import com.parasoft.parabank.testbase.TestBase;
import org.junit.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends TestBase {
    HomePage homPage = new HomePage();
    SignUpPage signUpPage = new SignUpPage();

    @Test
    public void verifyThatSigningUpPageDisplay() {
        homPage.clickOnRegisterLink();
        String actualText = signUpPage.VerifySignUpText();
        String expectedText = "Signing up is easy!";
        Assert.assertEquals( "Verify SignUp Text", expectedText, actualText);
    }
    @Test
    public void userShouldRegisterAccountSuccessfully() throws InterruptedException {
        homPage.clickOnRegisterLink();
        signUpPage.enterFirstName("Patrick");
        signUpPage.enterLastname("Pappu");
        signUpPage.enterAddress("123 London street");
        signUpPage.enterCityName("Cambridge");
        signUpPage.enterStateName("America");
        signUpPage.enterZipCode("345737");
        signUpPage.enterPhoneNumber("98989467498");
        signUpPage.enterSnnNumber("126874");
        signUpPage.sendEmailToEmailIdField();
        signUpPage.enterPassword("123456");
        signUpPage.enterConfirmedPassword("123456");
        signUpPage.clickOnRegisterButton();
        String actualText=signUpPage.verifyAccountCreatedSuccessfully();
        String expectedText="Your account was created successfully. You are now logged in.";
        Assert.assertEquals("account successfully created text",expectedText,actualText);
    }
}
