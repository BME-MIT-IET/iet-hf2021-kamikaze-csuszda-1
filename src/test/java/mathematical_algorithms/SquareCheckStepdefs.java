package mathematical_algorithms;

import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;

public class SquareCheckStepdefs {

        Boolean isSquare;

        @When("I check if {int} is square")
        public void CheckIfSquare(int num) {
                isSquare = CheckisSquare.checkIsSquare(num);
        }

        @Then("The answer is {string}")
        public void TheAnswerIs(String result) {
                Assertions.assertEquals(isSquare.toString(), result);
        }

}
