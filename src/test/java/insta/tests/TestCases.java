package insta.tests;

import com.subhist.config.BaseSetup;
import org.testng.annotations.Test;

public class TestCases extends BaseSetup {



    @Test(priority = 1)
    public void addAText() throws InterruptedException {
        homePageActions.addText();
        addNotePageActions.addText();

    }
}
