package simplilearn.resources;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import simplilearn.model.HelloWorld;

// The springboot app rest app is trying to block the access but by CrossOrigin 
@CrossOrigin(origins="http://localhost:4201")
@RestController
public class HelloWorldResource {
	
	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello World";} 
	
	@GetMapping("/hello-world-object")
	public HelloWorld helloWorldObject(){
//		return new HelloWorld("Spring Boot 2"); 	
		throw new RuntimeException("Black Dad"); 
	}
	
}

