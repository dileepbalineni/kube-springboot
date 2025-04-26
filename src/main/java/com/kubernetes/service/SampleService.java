package com.kubernetes.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SampleService {


	public String getSampleData() {
		return "Sample Data";
	}


}
