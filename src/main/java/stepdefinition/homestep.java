package stepdefinition;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;



import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class homestep {
	@Given("Step1")
	public void step1() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
	}

	@When("Step2")
	public void step2() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
//	io.cucumber.datatable.DataTable
	@Then("Step3")
	public void step3(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	   // throw new io.cucumber.java.PendingException();
		  List<Map<String, String>> users = dataTable.asMaps(String.class, String.class);
	        
	        // Iterate over each user and print their details
	        for (Map<String, String> user : users) {
	            String id = user.get("ID");
	           String name = user.get("Name");
	           String age = user.get("Age");
	            System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
	            // Here, you could also add logic to add users to a system
	        }
		//List<String> myList = dataTable.asList();
	//	for(String s:myList) {
			//System.out.println(s);
		//}
	}


}
