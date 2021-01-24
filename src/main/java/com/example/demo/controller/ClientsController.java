package com.example.demo.controller;

import java.util.concurrent.TimeUnit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ClientDTO;

import lombok.extern.java.Log;

@RestController
@RequestMapping("/clients")
@Log
public class ClientsController {

	@GetMapping("/{clientId}")
	public ClientDTO getClient(@PathVariable String clientId) {
		log.info("[ClientsController][getClient][START]");
		
		ClientDTO client = new ClientDTO(clientId, "Firstname", "Lastname");
		
		try {
		    TimeUnit.SECONDS.sleep(10);
		} catch (InterruptedException ie) {
		    Thread.currentThread().interrupt();
		}		
		
		log.info("[ClientsController][getClient][END]");
		return client;
	}
	
}
