package com.TestRunner;



import com.base.BaseClass;

import pageobjectmanager.PageObjectManager;

import java.time.Duration;


public class Test_Runner extends BaseClass {


    public static void main(String[] args) throws InterruptedException {

        launchBrowser(PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("browser"));
        launchUrl(PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("url"));
        PageObjectManager.getPageObjectManager().getLoginPage().validLogin();
      Thread.sleep(2000);
        PageObjectManager.getPageObjectManager().getsearchProduct().searchProduct();
            PageObjectManager.getPageObjectManager().getCheckOutPage().checkOut();
//        screenshot(PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("sceenshot"));
        PageObjectManager.getPageObjectManager().getAddressPage().addressPage();
System.out.println("hi welcome");
System.out.println("hello git");
System.out.println("Tester1");
    }}