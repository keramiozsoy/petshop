/**
 * 
 */
package com.petshop.core.util;

import org.flywaydb.core.Flyway;

import com.petshop.core.enums.Enums;

/**
 * @author user
 * 
 */
public class FlywayUtil {

	public static void initialize() {
		Flyway flyway = new Flyway();
		flyway.setDataSource( //
				Enums.DatabaseInfo.DB_PATH_APACHE_DERBY.toValue().toString(), //
				Enums.DatabaseInfo.USER.toValue().toString(),//
				Enums.DatabaseInfo.PASSWORD.toValue().toString());
		flyway.setLocations("classpath:databases/migrations/flywayApacheDerby");
		flyway.setTable("FLYWAY_SCHEMA_TABLE");
		flyway.migrate();
	}

}
