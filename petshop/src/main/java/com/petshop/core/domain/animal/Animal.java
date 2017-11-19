/**
 * 
 */
package com.petshop.core.domain.animal;

import com.petshop.core.domain.AbstractMainEntity;

/**
 * @author user
 *
 */
public class Animal extends AbstractMainEntity{

	private Long id;
	
	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

}
