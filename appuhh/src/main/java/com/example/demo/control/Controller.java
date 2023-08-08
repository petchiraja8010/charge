package com.example.demo.control;


	import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
		@PutMapping("/update")
		public oii updateuser (@RequestBody oii hi) {
			try {
				rep.save(hi);
				return hi;}
			catch(Exception ex) {
				ex.printStackTrace();
			}
			return hi;
			}
		
	@DeleteMapping("/getdel/{Id}")	
	public String del (@PathVariable int Id) {
		try {
			@SuppressWarnings("deprecation")
			oii hi=rep.getOne(Id);
			rep.delete(hi);
			return "delete";
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
		}
		}
	
	



