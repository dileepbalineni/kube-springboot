package com.kubernetes.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kubernetes.modals.Sample;
import com.kubernetes.modals.dto.SampleDTO;
import com.kubernetes.service.SampleService;

@RestController
@RequestMapping("/api/sample")
public class SampleApiController {

	@Autowired
	private SampleService sampleService;

	@GetMapping("{id}")
	public Sample getSample(@PathVariable("id") String id) {
		return sampleService.getSampleById(id);
	}

	@PostMapping(value = "", consumes = MediaType.APPLICATION_JSON_VALUE)
	public Sample postSample(@RequestBody Sample sample) {
		return sampleService.save(sample);
	}

//	@PutMapping("/{id}")
//	public SampleDTO update(@PathVariable("id") String id, @RequestBody Map<String, Object> updates) {
//
//		return new SampleDTO();
//	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") String id) {
		sampleService.deleteSampleById(id);
	}

}
