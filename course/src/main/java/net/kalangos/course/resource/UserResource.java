package net.kalangos.course.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.kalangos.course.entities.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		
		User u = new User(1L, "maria", "maria@gmail.com", "81994701058", "12345");
		
		return ResponseEntity.ok().body(u);
	}

}
