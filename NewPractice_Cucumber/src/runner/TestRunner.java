package runner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features="newTours",glue= {"newToursAppLoginTest"})

public class TestRunner {

}
