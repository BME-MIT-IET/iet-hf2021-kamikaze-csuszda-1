package string_algorithms;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class AnagramCheckStepdefs {

    Boolean isAnagram;

    @When("I check {string} and {string}")
    public void CheckIfAnagram(String str1, String str2) {
        isAnagram = AnagramSearch.isAnagram(str1, str2);
    }

    @Then("The result is {string}")
    public void TheResultIs(String result) {
        Assertions.assertEquals(isAnagram.toString(), result);
    }
}
