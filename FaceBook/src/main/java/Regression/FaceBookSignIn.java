package Regression;

import Base.DriverSetUp;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FaceBookSignIn extends DriverSetUp {

    @FindBy (xpath = "//*[@id=\"email\"]")
    WebElement email;
    @FindBy (xpath = "//*[@id=\"pass\"]")
    WebElement password;
    @FindBy (xpath = "//*[@id=\"u_0_b\"]")
    WebElement loginButton;


    public void SignInVerification(String Email,String PassWord){

        email.sendKeys(Email);
        password.sendKeys(PassWord);
        loginButton.click();

    }


}
