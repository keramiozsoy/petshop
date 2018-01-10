package com.petshop.core.enums;

/**
 * 
 * @author user
 * 
 */
public class Enums {

	public interface BaseEnum {
		Object toValue();
	}

	public enum DatabaseInfo implements BaseEnum {
		USER(""), PASSWORD(""), DB_PATH_ORACLE("-"), DB_PATH_APACHE_DERBY(
				"jdbc:derby:src/main/resources/databases/apacheDerby/pethopDerbyDB;create=true");

		private String value;

		DatabaseInfo(String value) {
			this.value = value;
		}

		@Override
		public Object toValue() {
			return value;
		}

	}

	public enum DatabaseDriver implements BaseEnum {
		APACHE_DERBY("org.apache.derby.jdbc.EmbeddedDriver"), ORACLE("-");

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
