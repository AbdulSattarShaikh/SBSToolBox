package com.ford.vcc.msc.sbs.client.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;

@Embeddable
public class Cjr355Model implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Cjr355Model() {
		
	}
	
	public Cjr355Model(String propertygroup, String propertylabel, String propertyvalue ) {
			
		this.propertygroup = propertygroup;
		this.propertylabel = propertylabel;
		this.propertyvalue = propertyvalue;
		}

	@Id
	@Column(name="PROPERTYGROUP", nullable = false)
	private String propertygroup;
	
	@Id
	@Column(name="PROPERTYLABEL", nullable = false)
	private String propertylabel;
	
	@Column(name="PROPERTYVALUE", nullable = false)
	private String propertyvalue;

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
	
	@Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } 
        if(!(o instanceof Cjr355Model)) {
            return false;
        }
        Cjr355Model cjr355Object = (Cjr355Model) o;
        return Objects.equals(getPropertygroup(), cjr355Object.getPropertygroup()) && Objects.equals(getPropertylabel(), 
        		cjr355Object.getPropertylabel());
    }
 
    @Override
    public int hashCode() {
        return Objects.hash(getPropertygroup(), getPropertylabel());
    }
	
	

}
