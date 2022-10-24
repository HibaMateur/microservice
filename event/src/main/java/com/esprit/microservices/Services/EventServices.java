package com.esprit.microservices.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.esprit.microservices.Repo.EventRepo;
import com.esprit.microservices.entity.Event;

@Service

public class EventServices {

	@Autowired
	private EventRepo eventrepo;

	public Event saveEvent(@RequestBody Event event) {
		return eventrepo.save(event);
	}

	public Event getbyidnow(Long idevent) {
		System.out.println("saved");
		return eventrepo.findById(idevent).orElse(null);
	}

}
