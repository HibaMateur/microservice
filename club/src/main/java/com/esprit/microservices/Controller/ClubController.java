package com.esprit.microservices.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esprit.microservices.Services.ClubServices;
import com.esprit.microservices.entity.Club;

@RestController
@RequestMapping("/club")
public class ClubController {
	
	@Autowired
	private ClubServices clubservices;
	
	
	@PostMapping("/add")

	public Club saveClub(@RequestBody Club club)
	{
		
		return clubservices.saveClub(club);
	}
	@GetMapping("/{id}")
	public Club findClub(@PathVariable("id") Long idclub)
	{
		return clubservices.getbyidnow(idclub);
	}
}
