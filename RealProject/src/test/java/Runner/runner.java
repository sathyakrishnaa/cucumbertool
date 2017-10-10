package Runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.ExtentCucumberFormatter;
import com.cucumber.listener.ExtentProperties;
import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
		
@CucumberOptions(
		features={"C:\\Users\\anand\\Desktop\\sel\\Jtest\\RealProject\\src\\test\\resources\\features"},
		glue={"StepDefinitions"},
				plugin =  {"com.cucumber.listener.ExtentCucumberFormatter:output/report.html"})
public class runner {
	
	 @BeforeClass
	    public static void initial()
	    {
		
		// ExtentCucumberFormatter.initiateExtentCucumberFormatter();
		 
    
	    }
}


