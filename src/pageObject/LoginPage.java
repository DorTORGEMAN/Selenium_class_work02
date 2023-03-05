package pageObject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
///
public class LoginPage extends BasePage {
//------Web Elements-----//

    By PopUPLogin=By.className("notSigned");
    By EmailLogin=By.cssSelector("input[placeholder='מייל']");
    By PasswordLogin=By.cssSelector("input[required type='password']");
    By ForgetPasswordLogin=By.cssSelector("u [class='bm-body-2 text-link theme db']+ u:contains('שכחתי את הסיסמה') ");
    By FaceBookLogin=By.cssSelector("div [aria-label='התחבר באמצעות facebook']");
    By GoogleLogin=By.cssSelector("div [aria-label='התחבר באמצעות google']");
    By CloseLogin=By.cssSelector("span [alt='סגירה' title='סגירה']");
    By RemeberMeLogin=By.cssSelector("div [aria-labelledby='זכור אותי']span[class='circle']");
    By LoginToUSER=By.cssSelector("button [gtm='כניסה ל-BUYME']");
    By RegisterLogin=By.partialLinkText("להרשמה");

//------page Methods-----//

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void LoginPop(){
      Click(PopUPLogin);
    }
public LoginPage inputEmail(String email){
    driver.findElement(EmailLogin).sendKeys(email);
    return this;
}

    public LoginPage InputPassword(String password){
     driver.findElement(PasswordLogin).sendKeys(password);
        return this;
    }

    public LoginPage ForgetPassword(){
        driver.findElement(ForgetPasswordLogin).click();
        return this;
    }

    public LoginPage RemeberME(){
        boolean RemeberMEclick=driver.findElement(RemeberMeLogin).isSelected();
        if(!RemeberMEclick)
            driver.findElement(RemeberMeLogin).click();
        return this;
    }

    public LoginPage FacebookLogin(){
       driver.findElement(FaceBookLogin).click();
        return this;
    }

    public LoginPage Googlelogin(){
        driver.findElement(GoogleLogin).click();
        return this;
    }

    public LoginPage ClosePopUP(){
        driver.findElement(CloseLogin).click();
        return this;
    }

    public LoginPage Loginuser(){
        driver.findElement(LoginToUSER).click();
        return this;
    }

    public LoginPage RegistertoWEBSTIE(){
        driver.findElement(RegisterLogin).click();
        return this;
    }

}
