/**
 * 
 */
package com.petshop.core.domain;

import java.util.Date;

/**
 * @since 21-11-2017
 * @author ozsoy.kerami
 * 
 */
public abstract class AbstractBaseEntity {

	private Long id;
	private Date createdTimeStamp;
	private Date updatedTimeStamp;
	private Integer version;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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
