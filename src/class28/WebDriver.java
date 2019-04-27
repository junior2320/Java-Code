package class28;

public interface WebDriver {
//	Create a WebDriver Interface that will have the 
//	following unimplemented behaviour: openBrowser(), 
//	closeBrowser(), maximizeWindow(), findElement(). 
//	Create 2 classes that implements WebDriver interface: 
//		ChromeDriver and FirefoxDriver.
	 void openBrowser();
	 void closeBrowser();
	 void maximizeWindow();
	 void findElement();
	
}

class ChromeBrowser implements WebDriver{
	
	@Override
	public void openBrowser() {
		System.out.println("Chrome can open browser");
	}
	
	@Override
	public void closeBrowser(){
		System.out.println("X button close browser in Chrome");
		
	}
	
	@Override
	public void maximizeWindow() {
		System.out.println("Press square button maximize window in Chrome");
	}
	
	@Override
	public void findElement() {
		System.out.println("Use serech button to find an element in Chrome");
	}
}
