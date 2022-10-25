package com.esprit.microservices.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esprit.microservices.Services.EstablishementServices;
import com.esprit.microservices.entity.Establishement;

@RestController
@RequestMapping("/establishement")
public class EstablishementController {
	
	@Autowired
	private EstablishementServices establishementservices;
	
	
	@PostMapping("/add")

	public Establishement saveEstablishement(@RequestBody Establishement establishement)
	{
		
		return establishementservices.saveEstablishement(establishement);
	}
	@GetMapping("/{id}")
	public Establishement findEvent(@PathVariable("id") Long idestablishement)
	{
		return establishementservices.getbyidnow(idestablishement);
	}
}
