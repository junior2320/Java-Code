package class28;

public class WebDriverTest {
	
	public static void main(String []args) {
		
		WebDriver web =new ChromeBrowser();
		web.openBrowser();
		web.closeBrowser();
		web.maximizeWindow();
		web.findElement();
	}

}
