package com.ford.vcc.msc.sbs.client.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ford.vcc.msc.sbs.client.entities.Cjr355Object;
import com.ford.vcc.msc.sbs.client.services.CJR355Service;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Authorization;
   
@RestController       
@RequestMapping("/SBSToolBox")
@Api(value = "Operations pertaining to SBSToolBox CJR355", description = "Operations pertaining to SBSToolBox CJR355", tags = {
		"SBSToolBox APIs" })
public class CJR355Controller {   

	@Autowired
	CJR355Service cJR355_Service;

	@ApiOperation(value = "Find by Group Name", authorizations = { @Authorization(value = "basicAuth") })
	@GetMapping("/cjr355/{groupName}")
	public ResponseEntity<List<Cjr355Object>> getByGroup(@PathVariable String groupName) {
		return new ResponseEntity<>(cJR355_Service.getByGroup(groupName), HttpStatus.OK);
	}

	@ApiOperation(value = "Adding new Data", authorizations = { @Authorization(value = "basicAuth") })
	@PostMapping("/cjr355")
	public ResponseEntity<String> save(@RequestBody Cjr355Object cJR355) {
		return new ResponseEntity<>(cJR355_Service.save(cJR355), HttpStatus.OK);
	}

	@ApiOperation(value = "Update existing Data", authorizations = { @Authorization(value = "basicAuth") })
	@PutMapping("/cjr355")
	public ResponseEntity<String> update(@RequestBody Cjr355Object cJR355) {
		return new ResponseEntity<>(cJR355_Service.update(cJR355), HttpStatus.OK);
	}

	@ApiOperation(value = "Delete existing Data", authorizations = { @Authorization(value = "basicAuth") })
	@DeleteMapping("/cjr355/{id}{")
	public ResponseEntity<String> delete(@RequestBody Cjr355Object cJR355) {
		return new ResponseEntity<>(cJR355_Service.delete(cJR355), HttpStatus.OK);
	}

	@ApiOperation(value = "Finding by all criteria", authorizations = { @Authorization(value = "basicAuth") })
	@GetMapping("/cjr355")
	public ResponseEntity<Cjr355Object> findByAllCriteria(@RequestBody Cjr355Object cJR355) {
		return new ResponseEntity<>(cJR355_Service.findByAllCriteria(cJR355), HttpStatus.OK);
	}
	
	@ApiOperation(value = "Caching all", authorizations = { @Authorization(value = "basicAuth") })
	@GetMapping("/cjr355GetAll")
//	@Scheduled(fixedDelay = 1000)
	public ResponseEntity<List<Cjr355Object>> reload() {
		return new ResponseEntity<>(cJR355_Service.reload(), HttpStatus.OK);
	}
}
