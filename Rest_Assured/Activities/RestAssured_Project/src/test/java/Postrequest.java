import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Postrequest {

    RequestSpecification requestSpec;
    String publicSSHKey;
    int idSSHKey;


    @BeforeClass
    public void setUp() {
        // Create request specification
        requestSpec = new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .addHeader("Authorization", "token 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")
                .setBaseUri("https://api.github.com")
                .build();
    }


    //POST request to add a SSH key to your account
    @Test(priority=1)
    public void addSSHKey(){
        String reqBody = "{"
                + "\"title\": \"TestAPIKey\","
                + " \"key\": \"ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIN/QVtlJVJ135Uv8H+7FxqcYzzZuc2eHjPdpuA0qmZlh\""
                + "}";
        Response response =
                given().spec(requestSpec)
                        .body(reqBody)
                        .when().post("/user/keys");
        String body = response.getBody().asPrettyString();
        System.out.println(body);

        idSSHKey = response.then().extract().path("id");
        System.out.println(idSSHKey);
        response.then().statusCode(201);
    }




}
