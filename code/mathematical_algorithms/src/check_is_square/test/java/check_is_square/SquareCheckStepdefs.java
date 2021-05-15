import io.cucumber.java.en.CucumberOptions

@CucumberOptions(glue = {code.mathematical_algorithms.src.check_is_square})
public class SquareCheckStepdefs {
    @io.cucumber.java.en.When("I want to check {int}")
    public void iWantToCheck(int arg0) {
    }

    @io.cucumber.java.en.Then("The result is {string}")
    public void theResultIs(String arg0) {
    }
}
