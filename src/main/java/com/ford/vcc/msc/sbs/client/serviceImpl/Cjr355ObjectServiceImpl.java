package com.ford.vcc.msc.sbs.client.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ford.vcc.msc.sbs.client.entities.Cjr355Object;
import com.ford.vcc.msc.sbs.client.repositories.Cjr355Repository;
import com.ford.vcc.msc.sbs.client.services.CJR355Service;


@Service
public class Cjr355ObjectServiceImpl implements CJR355Service {

	@Autowired
	Cjr355Repository Cjr355ObjectRepo;         

	@Override
	public List<Cjr355Object> getByGroup(String groupName) {
		
		List<Cjr355Object> list = Cjr355ObjectRepo.findByPropertygroup(groupName.trim().toUpperCase().replace(" ", ""));
		
		return list;
		
	//	return  Cjr355ObjectRepo.findByPropertygroup(groupName);                                                                            			 
	}			
                                   
	@Override
	public String save(Cjr355Object Cjr355Object) {
		Cjr355ObjectRepo.modifyingQueryInsertIntoCjr355(Cjr355Object.getPropertygroup(), Cjr355Object.getPropertylabel(), Cjr355Object.getPropertyvalue());
		return "Successfully Saved";
	}
	@Override
	public String delete(Cjr355Object Cjr355Object) {
		Cjr355ObjectRepo.modifyingQueryDeleteFromCjr355(Cjr355Object.getPropertygroup(), Cjr355Object.getPropertylabel(), Cjr355Object.getPropertyvalue());
		return Cjr355Object.getPropertygroup()+" Successfully Deleted";
	}                                                                                                  
	
	                                                                                                                                                                   
	@Override
	public String update(Cjr355Object Cjr355Object) {				
		Cjr355ObjectRepo.updatePropertyValue(Cjr355Object.getPropertygroup(),Cjr355Object.getPropertylabel(),Cjr355Object.getPropertyvalue());                                           		
		return Cjr355Object.getPropertygroup()+" Successfully Updated";
	}
	                                                                                                                           
	
	@Override
	public Cjr355Object findByAllCriteria(Cjr355Object Cjr355Object) {
		return Cjr355ObjectRepo.findByAllCriteria(Cjr355Object.getPropertygroup(),Cjr355Object.getPropertylabel());
		 
	}

	@Override
	public List<Cjr355Object> reload() {
		List<Cjr355Object> list = Cjr355ObjectRepo.findAll();
		return list;
	}
	
}
