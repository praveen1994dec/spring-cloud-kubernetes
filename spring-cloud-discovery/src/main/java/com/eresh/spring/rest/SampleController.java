package com.eresh.spring.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created By Gorantla, Eresh on 19/Dec/2019
 **/
@RestController
@RequestMapping("/api")
public class SampleController {

	@Autowired
	RestTemplate restTemplate;

	@GetMapping("/sample")
	public ResponseEntity<Object> getData() {
		String url = "http://kubernetes-configmap-reload:8080/home/data";
		ResponseEntity<String> responseEntity = restTemplate.getForEntity(url, String.class);
		return ResponseEntity.ok(responseEntity.getBody());
	}
}
