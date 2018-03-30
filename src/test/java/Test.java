package test.java;


import test.java.Add;





import org.junit.Assert;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test {

	
		int firstNumber, secondNumber;
		String opt;
		int result;
		
		WebDriver driver;
		
		
		@Given("^Input price as \"([^\"]*)\" and Input quatity as \"([^\"]*)\"$")
		public void Input_price_as_and_Input_quatity_as(String arg1, String arg2) throws Throwable {
		    // Express the Regexp above with the code you wish you had
		    //throw new PendingException();
			firstNumber=Integer.parseInt(arg1);
			secondNumber=Integer.parseInt(arg2);
		}

		@When("^\"([^\"]*)\" button is clicked$")
		public void button_is_clicked(String arg1) throws Throwable {
		    // Express the Regexp above with the code you wish you had
		    //throw new PendingException();
			opt=arg1.trim();
			System.out.println("Option:"+opt);
		}

		@Then("^Result field should be populated with \"([^\"]*)\"$")
		public void Result_field_should_be_populated_with(String arg1) throws Throwable {
		    // Express the Regexp above with the code you wish you had
		    //throw new PendingException();
			if(opt.equalsIgnoreCase("Add"))
			{
				
				result=Add.addtion(firstNumber,secondNumber);
				System.out.println("Addition"+result);
			}
			
			else if(opt.equalsIgnoreCase("Multiply"))
			{
				//System.out.println("\n"+opt);
				result=Add.multiplication(firstNumber,secondNumber);
				System.out.println("multiplication"+result);
				
			}
			else if(opt.equalsIgnoreCase("Sub"))
			{
				//System.out.println("\n"+opt);
				result=Add.subtraction(firstNumber,secondNumber);
				System.out.println("subtraction"+result);
				
			}
			else if(opt.equalsIgnoreCase("Division"))
			{
				//System.out.println("\n"+opt);
				result=Add.division(firstNumber,secondNumber);
				System.out.println("division"+result);
				
			}
			Assert.assertEquals(Integer.parseInt(arg1), result);
		}
		
	}


