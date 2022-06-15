package task.tests;

import com.subhist.config.BaseSetup;
import org.testng.annotations.Test;

public class TestCases extends BaseSetup {



    @Test(priority = 1)
    public void addAReminderMultipleTimes() throws InterruptedException {
        homePageActions.goToadd();
        addNotePageActions.addText("reminder");
        homePageActions.goToAddUsingPlusButton();
        addNotePageActions.addText("reminder");
    }


    @Test(priority = 2)
    public void searchForCreatedReminder(){
        homePageActions.searchTheNotes();


    }

    @Test(priority = 3)
    public void changeTheViewToGridView(){
        homePageActions.goToViewAndBackUpOptions();
        homePageActions.goToViewOptions();
        homePageActions.selectGridView();


    }

    @Test(priority = 4)
    public void addACalender(){
        homePageActions.goToCalender();
        calenderPageActions.selectDateToAddtoCalnder();
        addNotePageActions.addText("calender");
    }



    @Test(priority = 5)
    public void DeleteTheReminder(){
        homePageActions.deleteReminder();
    }




}
