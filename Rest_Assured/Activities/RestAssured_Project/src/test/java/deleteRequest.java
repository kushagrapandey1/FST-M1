import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class deleteRequest {
    RequestSpecification requestSpec;
    String publicSSHKey;
    int idSSHKey = 70418950;


    @BeforeClass
    public void setUp() {
        // Create request specification
        requestSpec = new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .addHeader("Authorization", "token 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")
                .setBaseUri("https://api.github.com")
                .build();
    }

    //DELETE request to delete the key attached to your account.
    @Test()
    public void deleteSSHKey(){
        Response response =
                given().spec(requestSpec)
                        .pathParam("keyId", idSSHKey)
                        .when().delete("/user/keys/{keyId}");
        String body = response.getBody().asPrettyString();
        System.out.println(body);
        response.then().statusCode(204);

    }
}
