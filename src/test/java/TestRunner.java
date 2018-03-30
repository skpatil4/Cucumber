package test.java;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//@CucumberOptions(tags={"@high"},features="test/resources/",monochrome=true)   - Simple
//@CucumberOptions(tags={"@high","@mid"},features="test/resources/",monochrome=true)  - AND
//@CucumberOptions(tags={"@high,@mid"},features="test/resources/",monochrome=true)  - OR
//@CucumberOptions(tags={"~@high","~@neg"},features="test/resources/",monochrome=true) - NOT
@CucumberOptions(features="C:\\SDET_workspace\\CucumberTest\\src\\test\\resources\\Calculator.feature",monochrome=true)
@RunWith(Cucumber.class)
public class TestRunner {

}
