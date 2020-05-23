/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import model.Category;
import model.Item;
import model.Login;
import model.Order;
import model.Register;
import model.Vendor;

/**
 *
 * @author ivanroldan
 */
@WebService(serviceName = "DataTier")
public class DataTier {

    @WebMethod(operationName = "checkLogin")
    public Register checkLogin(@WebParam(name = "loginData") Login loginData) {
        DBUtil bUtil = new DBUtil();
        return bUtil.login(loginData);
    }

    @WebMethod(operationName = "getUserRole")
    public Integer getUserRole(@WebParam(name = "email") String email) {
        DBUtil bUtil = new DBUtil();
        return bUtil.getUserRoleByEmail(email);
    }

    @WebMethod(operationName = "checkUserExistByEmail")
    public Boolean checkUserExistByEmail(@WebParam(name = "email") String email) {
        DBUtil bUtil = new DBUtil();
        return bUtil.checkUserExistByEmail(email);
    }

    @WebMethod(operationName = "userRegister")
    public Integer userRegister(@WebParam(name = "register") Register register) {
        DBUtil bUtil = new DBUtil();
        return bUtil.userRegister(register);
    }

    @WebMethod(operationName = "vendorRegister")
    public Integer vendorRegister(@WebParam(name = "vendor") Vendor vendor) {
        DBUtil bUtil = new DBUtil();
        return bUtil.vendorRegister(vendor);
    }

    @WebMethod(operationName = "checkVendorExistByEmail")
    public Boolean checkVendorExistByEmail(@WebParam(name = "email") String email) {
        DBUtil bUtil = new DBUtil();
        return bUtil.checkVendorExistByEmail(email);
    }

    @WebMethod(operationName = "vendorLogin")
    public Vendor vendorLogin(@WebParam(name = "login") Login login) {
        DBUtil bUtil = new DBUtil();
        return bUtil.vendorLogin(login);
    }

    @WebMethod(operationName = "getVendorTypeByEmail")
    public Integer getVendorTypeByEmail(@WebParam(name = "email") String email) {
        DBUtil bUtil = new DBUtil();
        return bUtil.getVendorTypeByEmail(email);
    }

    @WebMethod(operationName = "createCategory")
    public Integer createCategory(@WebParam(name = "category") Category category) {
        DBUtil bUtil = new DBUtil();
        return bUtil.createCategory(category);
    }

    @WebMethod(operationName = "editCategoryById")
    public Integer editCategoryById(@WebParam(name = "category") Category category) {
        DBUtil bUtil = new DBUtil();
        return bUtil.editCategoryById(category);
    }

    @WebMethod(operationName = "createItem")
    public Integer createItem(@WebParam(name = "item") Item item) {
        DBUtil bUtil = new DBUtil();
        return bUtil.createItem(item);
    }

    @WebMethod(operationName = "editItemById")
    public Integer editItemById(@WebParam(name = "item") Item item) {
        DBUtil bUtil = new DBUtil();
        return bUtil.editItemById(item);
    }

    @WebMethod(operationName = "insertOrder")
    public Integer insertOrder(@WebParam(name = "order") Order order) {
        DBUtil bUtil = new DBUtil();
        return bUtil.insertOrder(order);
    }

    @WebMethod(operationName = "insertOrderItem")
    public Integer insertOrderItem(@WebParam(name = "orderItem") Item orderItem, @WebParam(name = "orderId") int orderId) {
        DBUtil bUtil = new DBUtil();
        return bUtil.insertOrderItem(orderItem, orderId);
    }

    @WebMethod(operationName = "getCurrentStockByItemId")
    public Integer getCurrentStockByItemId(@WebParam(name = "itemId") int itemId) {
        DBUtil bUtil = new DBUtil();
        return bUtil.getCurrentStockByItemId(itemId);
    }

    @WebMethod(operationName = "updateStockByItemId")
    public Integer updateStockByItemId(@WebParam(name = "itemId") int itemId, @WebParam(name = "quantity") int quantity) {
        DBUtil bUtil = new DBUtil();
        return bUtil.updateStockByItemId(itemId, quantity);
    }

    @WebMethod(operationName = "searchOrCheckStockCakeByItemNameOrCode")
    public ArrayList<Item> searchOrCheckStockCakeByItemNameOrCode(@WebParam(name = "searchText") String searchText) {
        DBUtil bUtil = new DBUtil();
        return bUtil.searchOrCheckStockCakeByItemNameOrCode(searchText);
    }

    @WebMethod(operationName = "getItems")
    public ArrayList<Item> getItems() {
        DBUtil bUtil = new DBUtil();
        return bUtil.getItems();
    }

    @WebMethod(operationName = "getCategories")
    public ArrayList<Category> getCategories() {
        DBUtil bUtil = new DBUtil();
        return bUtil.getCategories();
    }

    @WebMethod(operationName = "getItemsByCategory")
    public ArrayList<Item> getItemsByCategory(@WebParam(name = "categoryId") Integer categoryId) {
        DBUtil bUtil = new DBUtil();
        return bUtil.getItemsByCategory(categoryId);
    }

    @WebMethod(operationName = "getOrders")
    public ArrayList<Order> getOrders() {
        DBUtil bUtil = new DBUtil();
        return bUtil.getOrders();
    }

    @WebMethod(operationName = "getOrderByVendorId")
    public ArrayList<Order> getOrderByVendorId(@WebParam(name = "vendorId") Integer vendorId) {
        DBUtil bUtil = new DBUtil();
        return bUtil.getOrdersByVendorId(vendorId);
    }

    @WebMethod(operationName = "getUsers")
    public ArrayList<Register> getUsers() {
        DBUtil bUtil = new DBUtil();
        return bUtil.getUsers();
    }

    @WebMethod(operationName = "getVendors")
    public ArrayList<Vendor> getVendors() {
        DBUtil bUtil = new DBUtil();
        return bUtil.getVendors();
    }

    @WebMethod(operationName = "getVendorTypeById")
    public String getVendorTypeById(@WebParam(name = "vendorType") int vendorType) {
        DBUtil bUtil = new DBUtil();
        return bUtil.getVendorTypeById(vendorType);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "checkCategoryExistByName")
    public Boolean checkCategoryExistByName(@WebParam(name = "categoryName") String categoryName) {
        DBUtil bUtil = new DBUtil();
        return bUtil.checkCategoryExistByName(categoryName);
    }

    @WebMethod(operationName = "getCategoryById")
    public Category getCategoryById(@WebParam(name = "categoryId") int categoryId) {
        DBUtil bUtil = new DBUtil();
        return bUtil.getCategoryById(categoryId);
    }

    @WebMethod(operationName = "getItemById")
    public Item getItemById(@WebParam(name = "itemId") int itemId) {
        DBUtil bUtil = new DBUtil();
        return bUtil.getItemById(itemId);
    }

    @WebMethod(operationName = "getOrdersByInvoiceId")
    public Order getOrdersByInvoiceId(@WebParam(name = "invoiceId") int invoiceId) {
        DBUtil bUtil = new DBUtil();
        return bUtil.getOrdersByInvoiceId(invoiceId);
    }

    @WebMethod(operationName = "getVendorById")
    public Vendor getVendorById(@WebParam(name = "vendorId") int vendorId) {
        DBUtil bUtil = new DBUtil();
        return bUtil.getVendorById(vendorId);
    }

    @WebMethod(operationName = "updatePasswordByEmail")
    public Boolean updatePasswordByEmail(@WebParam(name = "email") String email, @WebParam(name = "password") String password) {
        DBUtil bUtil = new DBUtil();
        return bUtil.updatePasswordByEmail(email,password);
    }

}
