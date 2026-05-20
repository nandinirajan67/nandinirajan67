package testing;


import org.testng.annotations.Test;

public class PriorityClass {
@Test(priority = -3)
    public void amazon(){
        System.out.println("Amazon");
    }
    public void faceBook(){
        System.out.println("FACEBOOK");
    }
    @Test(priority = 2)
    public void instagram(){
        System.out.println("INSTAGRAM");
    }
    @Test(priority=-4)
    public void flipkart(){
        System.out.println("FLIPKART");
    }
}
