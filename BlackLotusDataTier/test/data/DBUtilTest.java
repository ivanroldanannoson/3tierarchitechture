/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.ArrayList;
import model.Category;
import model.Item;
import model.Login;
import model.Order;
import model.Register;
import model.Vendor;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

/**
 *
 * @author ivanroldan
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DBUtilTest {

    public DBUtilTest() {
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
     * Test of userRegister method, of class DBUtil.
     */
    @Test
    public void test1UserRegister() {
        System.out.println("userRegister");
        Register register = new Register(0, "Test user", "test@email.com", "123456", 2);
        DBUtil instance = new DBUtil();
        int expResult = 1;
        int result = instance.userRegister(register);
        assertEquals(expResult, result);
    }

    /**
     * Test of login method, of class DBUtil.
     */
    @Test
    public void test2Login() {
        System.out.println("login");
        Login bean = new Login("test@gmail.com", "123456");
        DBUtil instance = new DBUtil();
        Register expResult = new Register(4, "ivan", "test@gmail.com", "e10adc3949ba59abbe56e057f20f883e", 1);
        Register result = instance.login(bean);
        assertEquals(expResult.getName(), result.getName());
        assertEquals(expResult.getEmail(), result.getEmail());
    }

    /**
     * Test of getUserRoleByEmail method, of class DBUtil.
     */
    @Test
    public void test3GetUserRoleByEmail() {
        System.out.println("getUserRoleByEmail");
        String email = "test@email.com";
        DBUtil instance = new DBUtil();
        int expResult = 2;
        int result = instance.getUserRoleByEmail(email);
        assertEquals(expResult, result);
    }

    /**
     * Test of checkUserExistByEmail method, of class DBUtil.
     */
    @Test
    public void test4CheckUserExistByEmail() {
        System.out.println("checkUserExistByEmail");
        String email = "test@email.com";
        DBUtil instance = new DBUtil();
        boolean expResult = true;
        boolean result = instance.checkUserExistByEmail(email);
        assertEquals(expResult, result);
    }

    /**
     * Test of deleteUserByEmail method, of class DBUtil.
     */
    @Test
    public void test5DeleteUserByEmail() {
        System.out.println("deleteUserByEmail");
        String email = "test@email.com";
        DBUtil instance = new DBUtil();
        int expResult = 1;
        int result = instance.deleteUserByEmail(email);
        assertEquals(expResult, result);
    }

    /**
     * Test of vendorRegister method, of class DBUtil.
     */
    @Test
    public void test6VendorRegister() {
        System.out.println("vendorRegister");
        Vendor vendor = new Vendor(0, "Test Vendor", "Test address", "123456789", "test@email.com", "123456", 1, 5);
        DBUtil instance = new DBUtil();
        int expResult = 1;
        int result = instance.vendorRegister(vendor);
        assertEquals(expResult, result);
    }

    /**
     * Test of getVendorTypeByEmail method, of class DBUtil.
     */
    @Test
    public void test7GetVendorTypeByEmail() {
        System.out.println("getVendorTypeByEmail");
        String email = "test@email.com";
        DBUtil instance = new DBUtil();
        int expResult = 1;
        int result = instance.getVendorTypeByEmail(email);
        assertEquals(expResult, result);
    }

    /**
     * Test of deleteUserByEmail method, of class DBUtil.
     */
    @Test
    public void test8DeleteVendorByEmail() {
        System.out.println("deleteVendorByEmail");
        String email = "test@email.com";
        DBUtil instance = new DBUtil();
        int expResult = 1;
        int result = instance.deleteVendorByEmail(email);
        assertEquals(expResult, result);
    }

    /**
     * Test of vendorLogin method, of class DBUtil.
     */
    @Test
    public void test9VendorLogin() {
        System.out.println("vendorLogin");
        Login bean = new Login("abc@def.com", "123456");
        DBUtil instance = new DBUtil();
        Vendor expResult = new Vendor(5, "Test 1", "No 123", "1234567", "abc@def.com", "e10adc3949ba59abbe56e057f20f883e", 1, 17);
        Vendor result = instance.vendorLogin(bean);
        assertEquals(expResult.getName(), result.getName());
        assertEquals(expResult.getEmail(), result.getEmail());
    }

    /**
     * Test of createCategory method, of class DBUtil.
     */
    @Test
    public void test10CreateCategory() {
        System.out.println("createCategory");
        Category category = new Category(0, "Test case", "Test case des", 5);
        DBUtil instance = new DBUtil();
        int expResult = 1;
        int result = instance.createCategory(category);
        assertEquals(expResult, result);
    }

    /**
     * Test of checkCategoryExistByName method, of class DBUtil.
     */
    @Test
    public void test11CheckCategoryExistByName() {
        System.out.println("checkCategoryExistByName");
        String name = "Test case";
        DBUtil instance = new DBUtil();
        boolean expResult = true;
        boolean result = instance.checkCategoryExistByName(name);
        assertEquals(expResult, result);
    }

    /**
     * Test of editCategoryById method, of class DBUtil.
     */
    @Test
    public void test12EditCategoryById() {
        System.out.println("editCategoryById");
        DBUtil instance = new DBUtil();
        Category category = new Category(instance.getLastInsertedIdForTest("category"), "Test case edit", "Test case des", 5);
        int expResult = 1;
        int result = instance.editCategoryById(category);
        assertEquals(expResult, result);
    }

    /**
     * Test of createItem method, of class DBUtil.
     */
    @Test
    public void test13CreateItem() {
        System.out.println("createItem");
        DBUtil instance = new DBUtil();
        Item item = new Item(0, "Test item", 100.0f, 20, instance.getLastInsertedIdForTest("category"), 5);
        int expResult = 1;
        int result = instance.createItem(item);
        assertEquals(expResult, result);
    }

    /**
     * Test of editItemById method, of class DBUtil.
     */
    @Test
    public void test14EditItemById() {
        System.out.println("editItemById");
        DBUtil instance = new DBUtil();
        Item item = new Item(instance.getLastInsertedIdForTest("item"), "Test item", 100.0f, 22, 8, 5);
        int expResult = 1;
        int result = instance.editItemById(item);
        assertEquals(expResult, result);
    }

    /**
     * Test of getItemById method, of class DBUtil.
     */
    @Test
    public void test15GetItemById() {
        System.out.println("getItemById");
        DBUtil instance = new DBUtil();
        int id = instance.getLastInsertedIdForTest("item");
        Item expResult = new Item(instance.getLastInsertedIdForTest("item"), "Test item", 100.0f, 22, 8, 5);
        Item result = instance.getItemById(id);
        assertEquals(expResult.getName(), result.getName());
    }

    /**
     * Test of insertOrder method, of class DBUtil.
     */
    @Test
    public void test16InsertOrder() {
        System.out.println("insertOrder");
        Order order = new Order(0, 5, "2020-01-25 07:29:23", null);
        DBUtil instance = new DBUtil();
        int result = instance.insertOrder(order);
        int expResult = instance.getLastInsertedIdForTest("order");
        assertEquals(expResult, result);
    }

    /**
     * Test of insertOrderItem method, of class DBUtil.
     */
    @Test
    public void test17InsertOrderItem() {
        System.out.println("insertOrderItem");
        DBUtil instance = new DBUtil();
        Item item = new Item(instance.getLastInsertedIdForTest("item"), "Test item", 100.0f, 22, 8, 5);
        int order_id = instance.getLastInsertedIdForTest("order");
        int expResult = 1;
        int result = instance.insertOrderItem(item, order_id);
        assertEquals(expResult, result);
    }

    /**
     * Test of getCurrentStockByItemId method, of class DBUtil.
     */
    @Test
    public void test18GetCurrentStockByItemId() {
        System.out.println("getCurrentStockByItemId");
        DBUtil instance = new DBUtil();
        int itemId = instance.getLastInsertedIdForTest("item");
        int expResult = 22;
        int result = instance.getCurrentStockByItemId(itemId);
        assertEquals(expResult, result);
    }

    /**
     * Test of updateStockByItemId method, of class DBUtil.
     */
    @Test
    public void test19UpdateStockByItemId() {
        System.out.println("updateStockByItemId");
        DBUtil instance = new DBUtil();
        int itemId = instance.getLastInsertedIdForTest("item");
        int quantity = 40;
        int expResult = 1;
        int result = instance.updateStockByItemId(itemId, quantity);
        assertEquals(expResult, result);
    }

    /**
     * Test of searchOrCheckStockCakeByItemNameOrCode method, of class DBUtil.
     */
    @Test
    public void test20SearchOrCheckStockCakeByItemNameOrCode() {
        System.out.println("searchOrCheckStockCakeByItemNameOrCode");
        String searchtext = "Test";
        DBUtil instance = new DBUtil();
        ArrayList<Item> expResult = new ArrayList<>();
        expResult.add(new Item(instance.getLastInsertedIdForTest("item"), "Test item", 100.0f, 22, 8, 17));
        ArrayList<Item> result = instance.searchOrCheckStockCakeByItemNameOrCode(searchtext);
        assertEquals(expResult.get(0).getName(), result.get(0).getName());
    }

    /**
     * Test of getItems method, of class DBUtil.
     */
    @Test
    public void test21GetItems() {
        System.out.println("getItems");
        DBUtil instance = new DBUtil();
        ArrayList<Item> expResult = new ArrayList<>();
        expResult.add(new Item(1, "Dreamy Heart Cake 1.5kg", 4200, 7, 1, 5));
        ArrayList<Item> result = instance.getItems();
        assertEquals(expResult.get(0).getName(), result.get(0).getName());
    }

    /**
     * Test of getCategories method, of class DBUtil.
     */
    @Test
    public void test22GetCategories() {
        System.out.println("getCategories");
        DBUtil instance = new DBUtil();
        ArrayList<Category> expResult = new ArrayList<>();
        expResult.add(new Category(1, "Anniversary Cakes", "Anniversary Cakes", 5));
        ArrayList<Category> result = instance.getCategories();
        assertEquals(expResult.get(0).getName(), result.get(0).getName());
    }

    /**
     * Test of getItemsByCategory method, of class DBUtil.
     */
    @Test
    public void test23GetItemsByCategory() {
        System.out.println("getItemsByCategory");
        int categoryId = 1;
        DBUtil instance = new DBUtil();
        ArrayList<Item> expResult = new ArrayList<>();
        expResult.add(new Item(1, "Dreamy Heart Cake 1.5kg", 4200, 7, 1, 5));
        ArrayList<Item> result = instance.getItemsByCategory(categoryId);
        assertEquals(expResult.get(0).getName(), result.get(0).getName());
    }

    /**
     * Test of getOrders method, of class DBUtil.
     */
    /*@Test
    public void testGetOrders() {
        System.out.println("getOrders");
        DBUtil instance = new DBUtil();
        ArrayList<Order> expResult = null;
        ArrayList<Order> result = instance.getOrders();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
    /**
     * Test of getOrdersByVendorId method, of class DBUtil.
     */
    /*@Test
    public void testGetOrdersByVendorId() {
        System.out.println("getOrdersByVendorId");
        int searchVendorId = 0;
        DBUtil instance = new DBUtil();
        ArrayList<Order> expResult = null;
        ArrayList<Order> result = instance.getOrdersByVendorId(searchVendorId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
    /**
     * Test of getOrdersByInvoiceId method, of class DBUtil.
     */
    /*@Test
    public void testGetOrdersByInvoiceId() {
        System.out.println("getOrdersByInvoiceId");
        int invoiceId = 0;
        DBUtil instance = new DBUtil();
        Order expResult = null;
        Order result = instance.getOrdersByInvoiceId(invoiceId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
    /**
     * Test of getUsers method, of class DBUtil.
     */
    @Test
    public void test24GetUsers() {
        System.out.println("getUsers");
        DBUtil instance = new DBUtil();
        ArrayList<Register> expResult = new ArrayList<>();
        expResult.add(new Register(5, "ivan", "test@gmail.com", "e10adc3949ba59abbe56e057f20f883e", 1));

        ArrayList<Register> result = instance.getUsers();
        assertEquals(expResult.get(0).getName(), result.get(0).getName());
    }

    /**
     * Test of getVendors method, of class DBUtil.
     */
    @Test
    public void test25GetVendors() {
        System.out.println("getVendors");
        DBUtil instance = new DBUtil();
        ArrayList<Vendor> expResult = new ArrayList<>();
        expResult.add(new Vendor(1, "Test 1", "No 123", "1234567", "abc@def.com", "e10adc3949ba59abbe56e057f20f883e", 1, 10));

        ArrayList<Vendor> result = instance.getVendors();
        assertEquals(expResult.get(0).getEmail(), result.get(0).getEmail());
    }

    /**
     * Test of getVendorTypeById method, of class DBUtil.
     */
    @Test
    public void test26GetVendorTypeById() {
        System.out.println("getVendorTypeById");
        int id = 1;
        DBUtil instance = new DBUtil();
        String expResult = "Seller";
        String result = instance.getVendorTypeById(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of getCategoryById method, of class DBUtil.
     */
    @Test
    public void test27GetCategoryById() {
//        System.out.println("getCategoryById");
//        DBUtil instance = new DBUtil();
//        int id = instance.getLastInsertedIdForTest("category");
//        Category expResult = new Category(instance.getLastInsertedIdForTest("category"), "Test case", "Test case des", 5);
//        Category result = instance.getCategoryById(id);
//        assertEquals(expResult.getName(), result.getName());
    }

    /**
     * Test of getVendorById method, of class DBUtil.
     */
    @Test
    public void test28GetVendorById() {
//        System.out.println("getVendorById");
//        int id = 6;
//        DBUtil instance = new DBUtil();
//        Vendor expResult = new Vendor(6, "Test Vendor", "Test address", "Test address", "test@test.com", "123456", 1, 17);
//        Vendor result = instance.getVendorById(id);
//        assertEquals(expResult.getName(), result.getName());
    }

    @Test
    public void test29DeleteLastRecordFromTableForTest() {
        System.out.println("deleteLastRecordFromTableForTest");
        String email = "test@email.com";
        DBUtil instance = new DBUtil();
        instance.deleteLastRecordFromTableForTest("order_item");

        instance.deleteLastRecordFromTableForTest("order");
        instance.deleteLastRecordFromTableForTest("item");
        instance.deleteLastRecordFromTableForTest("category");

    }
}
