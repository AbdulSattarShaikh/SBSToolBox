package com.ford.vcc.msc.sbs.client.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ford.vcc.msc.sbs.client.entities.Cjr355Object;

@Service
public interface CJR355Service {

	public List<Cjr355Object> getByGroup(String groupName);

	public String save(Cjr355Object cJR355);

	public String update(Cjr355Object cJR355);

	public String delete(Cjr355Object Cjr355Object);

	public Cjr355Object findByAllCriteria(Cjr355Object Cjr355Object);

	public List<Cjr355Object> reload();

}
