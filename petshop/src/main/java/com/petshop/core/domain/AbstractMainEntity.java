/**
 * 
 */
package com.petshop.core.domain;

import java.util.Date;

/**
 * @author user
 * 
 */
public abstract class AbstractMainEntity implements GenericEntity {

	private Date createdTimeStamp;
	private Date updatedTimeStamp;
	private Integer version;

	public Date getCreatedTimeStamp() {
		return createdTimeStamp;
	}

	public void setCreatedTimeStamp(Date createdTimeStamp) {
		this.createdTimeStamp = createdTimeStamp;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public Date getUpdatedTimeStamp() {
		return updatedTimeStamp;
	}

	public void setUpdatedTimeStamp(Date updatedTimeStamp) {
		this.updatedTimeStamp = updatedTimeStamp;
	}
}
