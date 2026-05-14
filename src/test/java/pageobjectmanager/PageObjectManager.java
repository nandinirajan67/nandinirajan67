package pageobjectmanager;

import pageobjectmodel.*;
import com.utility.FileReaderManager;

public class PageObjectManager {

    private static SearchProduct searchProduct;
    private static LoginPage loginPage;
    private static FileReaderManager fileReader;
    private static PageObjectManager pageObjectManager;
    private static CheckOut checkOut;
    private static AddressPage addressPage;

    public LoginPage getLoginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }

    public FileReaderManager getFileReader() {
        if (fileReader == null) {
            fileReader = new FileReaderManager();
        }
        return fileReader;
    }

    public static PageObjectManager getPageObjectManager() {
        if (pageObjectManager == null) {
            pageObjectManager = new PageObjectManager();
        }
        return pageObjectManager;
    }

    public SearchProduct getsearchProduct() {
        if (searchProduct == null) {
            searchProduct = new SearchProduct();
        }
        return searchProduct;
    }

    public CheckOut getCheckOutPage() {
        if (checkOut == null) {
            checkOut = new CheckOut();
        }
        return checkOut;

    }

    public AddressPage getAddressPage() {
        if (addressPage == null) {
            addressPage = new AddressPage();
        }
        return addressPage;
    }
}