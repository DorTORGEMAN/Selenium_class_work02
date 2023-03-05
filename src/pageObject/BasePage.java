package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.Text;
import test.TestBase;

import java.time.Duration;
import java.util.List;


public class BasePage {
WebDriver driver;
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));

    public BasePage(WebDriver driver) {
    }


//Methods//

    public BasePage LocationElemanets(By LocationElemanets){
        PageFactory.initElements(driver,this);
        waitVisibility(LocationElemanets);
        return this;
    }
        public void waitVisibility(By SomeTHING) {
            try { Thread.sleep(2000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }wait.until(ExpectedConditions.visibilityOfElementLocated(SomeTHING));
        }
        public BasePage Click(By LocationEle) {
        waitVisibility(LocationEle);
        driver.findElement(LocationEle).click();
        return this; }

        public BasePage ItemSelect(By Something, String Text)
            {
                WebElement SelectedCombo= driver.findElement(Something);
                Select Selectcombo=new Select(SelectedCombo);
                Selectcombo.selectByValue(Text);
                return this;
            }
    public BasePage ErrorEmailMESERGE(By by){
        WebElement element=driver.findElement(by);
        boolean disp=element.isDisplayed();
        if (disp)
            System.out.println(element.getText()+": =-)");
        else {
            System.out.println("Error");
        }
        return this;
    }

    }







