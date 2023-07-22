package DemoPackage;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoTestNG {

	@Test
	void show() {
		
		WebDriverManager.chromedriver().setup();
	}
}
