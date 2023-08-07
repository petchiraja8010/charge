package com.example.demo.inter;


	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Repository;

import com.example.demo.user.oii;
	@Repository
	public interface Repo  extends JpaRepository <oii,Integer>{

	}


