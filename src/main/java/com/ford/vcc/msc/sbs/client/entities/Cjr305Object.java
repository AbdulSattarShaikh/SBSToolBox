package com.ford.vcc.msc.sbs.client.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.ford.vcc.msc.sbs.client.util.GeneralUtil;

@Entity
@Table(name = "CJR305")
@EntityListeners(AuditingEntityListener.class)
public class Cjr305Object {

	@Id
	@Column(name = "ARBTYP", nullable = false)
	private String arbtyp;
	@Column(name = "BENAM", nullable = false)
	private String benam;
	@Column(name = "TYPE", nullable = false)              
	private String type;
	@Column(name = "VCMSTYP", nullable = false)
	private String vcmstyp;

	public String getArbtyp() {
		return GeneralUtil.trim(new String(arbtyp));
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return GeneralUtil.trim(type);
	}

	public String getBenam() {
		return GeneralUtil.trim(benam);
	}

	public void setArbtyp(String arbtyp) {
		this.arbtyp = arbtyp;
	}

	public void setBenam(String benam) {
		this.benam = benam;
	}

	public void setVcmstyp(String vcmstyp) {
		this.vcmstyp = vcmstyp;
	}

	public String getVcmstyp() {
		return GeneralUtil.trim(vcmstyp);
	}

}
