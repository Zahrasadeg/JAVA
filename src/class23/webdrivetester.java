package class23;

public class webdrivetester {
    public static void main(String[] args) {
        webdriver Webdriver=new safari();

        Webdriver.statrbrowser();
        Webdriver.openURL();
        Webdriver.testloginpage();
        Webdriver.closebrowser();


       /* safari safarii=new safari();
        safarii.statrbrowser();
        safarii.openURL();
        safarii.testloginpage();
        safarii.closebrowser();

        firefox ff=new firefox();
        ff.statrbrowser();
        ff.openURL();
        ff.testloginpage();
        ff.closebrowser();*/
        webdriver []browsers={new chrome(),new safari(),new firefox()};
        for (webdriver browser:browsers){
            browser.statrbrowser();
            browser.openURL();
            browser.testloginpage();
            browser.closebrowser();
        }

    }
}
