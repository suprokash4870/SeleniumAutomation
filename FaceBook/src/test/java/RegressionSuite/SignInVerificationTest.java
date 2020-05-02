package RegressionSuite;

import Base.DriverSetUp;
import Regression.FaceBookSignIn;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

public class SignInVerificationTest extends DriverSetUp {

    FaceBookSignIn  faceBookSignIn;

    @BeforeMethod
    public void init(){
        faceBookSignIn = PageFactory.initElements(driver, FaceBookSignIn.class);
    }

    @Test
    public void TestSignIn(){
    faceBookSignIn.SignInVerification("suprokashsanyal@yahoo.com","ashok4870" );
    }

    @AfterMethod
    public void CloseApp(){
        //driver.quit();
    }
}
