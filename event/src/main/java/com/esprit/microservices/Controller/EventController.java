package com.esprit.microservices.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esprit.microservices.Services.EventServices;
import com.esprit.microservices.entity.Event;

@RestController
@RequestMapping("/event")
public class EventController {
	
	@Autowired
	private EventServices eventservices;
	
	
	@PostMapping("/add")

	public Event saveEvent(@RequestBody Event event)
	{
		
		return eventservices.saveEvent(event);
	}
	@GetMapping("/{id}")
	public Event findEvent(@PathVariable("id") Long idevent)
	{
		return eventservices.getbyidnow(idevent);
	}
}
