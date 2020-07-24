package com.ford.vcc.msc.sbs.client.entities;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "CJR355")
@IdClass(Cjr355Model.class)
public class Cjr355Object {
	
	public Cjr355Object() {
		
	}
	
	public Cjr355Object(String propertygroup, String propertylabel, String propertyvalue ) {
			
		this.propertygroup = propertygroup;
		this.propertylabel = propertylabel;
		this.propertyvalue = propertyvalue;
		}
	
	
	@Column(name="PROPERTYGROUP", nullable = false)
	private String propertygroup;
	
	
	@Column(name="PROPERTYLABEL", nullable = false)
	private String propertylabel;
	
	@Column(name="PROPERTYVALUE", nullable = false)
	private String propertyvalue;
	
	
	@Id
    @AttributeOverrides(
    		 {
                 @AttributeOverride(name = "propertygroup",column = @Column(name="PROPERTYGROUP")),
                 @AttributeOverride(name = "propertylabel", column = @Column(name="PROPERTYLABEL"))
             }
    		)       
 
	public String getPropertygroup() {
		return propertygroup.trim();
	}

	public String getPropertylabel() {
		return propertylabel.trim();
	}

	public String getPropertyvalue() {
		return propertyvalue.trim();
	}

	public void setPropertygroup(String propertygroup) {
		this.propertygroup = propertygroup;
	}

	public void setPropertylabel(String propertylabel) {
		this.propertylabel = propertylabel;
	}

	public void setPropertyvalue(String propertyvalue) {
		this.propertyvalue = propertyvalue;
	}
		
	
}
