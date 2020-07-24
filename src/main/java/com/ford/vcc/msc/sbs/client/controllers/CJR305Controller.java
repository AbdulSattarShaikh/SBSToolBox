package com.ford.vcc.msc.sbs.client.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ford.vcc.msc.sbs.client.entities.Cjr305Object;
import com.ford.vcc.msc.sbs.client.services.CJR305Service;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Authorization;

@RestController
@RequestMapping("/SBSToolBox")
@Api(value = "Operations pertaining to SBSToolBox CJR305", description = "Operations pertaining to SBSToolBox", tags = {
		"SBSToolBox APIs" })
public class CJR305Controller {

	@Autowired
	CJR305Service cJR305Service;

	@ApiOperation(value = "Adding in Table 305", authorizations = { @Authorization(value = "basicAuth") })
	@PostMapping("/cjr305")
	public ResponseEntity<String> save(@RequestBody Cjr305Object cjr305Object) {
		return new ResponseEntity<>(cJR305Service.save(cjr305Object), HttpStatus.OK);
	}

	@ApiOperation(value = "Get Values from Table CJR305", authorizations = { @Authorization(value = "basicAuth") })
	@GetMapping("/cjr305")
	public ResponseEntity<List<Cjr305Object>> getAll() {
		return new ResponseEntity<>(cJR305Service.getAll(), HttpStatus.OK);
	}

}
