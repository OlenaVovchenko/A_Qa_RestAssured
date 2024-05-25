package petStore;

import io.restassured.http.ContentType;

import java.util.List;

import static io.restassured.RestAssured.given;

public class Main {
    public static void main(String[] args) {
        Pet pet = new Pet();
        pet.setName("jedinorog");
        pet.setTags(List.of(new Tag(10L,"Honi")));
        pet.setStatus("available");
        pet.setId(1238764466789L);
        pet.setPhotoUrls(List.of("url", "url1"));
        pet.setCategory(new Category(1L, "Testname"));

        given()
                .when()
                .log().all()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(pet)
                .post("https://petstore.swagger.io/v2" + "/pet")
                .then()
                .log().all()
                .statusCode(200)
                .extract()
                .path("id");                ;

//        given()
//                .when()
//                .log().all()
//                .get("https://petstore.swagger.io/v2" + "/pet/10")
//                .then()
//                .log().all()
//                .statusCode(200)
//                .extract()
//                .body()
//                .jsonPath();                ;


//    public static void main(String[] args) {
//        List<Pet> pets =given()
//                .when()
//                .log().all()
//                .queryParam("status", "available")
//                .get("https://petstore.swagger.io/v2" + "/pet/findByStatus")
//                .then()
//                .log().all()
//                .statusCode(200)
//                .extract()
//                .body()
//                .jsonPath()
//                .getList("", Pet.class);
//
//        pets.forEach(System.out::println);
//
//        for(int i=0; i<pets.size(); i++){
//            System.out.println(pets.get(i));
//        }
//        for (Pet pet: pets) {
//            System.out.println(pet);
//        }
//        int i = 0;
//        while (i<pets.size()){
//            System.out.println(pets.get(i));
//            i++;
//        }

    }
}
