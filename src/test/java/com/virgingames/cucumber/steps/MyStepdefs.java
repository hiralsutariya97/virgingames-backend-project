package com.virgingames.cucumber.steps;

import com.virgingames.info.GameSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.annotations.Steps;

import static org.hamcrest.Matchers.equalTo;

/**
 * Created by Jay Vaghani
 */
public class MyStepdefs {

    static ValidatableResponse response;

    @Steps
    GameSteps gameSteps;



    @Given("User is on Virgin Games API")
    public void userIsOnVirginGamesAPI() {
    }

    @When("User sends a request to get all GBP data")
    public void userSendsARequestToGetAllGBPData() {
        response = gameSteps.getAllPostsGBPData();
        response.statusCode(200).log().all();
    }

    @Then("Verify currency is GBP")
    public void verifyCurrencyIsGBP() {
        response.body("data.pots[0].currency", equalTo("GBP"));
    }
}
