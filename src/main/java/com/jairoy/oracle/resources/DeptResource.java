package com.jairoy.oracle.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jairoy.oracle.entities.Dept;
import com.jairoy.oracle.services.DeptService;

@RestController
@RequestMapping(value="/depts")
public class DeptResource {
	
	@Autowired
	private DeptService deptService;	
	
	@GetMapping()
	public ResponseEntity<List<Dept>> findAll(){
		List<Dept> obj = deptService.findAll();
		return ResponseEntity.ok().body(obj);
	}
	
	@GetMapping(value="/{deptno}")
	public ResponseEntity<Dept> findById(@PathVariable Integer deptno){
		Dept obj = deptService.findById(deptno);
		return ResponseEntity.ok().body(obj);
	}

}
