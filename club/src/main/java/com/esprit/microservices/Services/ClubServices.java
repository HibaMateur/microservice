package com.esprit.microservices.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.esprit.microservices.Repo.ClubRepo;
import com.esprit.microservices.entity.Club;

@Service

public class ClubServices {

	@Autowired
	private ClubRepo clubrepo;

	public Club saveClub(@RequestBody Club club) {
		return clubrepo.save(club);
	}

	public Club getbyidnow(Long idclub) {
		System.out.println("saved");
		return clubrepo.findById(idclub).orElse(null);
	}

}
