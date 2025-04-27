package com.kubernetes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kubernetes.modals.Sample;

@Repository
public interface SampleRepo extends JpaRepository<Sample, String> {

	String queryById(String id);
}
