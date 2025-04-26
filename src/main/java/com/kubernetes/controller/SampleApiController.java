package com.kubernetes.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kubernetes.modals.dto.SampleDTO;
import com.kubernetes.service.SampleService;

@RestController
@RequestMapping("/api/sample")
public class SampleApiController {

	@Autowired
	private SampleService sampleService;

	@GetMapping("")
	public String getSample() {
		System.out.println("**** GET MAPPING ****");
		return sampleService.getSampleData();
	}

	@PostMapping("")
	public SampleDTO postSample(@RequestBody SampleDTO sample) {
		System.out.println("**** POST MAPPING ****");
		return sample;
	}

	@PutMapping("/{id}")
	public SampleDTO update(@PathVariable("id") String id, @RequestBody Map<String, Object> updates) {
		System.out.println("**** PUT MAPPING ****"+id);
		return new SampleDTO();
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") String id) {
		System.out.println("**** DELETE MAPPING ****"+id);
	}

}
