package com.virgingames.info;

import com.virgingames.testbase.TestBase;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.annotations.Title;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.Matchers.equalTo;
@RunWith(SerenityRunner.class)
public class GameTest extends TestBase {

    @Steps
    GameSteps gameSteps;

    @Title("Verify currency is GBP")
    @Test
    public void test001() {
        ValidatableResponse response = gameSteps.getAllPostsGBPData();
        response.statusCode(200).log().all();
        response.body("data.pots[0].currency", equalTo("GBP"));
    }
}
