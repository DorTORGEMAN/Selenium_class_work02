package test;


import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.junit.Test;
import org.junit.rules.TestName;
import org.openqa.selenium.By;


public class TestEmail extends TestBase {

    @Test
    public void TestFieldEMAIL(){
        GetUrl("HTTP:/WWW.BUYME.CO.IL");
         myTest = extent.startTest("TEST01 EMAILL Field Allow");
         myTest.log(LogStatus.INFO,"Check if i put Wrong Email in field display messenger");
         loginPage.LoginPop();
        signUpPage.SignUpEmail("ddsddasd");
        ErrorEmailMESERGE(By.cssSelector("li[class='parsley-type']"));
        myTest.log(LogStatus.PASS,"");

    }
}
