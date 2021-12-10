package pageObjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends Page {

    private static final Logger LOG = LogManager.getLogger(HomePage.class);

    @AndroidFindBy(id = "com.carrefour.fid.android:id/view_splash_content")
    private MobileElement splashView;


    /**
     * For applications that have a splashscreen, this function waits for the splashscreen to be crossed
     */
    public void waitForAppLoading() {
        if(loadingWaitUntil(ExpectedConditions.invisibilityOf(splashView))) {
            LOG.info("The application has successfully been loaded");
        } else {
            LOG.warn("The application is stucked on the splash screen");
        }
    }

}
