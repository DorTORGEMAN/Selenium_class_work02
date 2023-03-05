package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage extends BasePage {
    public SignUpPage(WebDriver driver){
        super(driver);
    }
    public WebDriver driver;


    ///Elements///
    By SignUpLoginUser=By.cssSelector("div[class='register-or-login'] span:contains('#לכניסה')");
    By SignUPFirstName=By.cssSelector("input[placeholder='שם פרטי']");
    By SignUp_Email=By.cssSelector("input[tuaandiinputdiscrp='* מייל]'");
    By SignUpPassWORD=By.cssSelector("input[tuaandiinputdiscrp='* סיסמה']");
    By SignUpPassWordAllow=By.cssSelector("input[tuaandiinputdiscrp='אימות סיסמה'][data-parsley-equalto-message='הסיסמאות לא זהות, אולי זה מהתרגשות :)']");
    By SignUpAgreeBox=By.cssSelector("div[aria-labelledby='אני מסכימ/ה למדיניות הפרטיות ולתנאי השימוש ב-BUYME שתאסוף עלי מידע לצורך תפעול שוברי המתנה.']");
    By SignUpAgreeNewsBox=By.cssSelector("path[class='border']+ span:contains('אישור קבלת דיוור פרסומי מ-BUYME, בכל מדיה. מבטיחים לשלוח רק מה שמעניין :)')");
    By SignUpFaceBOOK=By.cssSelector("div[class='social-btn facebook'");
    By SignUpGoogle=By.className("social-btn google");
    By SignUpClosePopup=By.cssSelector("span[class='close-btn'][title='סגירה']");
    By SignUpNewUser=By.cssSelector("button[type='submit']+ span:contains('הרשמה ל-BUYME')");
    By SignUpErrorEmail=By.cssSelector("li[class='parsley-type']");

    ///Methods///

    public SignUpPage signUpPopup(){
        driver.findElement(SignUpLoginUser).click();
        return this;
    }
    public SignUpPage signUpFirstname(String FirstName){
        driver.findElement(SignUPFirstName).sendKeys(FirstName);
        return this;
    }
    public SignUpPage SignUpEmail(String email){
        driver.findElement(SignUp_Email).sendKeys(email);
        return this;
    }
    public SignUpPage SignUpPassword(String password){
        driver.findElement(SignUpPassWORD).sendKeys(password);
        return this;
    }
    public SignUpPage signUpPasswordAllow(String password_Allow){
        driver.findElement(SignUpPassWordAllow).sendKeys(password_Allow);
        return this;
    }
    public SignUpPage signUpAgree(){
        boolean signUpAgree=driver.findElement(SignUpAgreeBox).isSelected();
        if(!signUpAgree)
            driver.findElement(SignUpAgreeBox).click();
        return this;
    }
    public SignUpPage SignUpAgreeNEWS(){
        boolean signUpNews=driver.findElement(SignUpAgreeNewsBox).isSelected();
        if(!signUpNews)
            driver.findElement(SignUpAgreeNewsBox).click();
        return this;
    }
    public SignUpPage FaceBook(){
        driver.findElement(SignUpFaceBOOK).click();
        return this;
    }
    public SignUpPage Google(){
        driver.findElement(SignUpGoogle).click();
        return this;
    }
    public SignUpPage SignupClose(){
        driver.findElement(SignUpClosePopup).click();
        return this;
    }
    public SignUpPage signUp_Submit(){
        driver.findElement(SignUpNewUser).click();
        return this;
    }
    public  SignUpPage signUp_ErrorMail(){
        return this;
    }
}
