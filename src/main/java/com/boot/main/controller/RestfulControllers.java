package com.boot.main.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.boot.main.dao.Aliendao;
import com.boot.main.model.Alien;

@RestController
public class RestfulControllers {
		
		@Autowired
		Aliendao repo;
		
		@RequestMapping(value = "/greeting", method = {RequestMethod.GET, RequestMethod.POST})
	    public ResponseEntity<Map<String, String>> handleBothMethods(@RequestParam(required = false) String name,
	                                                                  @RequestBody(required = false) Map<String, Object> requestData) {
	        Map<String, String> response = new HashMap<>();
	        
	        if (name != null) {
	            response.put("message", "Hello, " + name + "!");
	        } else if (requestData != null) {
	            response.put("received_data", requestData.toString());
	        } else {
	            response.put("message", "Hello, world!");
	        }

	        HttpStatus status = (requestData != null) ? HttpStatus.CREATED : HttpStatus.OK;
	        return ResponseEntity.status(status).body(response);
	    }
		
		@PostMapping("Alien")
		public Alien addAlien(@RequestBody Alien alien) {
			repo.save(alien);
			return alien;
		}
		
		@DeleteMapping("Alien/{aid}")
		public ResponseEntity<Map<String, String>> delAlien(@PathVariable("aid") int aid) {
			repo.deleteById(aid);
			HttpStatus status= HttpStatus.GONE;
			Map<String, String> response= new HashMap<>();
			response.put("message", "Data deleted");
			return ResponseEntity.status(status).body(response);
		}
		
		@PutMapping("Alien")
		public ResponseEntity<Map<String, String>> modAlien(@RequestBody Alien alien) {
			repo.save(alien);
			HttpStatus status= HttpStatus.ACCEPTED;
			Map<String, String> response= new HashMap<>();
			response.put("message", "Data updated");
			return ResponseEntity.status(status).body(response);
		}
}
