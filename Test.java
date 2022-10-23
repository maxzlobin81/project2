package Project2;

public class Test {
    public static void main(String[] args) {

        ChromeDriver chromedriver = new ChromeDriver() {
            @Override
            public void navigate() {

            }
        };

    }
    FirefoxDriver firefoxdriver = new FirefoxDriver() {
        @Override
        public void navigate() {

        }
    };
    SafariDriver safaridriver=new SafariDriver() {
        @Override
        public void navigate() {

        }
    };
    abstract static class ChromeDriver implements RemoteWebDriver {

    }

    abstract class FirefoxDriver implements RemoteWebDriver {

    }

    abstract class SafariDriver implements RemoteWebDriver {

    }
}