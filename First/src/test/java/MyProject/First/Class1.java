package MyProject.First;

import static com.jayway.restassured.RestAssured.*;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class Class1 {

	
	public static void main(String[] args) 
	{
	/*	Response res=
	 given()
	 .contentType(ContentType.JSON)
	 .when()
	 .get("http://localhost:3000/posts/1");
		System.out.println("Status code is " +res.statusCode());
		System.out.println(res.asString());*/
	  /* .delete("http://localhost:3000/posts/1")
		System.out.println("Response code is " +res.statusCode());*/
		
		Data d= new Data();
		d.setId(3);
		d.setAuthor("mukul");
		d.setName("mukul");
		
		d.setId(5);
		d.setAuthor("kapil");
		d.setName("Gaba");
		
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(d)
		.when()
		.post("http://localhost:3000/posts");
		
		System.out.println("Response is " +res.statusCode());
	}
}
