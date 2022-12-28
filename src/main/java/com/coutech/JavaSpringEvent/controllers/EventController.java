package com.coutech.JavaSpringEvent.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coutech.JavaSpringEvent.models.Usuario;
import com.coutech.JavaSpringEvent.services.EventService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/event")
public class EventController {

	private final EventService eventService;
	
	@GetMapping
	public ResponseEntity<?> starEvent() {
		return ResponseEntity.ok(this.eventService.startEvent(new Usuario("Fulano", null)));
	}
	
}
