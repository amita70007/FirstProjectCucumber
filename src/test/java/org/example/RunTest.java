package org.example;

import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = ".", tags="@test1,@test2,@test3",format = {"pretty","html:target/Destination"}
        )

public class RunTest {
}
