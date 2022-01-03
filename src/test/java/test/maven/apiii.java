package test.maven;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class apiii {
	public static void main(String[] args) {
			WebDriver driver;
			
			@BeforeClass
			public void setup() {
				System.setProperty("webdriver.chrome.driver","C:\\Users\\FAIZAN KHAN\\Documents\\chromedriver.exe");

				driver=new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				
				
			}
			@Test(dataProvider="LoginData")
			public void LoginTest(String user,String pwd,String exp)
			{
				System.out.println(user+pwd+exp);
			}
			@DataProvider(name="LoginData")
			public String[][] getData()
			{
				String LoginData[][]= {
						               {"admin@yourstore.com","admin","Valid"},
						               {"admin@yourstore.com","admin","invalid"},
						               {"adm@yourstore.com","admin","invalid"},
						               {"adm@yourstore.com","admin","invalid"},

				};
			return LoginData;
			}
			@AfterClass
			void tearDown() {
				
			}

		}
}
	}

}
