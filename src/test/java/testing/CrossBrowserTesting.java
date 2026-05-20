package testing;

import com.base.BaseClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class CrossBrowserTesting extends BaseClass {
    @Test
    private void edge(){
        launchBrowser("edge");
        launchUrl("https://www.google.com/");
        System.out.println("BROWSER ID:"+Thread.currentThread().getId());
    }
    @Test(enabled = false)
    private void chrome(){
        launchBrowser("chrome");
        launchUrl("https://www.google.com/");
        System.out.println("BROWSER ID:" +Thread.currentThread().getId());
    }
    @Ignore
    @Test
    private void firefox(){
        launchBrowser("firefox");
        launchUrl("https://www.google.com/");
        System.out.println("BROWSER ID:"+Thread.currentThread().getId());
    }
}
