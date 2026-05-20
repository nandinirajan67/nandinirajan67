package testing;

import org.testng.annotations.Test;

public class DependsOnMethods {


@Test
    public void login(){
        System.out.println("LOGIN SUCCESSFULL");
    }
    @Test
    public void facebook(){
        System.out.println("FACEBOOK");
    }
    @Test(priority = -3)     //priority given
    public void amazonLogin(){
        System.out.println("AMAZON LOGIN SUCCESSFULL");
    }
    @Test
    public void laptopProduct(){
        System.out.println("SEARCH PRODUCT FOR LAPTOP");
    }
    @Test
    public void addToCart(){
        System.out.println("PRODUCT ADDED TO CART");
    }
    @Test(dependsOnMethods = {"laptopProduct","addToCart"})
    public void paymentDone(){
        System.out.println("PATMENT DONE SUCCESSFULL");
    }
}
