package runner;


import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@Cucumber.Options(features="features/taggedhooks.feature",
              glue={"stepDefinitions"},
              format= {"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_output/cucumber.xml"},//to generate different types of report
              monochrome=true,//display console output in readable format
              strict=true,
              dryRun=true
              //tags= {"@RegressionTest ,@SmokeTest"}
		)

///tags= {"@RegressionTest ,@SmokeTest"})----execute all tests tagged as @RegressionTest  OR @SmokeTest
///tags= {"@RegressionTest" ,"@SmokeTest"})----execute all tests tagged as @RegressionTest  AND @SmokeTest
///tags= {"~@RegressionTest" ,"~@SmokeTest"})----execute all tests tagged as ignored
////check the step mentioned in feature file is mentioned or not in step definition  dryRun=true
//credentialmap.feature--contains data tables with map
//features/data.feature--contains with only one row data
//features/Login.feature--contains with example & without example
public class TestRunner {

}
//features="features