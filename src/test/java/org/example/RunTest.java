package org.example;

import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:features/registration.feature"},
        glue = {"com.examples.cucumber"})

public class RunTest {
}
