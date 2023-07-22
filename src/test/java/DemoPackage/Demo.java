package DemoPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

abstract class  Computer{
	public abstract void code() ;
}
class laptop extends Computer{
	public void code() {
		System.out.println("coding, compile, run: on laptop");
	}
}
class desktop extends Computer{
	public void code() {
		System.out.println("coding, compile, run: on desk");
	}
}
class developer{
	public void devApp(Computer any){
		any.code();
	}
}
public class Demo {

	
	
	public static void main(String[] args) {
		developer dev = new developer();
		Computer lap= new laptop();
		Computer desk = new desktop();
           dev.devApp(lap);
           RemoteWebDriver driver = new ChromeDriver();
          
          
	}

}
