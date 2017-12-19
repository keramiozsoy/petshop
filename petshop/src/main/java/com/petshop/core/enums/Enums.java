package com.petshop.core.enums;

/**
 * 
 * @author user
 * 
 */
public class Enums {

	public interface BaseEnum{
		Object toValue();
	}
	
	public enum DatabaseDriver implements BaseEnum{
		APACHE_DERBY("org.apache.derby.jdbc.EmbeddedDriver"),
		ORACLE("-");
		
		private String value;

		DatabaseDriver(String value) {
	        this.value = value;
	    }

		@Override
		public Object toValue() {
			return value;
		}
	}
}
