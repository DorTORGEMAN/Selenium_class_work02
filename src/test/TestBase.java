package test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import pageObject.BasePage;
import pageObject.LoginPage;
import pageObject.SignUpPage;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import static org.junit.Assert.assertEquals;


public class TestBase {
    static WebDriver driver;
    String baseUrl;
    static ExtentReports extent;
    public static ExtentTest myTest;
    private static String ReportFilePath="C:/Users/power play/IdeaProjects/Selenium_class_work02/testReport.html";
    BasePage basePage;
    SignUpPage signUpPage;
    LoginPage loginPage;

    @Before
    public void BowswerSetUp() throws Exception {
        extent=new ExtentReports(ReportFilePath);
        myTest=extent.startTest("Test is Start");
        Browser("chrome");
        driver.manage().window().maximize();

        GetUrl("HTTP:/WWW.BUYME.CO.IL");


    }


    public TestBase TwoElementEquals(WebElement element1,WebElement element2){

        String s1=element1.getText();
       String str2=element2.getText();
        assertEquals(s1,str2);

    return this;
    }

    public TestBase GetUrl(String Url){
        driver.get(Url);
        return this;
    }


 /*/   public static String BrowserFromFiles(String kEYDATA) throws Exception {
        File XmlFlies= new File("C:/קורס אוטומציה/selenemuin_classwork_01/browser.xml");
    DocumentBuilderFactory dbFactry=DocumentBuilderFactory.newInstance();
    DocumentBuilder dBuilder=dbFactry.newDocumentBuilder();
    Document doc=dBuilder.parse(XmlFlies);
    doc.getDocumentElement().normalize();
    return doc.getElementsByTagName(kEYDATA).item(0).getTextContent();
}

    public static String InformationFromFiles(String kEYDATA) throws Exception {
        File XmlFlies= new File("C:/קורס אוטומציה/selenemuin_classwork_01/user.xml");
        DocumentBuilderFactory dbFactry=DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder=dbFactry.newDocumentBuilder();
        Document doc=dBuilder.parse(XmlFlies);
        doc.getDocumentElement().normalize();
        return doc.getElementsByTagName(kEYDATA).item(0).getTextContent();
    }/*/












private static String screenShootFile(String ImagePath){
    TakesScreenshot takesScreenshot=(TakesScreenshot) driver;
    File screenShootFile=takesScreenshot.getScreenshotAs(OutputType.FILE);
    File destinationFile=new File(ImagePath+"png");
    try {
        Files.copy(screenShootFile.toPath(), destinationFile.toPath());
    }catch (IOException e){
        System.out.println(e.getMessage());
    }
    return ImagePath+"png";
}

 public void Browser(String BrowSwer) throws Exception {
       // String Website=BrowserFromFiles(BrowSwer);
        switch (BrowSwer){
            case "firefox":{
                System.setProperty("web-driver.gecko.driver","C:/קורס אוטומציה/firefox_driver/geckodriver.exe");
                driver=new FirefoxDriver();
            }break;
            case "chrome":{
                System.setProperty("web-driver.chrome.driver", "C:/קורס אוטומציה/chromedriver_win32/chromedriver.exe");
                driver = new ChromeDriver();
            }break;
        }
 }
 @After
    public void TestisFinish(){
     driver.close();
     extent.endTest(myTest);
     extent.flush();

 }

}
