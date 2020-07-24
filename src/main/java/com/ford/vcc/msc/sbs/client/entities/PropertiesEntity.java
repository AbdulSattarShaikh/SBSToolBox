package com.ford.vcc.msc.sbs.client.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;

import com.sun.istack.NotNull;

@Embeddable
public class PropertiesEntity implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	@NotNull
	private String propertyGroup; 
	@NotNull
	private String propertyLabel;
	@NotNull
	private String propertyValue;
		
	
	public PropertiesEntity() {
		super();
	}
	public PropertiesEntity(String propertyGroup, String propertyLabel, String propertyValue) {
		super();
		this.propertyGroup = propertyGroup;
		this.propertyLabel = propertyLabel;
		this.propertyValue = propertyValue;
	}
	public String getPropertyGroup() {
		return propertyGroup;
	}
	public void setPropertyGroup(String propertyGroup) {
		this.propertyGroup = propertyGroup;
	}
	public String getPropertyLabel() {
		return propertyLabel;
	}
	public void setPropertyLabel(String propertyLabel) {
		this.propertyLabel = propertyLabel;
	}
	public String getPropertyValue() {
		return propertyValue;
	}
	public void setPropertyValue(String propertyValue) {
		this.propertyValue = propertyValue;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((propertyGroup == null) ? 0 : propertyGroup.hashCode());
		result = prime * result + ((propertyLabel == null) ? 0 : propertyLabel.hashCode());
		result = prime * result + ((propertyValue == null) ? 0 : propertyValue.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PropertiesEntity other = (PropertiesEntity) obj;
		if (propertyGroup == null) {
			if (other.propertyGroup != null)
				return false;
		} else if (!propertyGroup.equals(other.propertyGroup))
			return false;
		if (propertyLabel == null) {
			if (other.propertyLabel != null)
				return false;
		} else if (!propertyLabel.equals(other.propertyLabel))
			return false;
		if (propertyValue == null) {
			if (other.propertyValue != null)
				return false;
		} else if (!propertyValue.equals(other.propertyValue))
			return false;
		return true;
	}
	
	
	
	
}
