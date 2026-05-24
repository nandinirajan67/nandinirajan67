package listerner;

import com.aventstack.extentreports.ExtentTest;
import com.base.BaseClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;

public class ExtendReport_Test {
    public static ExtentTest extentTest;
    @BeforeSuite
    public void extentTestReportStartup(){
        BaseClass base=new BaseClass() {
        };
    base.extentReportStart(null);

}
@AfterSuite
public void extentreportEnd() throws IOException {
    BaseClass base=new BaseClass() {
    };
    base.extentReportTearDown(null);
}}