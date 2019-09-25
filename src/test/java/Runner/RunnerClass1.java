package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature\\TagDemo.feature",glue= {"StepDef"},plugin= {"html:target/cucumber.html"},tags= { "@RegressionTest,@SmokeTest"})
public class RunnerClass1 
{

}
