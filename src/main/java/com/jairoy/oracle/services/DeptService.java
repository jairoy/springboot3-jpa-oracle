package com.jairoy.oracle.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jairoy.oracle.entities.Dept;
import com.jairoy.oracle.repositories.DeptRepository;

@Service
public class DeptService {
	
	@Autowired
	private DeptRepository deptRepository;	
	
	public List<Dept> findAll(){
		List<Dept> dept = deptRepository.findAll() ;
		return dept;
	}
	
	public Dept findById(Integer deptno) {
		Optional<Dept> dept = deptRepository.findById(deptno);
		return dept.get();		
	}
}