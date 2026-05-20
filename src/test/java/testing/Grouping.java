package testing;

import org.testng.annotations.Test;

public class Grouping {
    @Test(groups="laptop")
    public void lenovo(){
        System.out.println("LENOVO");
    }
    @Test(groups="laptop")
    public void hp(){
        System.out.println("HP");
    }
    @Test(groups="laptop")
    public void asus(){
        System.out.println("ASUS");
    }
    @Test(groups="mobile")
    public void samsung(){
        System.out.println("SAMSUNG");
    }
    @Test(groups="mobile")
    public void onePlus(){
        System.out.println("ONEPLUS");
    }
    @Test(groups="mobile")
    public void redmi(){
        System.out.println("REDMI");
    }
    @Test(groups = "washingmachine")
    public void wirphool(){
        System.out.println("WIRPHOOL");
    }
    @Test(groups = "washingmachine")
    public void lg(){
        System.out.println("LG");
    }
    @Test(groups = "washingmachine")
    public void bosh(){
        System.out.println("BOSH");
    }
}
