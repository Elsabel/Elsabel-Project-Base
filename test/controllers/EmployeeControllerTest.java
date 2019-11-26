package controllers;

import java.util.ArrayList;
import java.util.List;
import static jdk.nashorn.internal.runtime.Debug.id;
import models.Employee;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertArrayEquals;


/**
 *
 * @author Elsa
 */
public class EmployeeControllerTest {
    
    public EmployeeControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getAll method, of class EmployeeController.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        EmployeeController instance = new EmployeeController();      
//        ArrayList<Employee> str=new ArrayList<>();
//        Assert.assertEquals(0, str.size());
        List<Employee> expResult = new ArrayList<>(); 
        List<Employee> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class EmployeeController.
     */
    @Test
    public void testCreate() throws Exception {
        System.out.println("create");
        String id = "12";
        String firstname = "Nutri";
        String lastname = "Sari";
        String email = "nurtrisari";
        String phone = "133";
        String hire = "2019-10-22";
        String salary = "200";
        String commision = "0";
        String manager = "103";
        String job = "IT_PROG";
        String department = "90";
        EmployeeController instance = new EmployeeController();
        String expResult = "Succes Create";
        String result = instance.create(id, firstname, lastname, email, phone, hire, salary, commision, manager, job, department);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class EmployeeController.
     */
//    @Test
//    public void testUpdate() throws Exception {
//        System.out.println("update");
//       String id = "12";
//        String firstname = "NutriSR";
//        String lastname = "Sari";
//        String email = "nurtrisari";
//        String phone = "133";
//        String hire = "2019-10-22";
//        String salary = "200";
//        String commision = "0";
//        String manager = "103";
//        String job = "IT_PROG";
//        String department = "90";
//        EmployeeController instance = new EmployeeController();
//        String expResult = "Success Update";
//        String result = instance.update(id, firstname, lastname, email, phone, hire, job, salary, commision, manager, department);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of delete method, of class EmployeeController.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String id = "12";
        EmployeeController instance = new EmployeeController();
        String expResult = "Success Delete";
        String result = instance.delete(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectById method, of class EmployeeController.
     */
    @Test
    public void testSelectById() {
        System.out.println("selectById");
        String id = "12";
        EmployeeController instance = new EmployeeController();
        Employee expResult = new Employee("12");
        Employee result = instance.selectById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectByName method, of class EmployeeController.
     */
    @Test
    public void testSelectByName() {
        System.out.println("selectByName");
        String name = "Nutri";
        EmployeeController instance = new EmployeeController();
        Employee expResult = new Employee("Nutri");
        Employee result = instance.selectByName(name);
        assertEquals(expResult.getFirstname(), result.getFirstname());
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of search method, of class EmployeeController.
     */
    @Test
    public void testSearch() {
        System.out.println("search");
        String key = "Neena";
        EmployeeController instance = new EmployeeController();
        String expResult = "Success";
        List<Employee> result = instance.search(key);
        assertEquals(expResult.contains(key), result.contains(key));
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
