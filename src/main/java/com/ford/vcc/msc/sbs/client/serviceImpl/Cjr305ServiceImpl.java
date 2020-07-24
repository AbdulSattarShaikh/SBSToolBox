package com.ford.vcc.msc.sbs.client.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ford.vcc.msc.sbs.client.entities.Cjr305Object;
import com.ford.vcc.msc.sbs.client.repositories.Cjr305Repo;
import com.ford.vcc.msc.sbs.client.services.CJR305Service;


@Service
public class Cjr305ServiceImpl implements CJR305Service{
	
	@Autowired
	Cjr305Repo cjr305repo;
	

	@Override
	public String save(Cjr305Object cjr305Object) {		
		cjr305repo.save(cjr305Object);				
		return "Data Successfully Saved";
	}


	@Override
	public List<Cjr305Object> getAll() {		
		return cjr305repo.findAll();
	}

}
