
package business;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import data.Category;
import data.Item;
import data.Login;
import data.Order;
import data.Register;
import data.Vendor;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "BusinessTier", targetNamespace = "http://business/")
@XmlSeeAlso({
    business.ObjectFactory.class,
    data.ObjectFactory.class
})
public interface BusinessTier {


    /**
     * 
     * @param categoryId
     * @return
     *     returns business.ResponseObject
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCategoryById", targetNamespace = "http://business/", className = "business.GetCategoryById")
    @ResponseWrapper(localName = "getCategoryByIdResponse", targetNamespace = "http://business/", className = "business.GetCategoryByIdResponse")
    @Action(input = "http://business/BusinessTier/getCategoryByIdRequest", output = "http://business/BusinessTier/getCategoryByIdResponse")
    public ResponseObject getCategoryById(
        @WebParam(name = "categoryId", targetNamespace = "")
        int categoryId);

    /**
     * 
     * @param itemId
     * @return
     *     returns business.ResponseObject
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getItemById", targetNamespace = "http://business/", className = "business.GetItemById")
    @ResponseWrapper(localName = "getItemByIdResponse", targetNamespace = "http://business/", className = "business.GetItemByIdResponse")
    @Action(input = "http://business/BusinessTier/getItemByIdRequest", output = "http://business/BusinessTier/getItemByIdResponse")
    public ResponseObject getItemById(
        @WebParam(name = "itemId", targetNamespace = "")
        int itemId);

    /**
     * 
     * @param itemData
     * @return
     *     returns business.ResponseObject
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "createItem", targetNamespace = "http://business/", className = "business.CreateItem")
    @ResponseWrapper(localName = "createItemResponse", targetNamespace = "http://business/", className = "business.CreateItemResponse")
    @Action(input = "http://business/BusinessTier/createItemRequest", output = "http://business/BusinessTier/createItemResponse")
    public ResponseObject createItem(
        @WebParam(name = "itemData", targetNamespace = "")
        Item itemData);

    /**
     * 
     * @param itemData
     * @return
     *     returns business.ResponseObject
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "editItem", targetNamespace = "http://business/", className = "business.EditItem")
    @ResponseWrapper(localName = "editItemResponse", targetNamespace = "http://business/", className = "business.EditItemResponse")
    @Action(input = "http://business/BusinessTier/editItemRequest", output = "http://business/BusinessTier/editItemResponse")
    public ResponseObject editItem(
        @WebParam(name = "itemData", targetNamespace = "")
        Item itemData);

    /**
     * 
     * @param vendorId
     * @param items
     * @return
     *     returns business.ResponseObject
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertOrder", targetNamespace = "http://business/", className = "business.InsertOrder")
    @ResponseWrapper(localName = "insertOrderResponse", targetNamespace = "http://business/", className = "business.InsertOrderResponse")
    @Action(input = "http://business/BusinessTier/insertOrderRequest", output = "http://business/BusinessTier/insertOrderResponse")
    public ResponseObject insertOrder(
        @WebParam(name = "items", targetNamespace = "")
        List<Item> items,
        @WebParam(name = "vendorId", targetNamespace = "")
        int vendorId);

    /**
     * 
     * @param items
     * @return
     *     returns business.ResponseObject
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateStock", targetNamespace = "http://business/", className = "business.UpdateStock")
    @ResponseWrapper(localName = "updateStockResponse", targetNamespace = "http://business/", className = "business.UpdateStockResponse")
    @Action(input = "http://business/BusinessTier/updateStockRequest", output = "http://business/BusinessTier/updateStockResponse")
    public ResponseObject updateStock(
        @WebParam(name = "items", targetNamespace = "")
        List<Item> items);

    /**
     * 
     * @param invoiceId
     * @return
     *     returns data.Order
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getOrderById", targetNamespace = "http://business/", className = "business.GetOrderById")
    @ResponseWrapper(localName = "getOrderByIdResponse", targetNamespace = "http://business/", className = "business.GetOrderByIdResponse")
    @Action(input = "http://business/BusinessTier/getOrderByIdRequest", output = "http://business/BusinessTier/getOrderByIdResponse")
    public Order getOrderById(
        @WebParam(name = "invoiceId", targetNamespace = "")
        int invoiceId);

    /**
     * 
     * @param vendorId
     * @return
     *     returns data.Vendor
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getVendorById", targetNamespace = "http://business/", className = "business.GetVendorById")
    @ResponseWrapper(localName = "getVendorByIdResponse", targetNamespace = "http://business/", className = "business.GetVendorByIdResponse")
    @Action(input = "http://business/BusinessTier/getVendorByIdRequest", output = "http://business/BusinessTier/getVendorByIdResponse")
    public Vendor getVendorById(
        @WebParam(name = "vendorId", targetNamespace = "")
        int vendorId);

    /**
     * 
     * @param vendorId
     * @return
     *     returns java.util.List<data.Order>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getOrdersByVendor", targetNamespace = "http://business/", className = "business.GetOrdersByVendor")
    @ResponseWrapper(localName = "getOrdersByVendorResponse", targetNamespace = "http://business/", className = "business.GetOrdersByVendorResponse")
    @Action(input = "http://business/BusinessTier/getOrdersByVendorRequest", output = "http://business/BusinessTier/getOrdersByVendorResponse")
    public List<Order> getOrdersByVendor(
        @WebParam(name = "vendorId", targetNamespace = "")
        int vendorId);

    /**
     * 
     * @return
     *     returns java.util.List<data.Order>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getOrders", targetNamespace = "http://business/", className = "business.GetOrders")
    @ResponseWrapper(localName = "getOrdersResponse", targetNamespace = "http://business/", className = "business.GetOrdersResponse")
    @Action(input = "http://business/BusinessTier/getOrdersRequest", output = "http://business/BusinessTier/getOrdersResponse")
    public List<Order> getOrders();

    /**
     * 
     * @param searchText
     * @return
     *     returns business.ResponseObjectItem
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "searchOrCheckStockCakeByItemNameOrCode", targetNamespace = "http://business/", className = "business.SearchOrCheckStockCakeByItemNameOrCode")
    @ResponseWrapper(localName = "searchOrCheckStockCakeByItemNameOrCodeResponse", targetNamespace = "http://business/", className = "business.SearchOrCheckStockCakeByItemNameOrCodeResponse")
    @Action(input = "http://business/BusinessTier/searchOrCheckStockCakeByItemNameOrCodeRequest", output = "http://business/BusinessTier/searchOrCheckStockCakeByItemNameOrCodeResponse")
    public ResponseObjectItem searchOrCheckStockCakeByItemNameOrCode(
        @WebParam(name = "searchText", targetNamespace = "")
        String searchText);

    /**
     * 
     * @return
     *     returns java.util.List<data.Vendor>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getVendors", targetNamespace = "http://business/", className = "business.GetVendors")
    @ResponseWrapper(localName = "getVendorsResponse", targetNamespace = "http://business/", className = "business.GetVendorsResponse")
    @Action(input = "http://business/BusinessTier/getVendorsRequest", output = "http://business/BusinessTier/getVendorsResponse")
    public List<Vendor> getVendors();

    /**
     * 
     * @param vendorType
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getVendorTypeById", targetNamespace = "http://business/", className = "business.GetVendorTypeById")
    @ResponseWrapper(localName = "getVendorTypeByIdResponse", targetNamespace = "http://business/", className = "business.GetVendorTypeByIdResponse")
    @Action(input = "http://business/BusinessTier/getVendorTypeByIdRequest", output = "http://business/BusinessTier/getVendorTypeByIdResponse")
    public String getVendorTypeById(
        @WebParam(name = "vendorType", targetNamespace = "")
        int vendorType);

    /**
     * 
     * @param loginData
     * @return
     *     returns business.ResponseObject
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "checkLogin", targetNamespace = "http://business/", className = "business.CheckLogin")
    @ResponseWrapper(localName = "checkLoginResponse", targetNamespace = "http://business/", className = "business.CheckLoginResponse")
    @Action(input = "http://business/BusinessTier/checkLoginRequest", output = "http://business/BusinessTier/checkLoginResponse")
    public ResponseObject checkLogin(
        @WebParam(name = "loginData", targetNamespace = "")
        Login loginData);

    /**
     * 
     * @param register
     * @return
     *     returns business.ResponseObject
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "userRegister", targetNamespace = "http://business/", className = "business.UserRegister")
    @ResponseWrapper(localName = "userRegisterResponse", targetNamespace = "http://business/", className = "business.UserRegisterResponse")
    @Action(input = "http://business/BusinessTier/userRegisterRequest", output = "http://business/BusinessTier/userRegisterResponse")
    public ResponseObject userRegister(
        @WebParam(name = "register", targetNamespace = "")
        Register register);

    /**
     * 
     * @param loginData
     * @return
     *     returns business.ResponseObject
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "vendorLogin", targetNamespace = "http://business/", className = "business.VendorLogin")
    @ResponseWrapper(localName = "vendorLoginResponse", targetNamespace = "http://business/", className = "business.VendorLoginResponse")
    @Action(input = "http://business/BusinessTier/vendorLoginRequest", output = "http://business/BusinessTier/vendorLoginResponse")
    public ResponseObject vendorLogin(
        @WebParam(name = "loginData", targetNamespace = "")
        Login loginData);

    /**
     * 
     * @param vendorData
     * @return
     *     returns business.ResponseObject
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "vendorRegister", targetNamespace = "http://business/", className = "business.VendorRegister")
    @ResponseWrapper(localName = "vendorRegisterResponse", targetNamespace = "http://business/", className = "business.VendorRegisterResponse")
    @Action(input = "http://business/BusinessTier/vendorRegisterRequest", output = "http://business/BusinessTier/vendorRegisterResponse")
    public ResponseObject vendorRegister(
        @WebParam(name = "vendorData", targetNamespace = "")
        Vendor vendorData);

    /**
     * 
     * @param categoryData
     * @return
     *     returns business.ResponseObject
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "createCategory", targetNamespace = "http://business/", className = "business.CreateCategory")
    @ResponseWrapper(localName = "createCategoryResponse", targetNamespace = "http://business/", className = "business.CreateCategoryResponse")
    @Action(input = "http://business/BusinessTier/createCategoryRequest", output = "http://business/BusinessTier/createCategoryResponse")
    public ResponseObject createCategory(
        @WebParam(name = "categoryData", targetNamespace = "")
        Category categoryData);

    /**
     * 
     * @param categoryData
     * @return
     *     returns business.ResponseObject
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "editCategory", targetNamespace = "http://business/", className = "business.EditCategory")
    @ResponseWrapper(localName = "editCategoryResponse", targetNamespace = "http://business/", className = "business.EditCategoryResponse")
    @Action(input = "http://business/BusinessTier/editCategoryRequest", output = "http://business/BusinessTier/editCategoryResponse")
    public ResponseObject editCategory(
        @WebParam(name = "categoryData", targetNamespace = "")
        Category categoryData);

    /**
     * 
     * @return
     *     returns business.ResponseObjectCategory
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCategories", targetNamespace = "http://business/", className = "business.GetCategories")
    @ResponseWrapper(localName = "getCategoriesResponse", targetNamespace = "http://business/", className = "business.GetCategoriesResponse")
    @Action(input = "http://business/BusinessTier/getCategoriesRequest", output = "http://business/BusinessTier/getCategoriesResponse")
    public ResponseObjectCategory getCategories();

    /**
     * 
     * @return
     *     returns business.ResponseObjectItem
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getItems", targetNamespace = "http://business/", className = "business.GetItems")
    @ResponseWrapper(localName = "getItemsResponse", targetNamespace = "http://business/", className = "business.GetItemsResponse")
    @Action(input = "http://business/BusinessTier/getItemsRequest", output = "http://business/BusinessTier/getItemsResponse")
    public ResponseObjectItem getItems();

    /**
     * 
     * @param email
     * @return
     *     returns business.ResponseObject
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "forgotPasswordVendor", targetNamespace = "http://business/", className = "business.ForgotPasswordVendor")
    @ResponseWrapper(localName = "forgotPasswordVendorResponse", targetNamespace = "http://business/", className = "business.ForgotPasswordVendorResponse")
    @Action(input = "http://business/BusinessTier/forgotPasswordVendorRequest", output = "http://business/BusinessTier/forgotPasswordVendorResponse")
    public ResponseObject forgotPasswordVendor(
        @WebParam(name = "email", targetNamespace = "")
        String email);

    /**
     * 
     * @return
     *     returns java.util.List<data.Register>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getUsers", targetNamespace = "http://business/", className = "business.GetUsers")
    @ResponseWrapper(localName = "getUsersResponse", targetNamespace = "http://business/", className = "business.GetUsersResponse")
    @Action(input = "http://business/BusinessTier/getUsersRequest", output = "http://business/BusinessTier/getUsersResponse")
    public List<Register> getUsers();

}
