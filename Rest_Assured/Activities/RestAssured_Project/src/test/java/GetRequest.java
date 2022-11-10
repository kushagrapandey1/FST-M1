import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetRequest {
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

    // GET request to get all the SSH keys attached to your account
    @Test(priority=2)
    public void getSSHKey() {

        Response response =
                given().spec(requestSpec)
                        .when().get("/user/keys/{keyId}");

        String body = response.getBody().asPrettyString();
        System.out.println(body);
        response.then().statusCode(200);

    }


}
