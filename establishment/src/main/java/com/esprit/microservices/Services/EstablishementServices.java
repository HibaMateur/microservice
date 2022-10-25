package com.esprit.microservices.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.esprit.microservices.Repo.EstablishementRepo;
import com.esprit.microservices.entity.Establishement;

@Service

public class EstablishementServices {

	@Autowired
	private EstablishementRepo establishementrepo;

	public Establishement saveEstablishement(@RequestBody Establishement establishement) {
		return establishementrepo.save(establishement);
	}

	public Establishement getbyidnow(Long idestablishement) {
		System.out.println("saved");
		return establishementrepo.findById(idestablishement).orElse(null);
	}

}
