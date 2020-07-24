package com.ford.vcc.msc.sbs.client.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ford.vcc.msc.sbs.client.entities.Cjr305Object;


@Service
public interface CJR305Service {

	public String save(Cjr305Object cjr305Object);

	public List<Cjr305Object> getAll();

}
