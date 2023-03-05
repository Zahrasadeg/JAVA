package class23;

public class webdriver {
    public void statrbrowser(){
        System.out.println("starting the browser");
    }
    public void openURL(){
        System.out.println("opening a url");
    }
    public  void testloginpage(){
        System.out.println("checking if login page work");
    }
    public void closebrowser(){
        System.out.println("closing the browser");
    }
}
class chrome extends webdriver{
    @Override
    public void statrbrowser() {
        System.out.println("start goole chrome");
    }

    @Override
    public void openURL() {
        System.out.println("opening a url");
    }

    @Override
    public void testloginpage() {
        System.out.println("testing login page");
    }

    @Override
    public void closebrowser() {
        System.out.println("closing the google chrome");
    }
}
class safari extends webdriver{
    @Override
    public void statrbrowser() {
        System.out.println("start safari");
    }

    @Override
    public void openURL() {
        System.out.println("opening a url");
    }

    @Override
    public void testloginpage() {
        System.out.println("testing loign page");
    }

    @Override
    public void closebrowser() {
        System.out.println("closing the safari");
    }
}
class firefox extends webdriver{
    @Override
    public void statrbrowser() {
        System.out.println("openning the firefox");
    }

    @Override
    public void openURL() {
        System.out.println("openning url");
    }

    @Override
    public void testloginpage() {
        System.out.println("testing login firefox");
    }

    @Override
    public void closebrowser() {
        System.out.println("closing the firefox browser");
    }
}
