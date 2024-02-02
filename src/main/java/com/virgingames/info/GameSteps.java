package com.virgingames.info;

import com.virgingames.constants.EndPoints;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;

public class GameSteps {

    @Step("Get All GBP Data")
    public ValidatableResponse getAllPostsGBPData() {
        return SerenityRest.given().log().ifValidationFails()
                .when()
                .get(EndPoints.CURRENCYGBP)
                .then();
    }

}
