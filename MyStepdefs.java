package shifr;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MyStepdefs {
    
    private ConEncr encrypt;
    private int SYMBOL = encrypt.SYMBOL;
    private int operand1;
    private double result;

    @Given("^I have my software encrypt$")
    public void iHaveMySoftwareEncrypt() throws Throwable {
        this.encrypt = new ConEncr();
    }

    @When("^I have entered SYMBOL as first operand$")
    public void iHaveEnteredAsFirstOperand() throws Throwable {
        this.operand1 = SYMBOL;
    }

    @And("^I press 'Get encrypt'$")
    public void iPressGetEncrypt() throws Throwable {
        this.result = encrypt.GetValue(operand1);
    }

    @Then("^The result should be (\\d+)$")
    public void theResultShouldBe(int expected) throws Throwable {
        Assert.assertEquals(expected, this.result, 1e-5);
    }
}