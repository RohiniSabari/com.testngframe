package stepdefinition;

import java.util.Scanner;

import io.cucumber.java.en.*;

public class Factorialstep {
	
@Given("Give some number")
public void give_some_number() {
	
	

    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
	System.out.println("Find the factorial");
}

@When("Calculate and print the factorial value")
public void calculate_and_print_the_factorial_value() {
	
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
	int fact=1;
	int i=2;
	System.out.println("Enter the number");
	Scanner s=new Scanner(System.in);
	int num=s.nextInt();
	while(i<=num) {
		fact=fact*i;
		i++;}
		System.out.println(fact);
	s.close();
}

@Then("The output is displayed")
public void the_output_is_displayed() {
	
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	System.out.println("The factorial value is displayed");
}

}
