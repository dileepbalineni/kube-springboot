package com.kubernetes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kubernetes.modals.Sample;
import com.kubernetes.repository.SampleRepo;

@Service
public class SampleService {

	@Autowired
	private SampleRepo sampleRepo;

	@Transactional(readOnly = true)
	public Sample getSampleById(String id) {
		return sampleRepo.findById(id).orElse(null);
	}

	@Transactional
	public Sample save(Sample sample) {
		return sampleRepo.save(sample);
	}

	@Transactional
	public void deleteSampleById(String id) {
		sampleRepo.deleteById(id);
	}

}
