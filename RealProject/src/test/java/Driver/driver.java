package Driver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.sun.jna.platform.FileUtils;

public class driver {
	


@Test
public static void screenshot(WebDriver webdriver) throws IOException{
	
File src = ((TakesScreenshot)webdriver).getScreenshotAs(OutputType.FILE);
org.apache.commons.io.FileUtils.copyFile(src, new File("C:\\Users\\anand\\Desktop\\sel\\Jtest\\RealProject\\src\\test\\resources\\output\\new.jpeg"));
System.out.println("scrennshot done");
        
    }

	}
	

