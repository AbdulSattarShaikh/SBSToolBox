/*
 * package com.ford.vcc.msc.sbs.client.entities;
 * 
 * import javax.persistence.Column; import javax.persistence.Entity; import
 * javax.persistence.EntityListeners; import javax.persistence.Id; import
 * javax.persistence.Table;
 * 
 * import org.springframework.data.jpa.domain.support.AuditingEntityListener;
 * 
 * import com.ford.vcc.msc.sbs.client.util.GeneralUtil;
 * 
 * @Entity
 * 
 * @Table(name = "CJR355")
 * 
 * @EntityListeners(AuditingEntityListener.class) public class CJR355 {
 * 
 * @Id
 * 
 * @Column(name = "PROPERTYGROUP", nullable = false) private String
 * propertyGroup;
 * 
 * @Column(name = "PROPERTYLABEL", nullable = false) private String
 * propertyLabel;
 * 
 * @Column(name = "PROPERTYVALUE", nullable = false) private String
 * propertyValue;
 * 
 * public String getPropertyGroup() { return GeneralUtil.trim(new
 * String(propertyGroup)); }
 * 
 * public void setPropertyGroup(String propertyGroup) { this.propertyGroup =
 * propertyGroup; }
 * 
 * public String getPropertyLabel() { return GeneralUtil.trim(new
 * String(propertyLabel)); }
 * 
 * public void setPropertyLabel(String propertyLabel) { this.propertyLabel =
 * propertyLabel; }
 * 
 * public String getPropertyValue() { return GeneralUtil.trim(new
 * String(propertyValue)); }
 * 
 * public void setPropertyValue(String propertyValue) { this.propertyValue =
 * propertyValue; }
 * 
 * }
 */