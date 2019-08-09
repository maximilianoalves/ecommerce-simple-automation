package utils;

public class Utils {

    public static String webdriverLocation() {
        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("mac")){
            return "./driver/chromedriver";
        } else {
            return "./driver/chromedriver.exe";
        }
    }

    public static String getBaseUrl() { return "http://automationpractice.com/"; }
}
