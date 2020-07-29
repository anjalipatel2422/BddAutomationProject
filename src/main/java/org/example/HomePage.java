package org.example;

import org.openqa.selenium.By;

public class HomePage extends Util{
    private By _NopcommerceSymbol=By.xpath("//img[@alt=\"nopCommerce demo store\"]");//path of nopcommerce symbol
    private By _registerButton=By.xpath("//a[text()=\"Register\"]");//path of registerbutton
    public void clickonnopcommertext(){
        clickonElement(_NopcommerceSymbol);
    }

    public void clickOnRegisterButton(){//create method
        waituntilElementisclickble(_registerButton,20);//apply explicit wait
        clickonElement(_registerButton);//click on register button

    }}
