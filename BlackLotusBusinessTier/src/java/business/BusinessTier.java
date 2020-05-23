/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import data.Category;
import data.DataTier;
import data.DataTier_Service;
import data.Item;
import data.Login;
import data.Order;
import data.Register;
import data.Vendor;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author ivanroldan
 */
@WebService(serviceName = "BusinessTier")
public class BusinessTier {

    @WebMethod(operationName = "checkLogin")
    public ResponseObject checkLogin(@WebParam(name = "loginData") Login loginData) {
        return new BusinessLogic().checkLogin(loginData);
    }

    @WebMethod(operationName = "userRegister")
    public ResponseObject userRegister(@WebParam(name = "register") Register register) {
        return new BusinessLogic().userRegister(register);
    }

    @WebMethod(operationName = "vendorLogin")
    public ResponseObject vendorLogin(@WebParam(name = "loginData") Login loginData) {
        return new BusinessLogic().vendorLogin(loginData);
    }

    @WebMethod(operationName = "vendorRegister")
    public ResponseObject vendorRegister(@WebParam(name = "vendorData") Vendor vendor) {
        return new BusinessLogic().vendorRegister(vendor);
    }

    @WebMethod(operationName = "createCategory")
    public ResponseObject createCategory(@WebParam(name = "categoryData") Category category) {
        return new BusinessLogic().createCategory(category);
    }

    @WebMethod(operationName = "editCategory")
    public ResponseObject editCategory(@WebParam(name = "categoryData") Category category) {
        return new BusinessLogic().editCategory(category);
    }

    @WebMethod(operationName = "getCategories")
    public ResponseObjectCategory getCategories() {
        return new BusinessLogic().getCategories();
    }

    @WebMethod(operationName = "getItems")
    public ResponseObjectItem getItems() {
        return new BusinessLogic().getItems();
    }

    @WebMethod(operationName = "getCategoryById")
    public ResponseObject getCategoryById(@WebParam(name = "categoryId") int categoryId) {
        return new BusinessLogic().getCategoryById(categoryId);
    }

    @WebMethod(operationName = "getItemById")
    public ResponseObject getItemById(@WebParam(name = "itemId") int itemId) {
        return new BusinessLogic().getItemById(itemId);
    }

    @WebMethod(operationName = "createItem")
    public ResponseObject createItem(@WebParam(name = "itemData") Item item) {
        return new BusinessLogic().createItem(item);
    }

    @WebMethod(operationName = "editItem")
    public ResponseObject editItem(@WebParam(name = "itemData") Item item) {
        return new BusinessLogic().editItem(item);
    }

    @WebMethod(operationName = "insertOrder")
    public ResponseObject insertOrder(@WebParam(name = "items") ArrayList<Item> items, @WebParam(name = "vendorId") int vendorId) {
        return new BusinessLogic().insertOrder(vendorId, items);
    }

    @WebMethod(operationName = "updateStock")
    public ResponseObject updateStock(@WebParam(name = "items") ArrayList<Item> items) {
        return new BusinessLogic().updateStock(items);
    }

    @WebMethod(operationName = "getOrderById")
    public Order getOrderById(@WebParam(name = "invoiceId") int invoiceId) {
        return new BusinessLogic().getOrderById(invoiceId);
    }

    @WebMethod(operationName = "getVendorById")
    public Vendor getVendorById(@WebParam(name = "vendorId") int vendorId) {
        DataTier_Service dataTier_Service = new DataTier_Service();
        DataTier dataTier = dataTier_Service.getDataTierPort();
        return dataTier.getVendorById(vendorId);
    }

    @WebMethod(operationName = "getOrdersByVendor")
    public List<Order> getOrdersByVendor(@WebParam(name = "vendorId") int vendorId) {
        DataTier_Service dataTier_Service = new DataTier_Service();
        DataTier dataTier = dataTier_Service.getDataTierPort();
        return dataTier.getOrderByVendorId(vendorId);
    }

    @WebMethod(operationName = "getOrders")
    public List<Order> getOrders() {
        DataTier_Service dataTier_Service = new DataTier_Service();
        DataTier dataTier = dataTier_Service.getDataTierPort();
        return dataTier.getOrders();
    }

    @WebMethod(operationName = "searchOrCheckStockCakeByItemNameOrCode")
    public ResponseObjectItem searchOrCheckStockCakeByItemNameOrCode(@WebParam(name = "searchText") String searchText) {
        return new BusinessLogic().searchOrCheckStockCakeByItemNameOrCode(searchText);
    }

    @WebMethod(operationName = "getUsers")
    public List<Register> getUsers() {
        DataTier_Service dataTier_Service = new DataTier_Service();
        DataTier dataTier = dataTier_Service.getDataTierPort();
        return dataTier.getUsers();
    }

    @WebMethod(operationName = "getVendors")
    public List<Vendor> getVendors() {
        DataTier_Service dataTier_Service = new DataTier_Service();
        DataTier dataTier = dataTier_Service.getDataTierPort();
        return dataTier.getVendors();
    }

    @WebMethod(operationName = "getVendorTypeById")
    public String getVendorTypeById(@WebParam(name = "vendorType") int vendorType) {
        DataTier_Service dataTier_Service = new DataTier_Service();
        DataTier dataTier = dataTier_Service.getDataTierPort();
        return dataTier.getVendorTypeById(vendorType);
    }
    
    
    @WebMethod(operationName = "forgotPasswordVendor")
    public ResponseObject forgotPasswordVendor(@WebParam(name = "email") String email) {
        return new BusinessLogic().forgotPasswordVendor(email);
    }


}
