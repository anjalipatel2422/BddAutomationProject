package org.example;

import org.openqa.selenium.By;

public class RegisterPage extends Util {
    LoadProperty loadProperty =new LoadProperty();
   // private By _firstname=By.xpath("//input[@id=\"FirstName\"]");//path of first name
    private By _firstname = By.xpath("//input[@data-val-required=\"First name is required.\"]");
    private By _lastname=By.xpath("//input[@id=\"LastName\"]");//path of last name
    private By _Dateofbirthday=By.xpath("//select[@name=\"DateOfBirthDay\"]");//path of date of birthday
    private By _Dateofbirthmonth=By.xpath("//select[@name=\"DateOfBirthMonth\"]");//path of date of month
    private By _Dateofbirthyear=By.xpath("//select[@name=\"DateOfBirthYear\"]");//path of date of year
    private By _emailfield=By.xpath("//input[@id=\"Email\"]");//path of email
    private By _Newslertter=By.xpath("//input[@id=\"Newsletter\"]");//path of newsletter
    private By _CompanyName=By.xpath("//input[@id=\"Company\"]");//path of company
    private By _Password=By.xpath("//input[@id=\"Password\"]");//path of password
    private By _CoinfirmPassword=By.xpath("//input[@id=\"ConfirmPassword\"]");//path of confirm password
    private By _registerationbutton=By.xpath("//input[@id=\"register-button\"]");//path of register button



    public void UserEntersRegistrationDetails(){

        waituntilElementisclickble(_firstname,40);
        typeText(_firstname,loadProperty.getProperty("FirstName"));//apply resuable method for input name
        waituntilGettingText(_lastname,30);
        typeText(_lastname,loadProperty.getProperty("LastName"));//apply resuable method for input last name
        selefromdromdropdownbyvalue(_Dateofbirthday,"8");
        selectfromdropdownbyvisibletext(_Dateofbirthmonth,"April");
        selefromdromdropdownbyvalue(_Dateofbirthyear,"2010");
        typeText(_emailfield, loadProperty.getProperty("Email")+timestamp()+loadProperty.getProperty("Email1"));
        clickonElement(_Newslertter);
        typeText(_CompanyName,loadProperty.getProperty("CompanyName"));//apply resuable method for input companyname
        typeText(_Password,loadProperty.getProperty("Password"));//apply resuable method for input password
        typeText(_CoinfirmPassword,loadProperty.getProperty("ConfirmPassword"));//apply resuable method for input confirmpassword
    }

    public void userclickonregistersubmitbutton()
    { waituntilElementisclickble(_registerationbutton,20);
        clickonElement(_registerationbutton);



    }
}

