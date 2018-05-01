package shifr;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MyStepdefs {
    
    private ConEncr encrypt;
    private ConDescrypt descrypt;
    private int SYMBOL = encrypt.SYMBOL;
	private int A = encrypt.A;
    private int B = encrypt.B;
    private int C = encrypt.C;
    private int D = encrypt.D;
    private int E = encrypt.E;
    private int G = encrypt.G;
    private int J = encrypt.J;
    private int T = encrypt.T;
    private int AA = descrypt.A;
    private int BB = descrypt.B;
    private int CC = descrypt.C;
    private int DD = descrypt.D;
    private int EE = descrypt.E;
    private int GG = descrypt.G;
    private int JJ = descrypt.J;
    private int TT = descrypt.T;
    private int operand1;
    private double operand2;
    private double result;

    @Given("^I have my software encrypt$")
    public void iHaveMySoftwareEncrypt() throws Throwable {
        this.encrypt = new ConEncr();
    }

    @When("^I have entered SYMBOL as first operand$")
    public void iHaveEnteredAsFirstOperand() throws Throwable {
        this.operand1 = SYMBOL;
    }

	@When("^I have entered A as first operand$")
    public void iHaveEnteredAsFirstOperandA() throws Throwable {
        this.operand1 = A;
    }

    @When("^I have entered B as first operand$")
    public void iHaveEnteredAsFirstOperandB() throws Throwable {
        this.operand1 = B;
    }

    @When("^I have entered C as first operand$")
    public void iHaveEnteredAsFirstOperandC() throws Throwable {
        this.operand1 = C;
    }

    @When("^I have entered D as first operand$")
    public void iHaveEnteredAsFirstOperandD() throws Throwable {
        this.operand1 = D;
    }

    @When("^I have entered E as first operand$")
    public void iHaveEnteredAsFirstOperandE() throws Throwable {
        this.operand1 = E;
    }

    @When("^I have entered G as first operand$")
    public void iHaveEnteredAsFirstOperandG() throws Throwable {
        this.operand1 = G;
    }

    @When("^I have entered J as first operand$")
    public void iHaveEnteredAsFirstOperandJ() throws Throwable {
        this.operand1 = J;
    }

    @When("^I have entered T as first operand$")
    public void iHaveEnteredAsFirstOperandT() throws Throwable {
        this.operand1 = T;
    }

    @And("^I have entered (\\d+) as second operand$")
    public void iHaveEnteredAsSecondOperand(double number) throws Throwable {
        this.operand2 = number;
    }
	
    @And("^I press 'Get encrypt'$")
    public void iPressGetEncrypt() throws Throwable {
        this.result = encrypt.GetValue(operand1);
    }

    @And("^I press 'Encrypt from key'$")
    public void iPressEncryptFromKey() throws Throwable {
        this.result = encrypt.encrFromKey(operand1, operand2);
    }

    @Then("^The result should be (\\d+)$")
    public void theResultShouldBe(int expected) throws Throwable {
        Assert.assertEquals(expected, this.result, 1e-5);
    }

    @Given("^I have my software descrypt$")
    public void iHaveMySoftwareDescrypt() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        this.descrypt = new ConDescrypt();
    }

    @When("^I have entered A as first operand$")
    public void iHaveEnteredAsFirstOperandA() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        this.operand1 = AA;
    }

    @When("^I have entered B as first operand$")
    public void iHaveEnteredAsFirstOperandB() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        this.operand1 = BB;
    }

    @When("^I have entered C as first operand$")
    public void iHaveEnteredAsFirstOperandC() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        this.operand1 = CC;
    }

    @When("^I have entered D as first operand$")
    public void iHaveEnteredAsFirstOperandD() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        this.operand1 = DD;
    }

    @When("^I have entered E as first operand$")
    public void iHaveEnteredAsFirstOperandE() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        this.operand1 = EE;
    }

    @When("^I have entered G as first operand$")
    public void iHaveEnteredAsFirstOperandG() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        this.operand1 = GG;
    }

    @And("^I press 'Get descrypt'$")
    public void iPressGetDescrypt() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        this.result = descrypt.GetValueDes(operand1);
    }

}