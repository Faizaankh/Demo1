package test.maven;


import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class apiiii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("C:\\ProgramData\\Microsoft\\Windows\\Start Menu\\Programs\\Microsoft Office\\Microsoft Office Excel 2007\\datademo.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook();
		 WebDriver = new ChromeDriver();
		 driver.manage().timeouts();

	}

}
