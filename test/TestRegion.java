import com.sun.jndi.ldap.Connection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import models.Region;
import oracle.jdbc.pool.OracleDataSource;
import static org.junit.Assert.*;
import tools.Connections;

/**
 *
 * @author Elsa
 */
public class TestRegion {
     Connections connection=new Connections();
    
    public TestRegion() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {  
        try {
            OracleDataSource dataSource = new OracleDataSource();
            dataSource.setDriverType("thin");
            dataSource.setServerName("localhost");
            dataSource.setPortNumber(1521);
            dataSource.setServiceName("xe");
            dataSource.setDatabaseName("HR");

            dataSource.setUser("system");
            dataSource.setPassword("sys");
            this.connection = (Connections) dataSource.getConnection();
            //this.connection.createStatement().execute("alter session set current_schema=HR");

        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        //return this.connection;
    }
    
    
    @After
    public void tearDown() {
    
       
    }
    
    @Test
    public void testInput(){
        System.out.println("hasil");
        int reg_id;
        String reg_nama;
        
        Region region=new Region();
        
    }
 //@Test
//    public void getConnectionTest() {
//        new ConnectionConfiguration();
//        Connection connection = ConnectionConfiguration.getConnection();
//        assertEquals(connection != null, true);
//    }
//    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
