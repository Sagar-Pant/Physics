package qaClickAcademy;
import org.junit.Test;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeSuite;
public class AppiumTest {
    @Test
    public void NativeAppAndroid()
    {
        System.out.println("NativeAppAndroid");
    }
    @Test
    public void IOSApps()
    {
        System.out.println("IOS Apps");
    }
    @BeforeSuite
    public void SafariStyle()
    {
        System.out.println("This is a safari style apps paradigm!!!");
    }
    @AfterGroups()
    public  void Slow()
    {
        System.out.println("This will be executed second from the last!!!");
    }
}