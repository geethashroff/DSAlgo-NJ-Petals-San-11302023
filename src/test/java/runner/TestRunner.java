package runner;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.junit.Cucumber;
	
@RunWith(Cucumber.class) //Junit execution

	@CucumberOptions(
			plugin = {"pretty", "html:target/sange.html"}, //reporting purpose
			monochrome=false,  //console output color

			tags = "", //tags from feature file @signin
			features = {"src/test/resources/features/"}, //location of feature files
			//features= {"07Stack , "02DSDataStructure.feature" , 08Queue.feature, 05Arrays, 01DSHome.feature, 03signin.feature, 06Linkedlist,09Tree,10Graph},
			glue= {"stepDefinition" , "appHooks"}) //location of step definition files
=======
			tags = "@tag", //tags from feature file
			features = {"src/test/resources/features"}, //location of feature files
			glue= "steps") //location of step definition files
>>>>>>> origin/master


	public class TestRunner extends AbstractTestNGCucumberTests{
		
		@Override
	    @DataProvider(parallel = false)
	    public Object[][] scenarios() {
					
			return super.scenarios();
	    }


}
