package api;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;

public class NovaPoshtaAPITest extends BaseApiTest {

    String API_key = "2829111b1e12dc2b5a4c61e9de932084";
    private Map<String, Object> reqBody = new HashMap<>();

    @BeforeEach
    public void setReqBody() {
        Map<String, Object> methodProperties = new HashMap<>();
        methodProperties.put("CityName", "Київ");
        methodProperties.put("Limit", "5");

        reqBody.put("apiKey", API_key);
        reqBody.put("modelName", "Address");
        reqBody.put("calledMethod", "searchSettlements");
        reqBody.put("methodProperties", methodProperties);
    }

    @Test
    public void verifyThatSuccess() {
        int warehouse = given()
                .spec(requestSpecification)
                .contentType(ContentType.JSON)
                .body(reqBody)
                .when()
                .post()
                .then()
                .spec(responseSpecification)
                .statusCode(200)
                .extract()
                .body().jsonPath().get("data[0].Addresses[0].Warehouses");
        System.out.println(warehouse);
        String warehouse1 = Integer.toString(warehouse);


        given()
                .spec(requestSpecification)
                .contentType(ContentType.JSON)
                .body(reqBody)
                .when()
                .post("https://api.novaposhta.ua/v2.0/" + warehouse1 + "/api")
                .then()
                .spec(responseSpecification)
                .statusCode(200);

    }

    @Test
    public void verifyJsonSchema() {
        given()
                .spec(requestSpecification)
                .contentType(ContentType.JSON)
                .body(reqBody)
                .when()
                .post()
                .then()
                .spec(responseSpecification)
                .statusCode(200)
                .assertThat()
                .body(matchesJsonSchema(new File
                        ("C:\\Users\\daryn\\Downloads\\Diploma-CodeToReview\\testFramework\\src\\main\\resources\\validators\\np_address_schema.json")));
    }

    @Test
    public void verifyPresentValuesInAddress() {
//        List<Address> addressList = given()
//                .spec(requestSpecification)
//                .contentType(ContentType.JSON)
//                .body(reqBody)
//                .when()
//                .post()
//                .then()
//                .extract()
//                .body().jsonPath().getList("data[0].Addresses", Address.class);
//        addressList.forEach(x -> Assertions.assertTrue(x.getPresent().contains("Київ")));
    }
}
