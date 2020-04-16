package uk.co.expedia.pages;

import org.openqa.selenium.By;
import uk.co.expedia.utility.Utility;

/**
 * Created by Pradip
 */
public class AccountPage extends Utility {
    By accountLink = By.xpath("//button[@id='header-account-menu']");


    public void clickOnAccountButton() {
        clickOnElement(accountLink);
    }
}
