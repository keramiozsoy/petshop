package com.petshop.core.util;

import com.petshop.core.enums.Enums;
import java.sql.Connection;
import junit.framework.TestCase;

/**
 * @since 14.03.2018
 * @author ozsoy.kerami
 * 
 */
public class JDBCUtilTest extends TestCase {
    
    public JDBCUtilTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of OpenJdbcConnection method, of class JDBCUtil.
     */
    public void testOpenJdbcConnection() throws Exception {
        System.out.println(this.getClass().getName() +" --> " +"OpenJdbcConnection");
        
        Object driver = Enums.DatabaseDriver.APACHE_DERBY.toValue();
        String dbPath = Enums.DatabaseInfo.DB_PATH_APACHE_DERBY.toValue().toString();
        String user = Enums.DatabaseInfo.USER.toValue().toString();
        String password = Enums.DatabaseInfo.PASSWORD.toValue().toString();
        
        Connection result = JDBCUtil.OpenJdbcConnection(driver, dbPath, user, password);
        
        assertNotNull(result);

    }
    
}
