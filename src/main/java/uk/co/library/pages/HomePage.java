package uk.co.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.co.library.utility.Utility;

public class HomePage extends Utility {
    @CacheLookup
    @FindBy(xpath= "//input[@id='keywords']")
    WebElement jobTitle;
    @CacheLookup
    @FindBy(id= "location")
    WebElement location;
    @CacheLookup
    @FindBy(id = "distance")
    WebElement distanceDropDown;
    @CacheLookup
    @FindBy(id = "toggle-hp-search")
    WebElement moreSearchOptionLink;
    @CacheLookup
    @FindBy(id = "salarymin")
    WebElement salaryMin;
    @CacheLookup
    @FindBy(id = "salarymax")
    WebElement salaryMax;
    @CacheLookup
    @FindBy(id = "salarytype")
    WebElement salaryTypeDropDown;
    @CacheLookup
    @FindBy(id = "tempperm")
    WebElement jobTypeDropDown;
    @CacheLookup
    @FindBy(id = "hp-search-btn")
    WebElement findJobsBtn;
    public void enterJobTitle(String name)

    {
        Reporter.log("enter job title"+jobTitle.toString());
      // CustomListeners.test.log(Status.PASS,"job title"+jobTitle);
        sendTextToElement(jobTitle,name);
    }
    public void enterLocation(String loc)
    {
        Reporter.log("enter location"+location.toString());
        //CustomListeners.test.log(Status.PASS,"enter location"+location);
        sendTextToElement(location,loc);
    }
    public void selectDistance(String dist)

    {   Reporter.log("select distance from dropdown"+distanceDropDown.toString());
        //CustomListeners.test.log(Status.PASS,"select distance"+distanceDropDown);
        selectByVisibleTextFromDropDown(distanceDropDown,dist);}
    public void clickOnMoreSearchOptionLink(){
        Reporter.log("click on more search"+moreSearchOptionLink.toString());
        //CustomListeners.test.log(Status.PASS,"click on more search"+moreSearchOptionLink);
        clickOnElement(moreSearchOptionLink);
    }
    public void enterMinSalary(String minSalary){
        Reporter.log("enter salary minimum"+salaryMin.toString());
      //  CustomListeners.test.log(Status.PASS,"Enter minimum salary"+salaryMin);
        sendTextToElement(salaryMin,minSalary);
    }
    public void enterMaxSalary(String maxSalary){
        Reporter.log("enter maximum salary"+maxSalary.toString());
      //  CustomListeners.test.log(Status.PASS,"enter max salary"+maxSalary);
        sendTextToElement(salaryMax,maxSalary);
    }
    public void selectSalaryType(String sType){
        Reporter.log("verify text"+salaryTypeDropDown.toString());
       // CustomListeners.test.log(Status.PASS,"job type"+salaryTypeDropDown);
        selectByVisibleTextFromDropDown(salaryTypeDropDown,sType);
    }
    public void selectJobType(String jobType){
        Reporter.log("select job type"+jobType.toString());
       // CustomListeners.test.log(Status.PASS,"job type"+jobType);
        selectByVisibleTextFromDropDown(jobTypeDropDown,jobType);
    }
    public void clickOnFindJobs(){
        Reporter.log("click on find job"+findJobsBtn.toString());
      //  CustomListeners.test.log(Status.PASS,"click on find job"+findJobsBtn);
        clickOnElement(findJobsBtn);
    }


}
