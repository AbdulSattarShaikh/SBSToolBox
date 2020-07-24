package com.ford.vcc.msc.sbs.client.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ford.vcc.msc.sbs.client.entities.Cjr305Object;


@Repository
public interface Cjr305Repo extends JpaRepository<Cjr305Object, String>{

}
