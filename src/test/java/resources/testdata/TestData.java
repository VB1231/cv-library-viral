package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {
    @DataProvider(name = "credentials")
    public Object[][] getData(){
        Object[][] data = new Object[][]{
                {"Tester","Harrow","up to 5 miles","30000","500000","Per annum","Permanent","Permanent"},
              {"Customer Service","Watford","up to 10 miles","40000","600000","Per month","Contract","Contract"},
                {"Accountant","Scotland","up to 15 miles","1000","10000","Per week","Part Time","Part Time"},
                {"Teacher","Luton","up to 10 miles","400","1000","Per day","Temporary","Temporary"},
                {"Data Entry","Wells","up to 10 miles","40000","600000","Per month","Apprenticeship","Apprenticeship"},
                {"Software Developer","Cardiff","up to 20 miles","400","2000","Per day","Apprenticeship","Apprenticeship"},
                {"Tester","Leicestershire","up to 5 miles","30000","500000","Per annum","Permanent","Permanent"}


        };
        return data;
    }
}
