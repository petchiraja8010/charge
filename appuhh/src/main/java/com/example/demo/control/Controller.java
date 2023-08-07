package com.example.demo.control;


	import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RestController;

import com.example.demo.inter.Repo;
import com.example.demo.user.oii;



	@RestController
	public class Controller {
		
		@Autowired
		public Repo rep;
		
		@PostMapping ("/add")
		public oii adddata(@RequestBody oii user) {
			rep.save(user);
			return user;
		}
		@GetMapping("/users")
		public List<oii> getAllUsers(){
			return rep.findAll();
		}
	}



