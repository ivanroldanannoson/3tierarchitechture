
package business;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the business package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetVendorsResponse_QNAME = new QName("http://business/", "getVendorsResponse");
    private final static QName _CreateItem_QNAME = new QName("http://business/", "createItem");
    private final static QName _GetVendorById_QNAME = new QName("http://business/", "getVendorById");
    private final static QName _VendorRegister_QNAME = new QName("http://business/", "vendorRegister");
    private final static QName _GetCategories_QNAME = new QName("http://business/", "getCategories");
    private final static QName _GetItems_QNAME = new QName("http://business/", "getItems");
    private final static QName _VendorLoginResponse_QNAME = new QName("http://business/", "vendorLoginResponse");
    private final static QName _ForgotPasswordVendor_QNAME = new QName("http://business/", "forgotPasswordVendor");
    private final static QName _UserRegister_QNAME = new QName("http://business/", "userRegister");
    private final static QName _GetOrderById_QNAME = new QName("http://business/", "getOrderById");
    private final static QName _UserRegisterResponse_QNAME = new QName("http://business/", "userRegisterResponse");
    private final static QName _GetOrdersResponse_QNAME = new QName("http://business/", "getOrdersResponse");
    private final static QName _VendorLogin_QNAME = new QName("http://business/", "vendorLogin");
    private final static QName _ForgotPasswordVendorResponse_QNAME = new QName("http://business/", "forgotPasswordVendorResponse");
    private final static QName _GetVendorTypeById_QNAME = new QName("http://business/", "getVendorTypeById");
    private final static QName _GetOrdersByVendor_QNAME = new QName("http://business/", "getOrdersByVendor");
    private final static QName _InsertOrderResponse_QNAME = new QName("http://business/", "insertOrderResponse");
    private final static QName _GetUsersResponse_QNAME = new QName("http://business/", "getUsersResponse");
    private final static QName _GetItemById_QNAME = new QName("http://business/", "getItemById");
    private final static QName _UpdateStock_QNAME = new QName("http://business/", "updateStock");
    private final static QName _InsertOrder_QNAME = new QName("http://business/", "insertOrder");
    private final static QName _SearchOrCheckStockCakeByItemNameOrCode_QNAME = new QName("http://business/", "searchOrCheckStockCakeByItemNameOrCode");
    private final static QName _GetVendorTypeByIdResponse_QNAME = new QName("http://business/", "getVendorTypeByIdResponse");
    private final static QName _VendorRegisterResponse_QNAME = new QName("http://business/", "vendorRegisterResponse");
    private final static QName _GetItemByIdResponse_QNAME = new QName("http://business/", "getItemByIdResponse");
    private final static QName _UpdateStockResponse_QNAME = new QName("http://business/", "updateStockResponse");
    private final static QName _GetCategoryById_QNAME = new QName("http://business/", "getCategoryById");
    private final static QName _GetVendorByIdResponse_QNAME = new QName("http://business/", "getVendorByIdResponse");
    private final static QName _CheckLoginResponse_QNAME = new QName("http://business/", "checkLoginResponse");
    private final static QName _GetOrders_QNAME = new QName("http://business/", "getOrders");
    private final static QName _GetUsers_QNAME = new QName("http://business/", "getUsers");
    private final static QName _CreateCategory_QNAME = new QName("http://business/", "createCategory");
    private final static QName _GetItemsResponse_QNAME = new QName("http://business/", "getItemsResponse");
    private final static QName _EditItemResponse_QNAME = new QName("http://business/", "editItemResponse");
    private final static QName _GetVendors_QNAME = new QName("http://business/", "getVendors");
    private final static QName _CreateItemResponse_QNAME = new QName("http://business/", "createItemResponse");
    private final static QName _GetOrdersByVendorResponse_QNAME = new QName("http://business/", "getOrdersByVendorResponse");
    private final static QName _EditCategoryResponse_QNAME = new QName("http://business/", "editCategoryResponse");
    private final static QName _GetCategoryByIdResponse_QNAME = new QName("http://business/", "getCategoryByIdResponse");
    private final static QName _SearchOrCheckStockCakeByItemNameOrCodeResponse_QNAME = new QName("http://business/", "searchOrCheckStockCakeByItemNameOrCodeResponse");
    private final static QName _GetCategoriesResponse_QNAME = new QName("http://business/", "getCategoriesResponse");
    private final static QName _CreateCategoryResponse_QNAME = new QName("http://business/", "createCategoryResponse");
    private final static QName _GetOrderByIdResponse_QNAME = new QName("http://business/", "getOrderByIdResponse");
    private final static QName _EditItem_QNAME = new QName("http://business/", "editItem");
    private final static QName _EditCategory_QNAME = new QName("http://business/", "editCategory");
    private final static QName _CheckLogin_QNAME = new QName("http://business/", "checkLogin");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: business
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetItemsResponse }
     * 
     */
    public GetItemsResponse createGetItemsResponse() {
        return new GetItemsResponse();
    }

    /**
     * Create an instance of {@link GetOrdersResponse }
     * 
     */
    public GetOrdersResponse createGetOrdersResponse() {
        return new GetOrdersResponse();
    }

    /**
     * Create an instance of {@link VendorLogin }
     * 
     */
    public VendorLogin createVendorLogin() {
        return new VendorLogin();
    }

    /**
     * Create an instance of {@link EditCategory }
     * 
     */
    public EditCategory createEditCategory() {
        return new EditCategory();
    }

    /**
     * Create an instance of {@link GetOrderById }
     * 
     */
    public GetOrderById createGetOrderById() {
        return new GetOrderById();
    }

    /**
     * Create an instance of {@link EditItem }
     * 
     */
    public EditItem createEditItem() {
        return new EditItem();
    }

    /**
     * Create an instance of {@link UserRegisterResponse }
     * 
     */
    public UserRegisterResponse createUserRegisterResponse() {
        return new UserRegisterResponse();
    }

    /**
     * Create an instance of {@link GetVendorTypeById }
     * 
     */
    public GetVendorTypeById createGetVendorTypeById() {
        return new GetVendorTypeById();
    }

    /**
     * Create an instance of {@link CheckLogin }
     * 
     */
    public CheckLogin createCheckLogin() {
        return new CheckLogin();
    }

    /**
     * Create an instance of {@link ForgotPasswordVendorResponse }
     * 
     */
    public ForgotPasswordVendorResponse createForgotPasswordVendorResponse() {
        return new ForgotPasswordVendorResponse();
    }

    /**
     * Create an instance of {@link EditItemResponse }
     * 
     */
    public EditItemResponse createEditItemResponse() {
        return new EditItemResponse();
    }

    /**
     * Create an instance of {@link GetItems }
     * 
     */
    public GetItems createGetItems() {
        return new GetItems();
    }

    /**
     * Create an instance of {@link GetVendorTypeByIdResponse }
     * 
     */
    public GetVendorTypeByIdResponse createGetVendorTypeByIdResponse() {
        return new GetVendorTypeByIdResponse();
    }

    /**
     * Create an instance of {@link VendorRegister }
     * 
     */
    public VendorRegister createVendorRegister() {
        return new VendorRegister();
    }

    /**
     * Create an instance of {@link GetCategories }
     * 
     */
    public GetCategories createGetCategories() {
        return new GetCategories();
    }

    /**
     * Create an instance of {@link GetUsers }
     * 
     */
    public GetUsers createGetUsers() {
        return new GetUsers();
    }

    /**
     * Create an instance of {@link UserRegister }
     * 
     */
    public UserRegister createUserRegister() {
        return new UserRegister();
    }

    /**
     * Create an instance of {@link CreateCategory }
     * 
     */
    public CreateCategory createCreateCategory() {
        return new CreateCategory();
    }

    /**
     * Create an instance of {@link ForgotPasswordVendor }
     * 
     */
    public ForgotPasswordVendor createForgotPasswordVendor() {
        return new ForgotPasswordVendor();
    }

    /**
     * Create an instance of {@link GetItemByIdResponse }
     * 
     */
    public GetItemByIdResponse createGetItemByIdResponse() {
        return new GetItemByIdResponse();
    }

    /**
     * Create an instance of {@link UpdateStockResponse }
     * 
     */
    public UpdateStockResponse createUpdateStockResponse() {
        return new UpdateStockResponse();
    }

    /**
     * Create an instance of {@link VendorLoginResponse }
     * 
     */
    public VendorLoginResponse createVendorLoginResponse() {
        return new VendorLoginResponse();
    }

    /**
     * Create an instance of {@link VendorRegisterResponse }
     * 
     */
    public VendorRegisterResponse createVendorRegisterResponse() {
        return new VendorRegisterResponse();
    }

    /**
     * Create an instance of {@link InsertOrder }
     * 
     */
    public InsertOrder createInsertOrder() {
        return new InsertOrder();
    }

    /**
     * Create an instance of {@link CreateCategoryResponse }
     * 
     */
    public CreateCategoryResponse createCreateCategoryResponse() {
        return new CreateCategoryResponse();
    }

    /**
     * Create an instance of {@link UpdateStock }
     * 
     */
    public UpdateStock createUpdateStock() {
        return new UpdateStock();
    }

    /**
     * Create an instance of {@link SearchOrCheckStockCakeByItemNameOrCode }
     * 
     */
    public SearchOrCheckStockCakeByItemNameOrCode createSearchOrCheckStockCakeByItemNameOrCode() {
        return new SearchOrCheckStockCakeByItemNameOrCode();
    }

    /**
     * Create an instance of {@link GetOrderByIdResponse }
     * 
     */
    public GetOrderByIdResponse createGetOrderByIdResponse() {
        return new GetOrderByIdResponse();
    }

    /**
     * Create an instance of {@link GetVendorById }
     * 
     */
    public GetVendorById createGetVendorById() {
        return new GetVendorById();
    }

    /**
     * Create an instance of {@link CheckLoginResponse }
     * 
     */
    public CheckLoginResponse createCheckLoginResponse() {
        return new CheckLoginResponse();
    }

    /**
     * Create an instance of {@link GetOrders }
     * 
     */
    public GetOrders createGetOrders() {
        return new GetOrders();
    }

    /**
     * Create an instance of {@link InsertOrderResponse }
     * 
     */
    public InsertOrderResponse createInsertOrderResponse() {
        return new InsertOrderResponse();
    }

    /**
     * Create an instance of {@link EditCategoryResponse }
     * 
     */
    public EditCategoryResponse createEditCategoryResponse() {
        return new EditCategoryResponse();
    }

    /**
     * Create an instance of {@link GetCategoryById }
     * 
     */
    public GetCategoryById createGetCategoryById() {
        return new GetCategoryById();
    }

    /**
     * Create an instance of {@link GetOrdersByVendor }
     * 
     */
    public GetOrdersByVendor createGetOrdersByVendor() {
        return new GetOrdersByVendor();
    }

    /**
     * Create an instance of {@link GetOrdersByVendorResponse }
     * 
     */
    public GetOrdersByVendorResponse createGetOrdersByVendorResponse() {
        return new GetOrdersByVendorResponse();
    }

    /**
     * Create an instance of {@link GetVendorsResponse }
     * 
     */
    public GetVendorsResponse createGetVendorsResponse() {
        return new GetVendorsResponse();
    }

    /**
     * Create an instance of {@link GetVendors }
     * 
     */
    public GetVendors createGetVendors() {
        return new GetVendors();
    }

    /**
     * Create an instance of {@link CreateItemResponse }
     * 
     */
    public CreateItemResponse createCreateItemResponse() {
        return new CreateItemResponse();
    }

    /**
     * Create an instance of {@link CreateItem }
     * 
     */
    public CreateItem createCreateItem() {
        return new CreateItem();
    }

    /**
     * Create an instance of {@link GetCategoriesResponse }
     * 
     */
    public GetCategoriesResponse createGetCategoriesResponse() {
        return new GetCategoriesResponse();
    }

    /**
     * Create an instance of {@link GetVendorByIdResponse }
     * 
     */
    public GetVendorByIdResponse createGetVendorByIdResponse() {
        return new GetVendorByIdResponse();
    }

    /**
     * Create an instance of {@link GetItemById }
     * 
     */
    public GetItemById createGetItemById() {
        return new GetItemById();
    }

    /**
     * Create an instance of {@link GetUsersResponse }
     * 
     */
    public GetUsersResponse createGetUsersResponse() {
        return new GetUsersResponse();
    }

    /**
     * Create an instance of {@link GetCategoryByIdResponse }
     * 
     */
    public GetCategoryByIdResponse createGetCategoryByIdResponse() {
        return new GetCategoryByIdResponse();
    }

    /**
     * Create an instance of {@link SearchOrCheckStockCakeByItemNameOrCodeResponse }
     * 
     */
    public SearchOrCheckStockCakeByItemNameOrCodeResponse createSearchOrCheckStockCakeByItemNameOrCodeResponse() {
        return new SearchOrCheckStockCakeByItemNameOrCodeResponse();
    }

    /**
     * Create an instance of {@link ResponseObject }
     * 
     */
    public ResponseObject createResponseObject() {
        return new ResponseObject();
    }

    /**
     * Create an instance of {@link ResponseObjectCategory }
     * 
     */
    public ResponseObjectCategory createResponseObjectCategory() {
        return new ResponseObjectCategory();
    }

    /**
     * Create an instance of {@link ResponseObjectItem }
     * 
     */
    public ResponseObjectItem createResponseObjectItem() {
        return new ResponseObjectItem();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVendorsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://business/", name = "getVendorsResponse")
    public JAXBElement<GetVendorsResponse> createGetVendorsResponse(GetVendorsResponse value) {
        return new JAXBElement<GetVendorsResponse>(_GetVendorsResponse_QNAME, GetVendorsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://business/", name = "createItem")
    public JAXBElement<CreateItem> createCreateItem(CreateItem value) {
        return new JAXBElement<CreateItem>(_CreateItem_QNAME, CreateItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVendorById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://business/", name = "getVendorById")
    public JAXBElement<GetVendorById> createGetVendorById(GetVendorById value) {
        return new JAXBElement<GetVendorById>(_GetVendorById_QNAME, GetVendorById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VendorRegister }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://business/", name = "vendorRegister")
    public JAXBElement<VendorRegister> createVendorRegister(VendorRegister value) {
        return new JAXBElement<VendorRegister>(_VendorRegister_QNAME, VendorRegister.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCategories }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://business/", name = "getCategories")
    public JAXBElement<GetCategories> createGetCategories(GetCategories value) {
        return new JAXBElement<GetCategories>(_GetCategories_QNAME, GetCategories.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItems }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://business/", name = "getItems")
    public JAXBElement<GetItems> createGetItems(GetItems value) {
        return new JAXBElement<GetItems>(_GetItems_QNAME, GetItems.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VendorLoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://business/", name = "vendorLoginResponse")
    public JAXBElement<VendorLoginResponse> createVendorLoginResponse(VendorLoginResponse value) {
        return new JAXBElement<VendorLoginResponse>(_VendorLoginResponse_QNAME, VendorLoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForgotPasswordVendor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://business/", name = "forgotPasswordVendor")
    public JAXBElement<ForgotPasswordVendor> createForgotPasswordVendor(ForgotPasswordVendor value) {
        return new JAXBElement<ForgotPasswordVendor>(_ForgotPasswordVendor_QNAME, ForgotPasswordVendor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserRegister }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://business/", name = "userRegister")
    public JAXBElement<UserRegister> createUserRegister(UserRegister value) {
        return new JAXBElement<UserRegister>(_UserRegister_QNAME, UserRegister.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrderById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://business/", name = "getOrderById")
    public JAXBElement<GetOrderById> createGetOrderById(GetOrderById value) {
        return new JAXBElement<GetOrderById>(_GetOrderById_QNAME, GetOrderById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserRegisterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://business/", name = "userRegisterResponse")
    public JAXBElement<UserRegisterResponse> createUserRegisterResponse(UserRegisterResponse value) {
        return new JAXBElement<UserRegisterResponse>(_UserRegisterResponse_QNAME, UserRegisterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrdersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://business/", name = "getOrdersResponse")
    public JAXBElement<GetOrdersResponse> createGetOrdersResponse(GetOrdersResponse value) {
        return new JAXBElement<GetOrdersResponse>(_GetOrdersResponse_QNAME, GetOrdersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VendorLogin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://business/", name = "vendorLogin")
    public JAXBElement<VendorLogin> createVendorLogin(VendorLogin value) {
        return new JAXBElement<VendorLogin>(_VendorLogin_QNAME, VendorLogin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForgotPasswordVendorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://business/", name = "forgotPasswordVendorResponse")
    public JAXBElement<ForgotPasswordVendorResponse> createForgotPasswordVendorResponse(ForgotPasswordVendorResponse value) {
        return new JAXBElement<ForgotPasswordVendorResponse>(_ForgotPasswordVendorResponse_QNAME, ForgotPasswordVendorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVendorTypeById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://business/", name = "getVendorTypeById")
    public JAXBElement<GetVendorTypeById> createGetVendorTypeById(GetVendorTypeById value) {
        return new JAXBElement<GetVendorTypeById>(_GetVendorTypeById_QNAME, GetVendorTypeById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrdersByVendor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://business/", name = "getOrdersByVendor")
    public JAXBElement<GetOrdersByVendor> createGetOrdersByVendor(GetOrdersByVendor value) {
        return new JAXBElement<GetOrdersByVendor>(_GetOrdersByVendor_QNAME, GetOrdersByVendor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertOrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://business/", name = "insertOrderResponse")
    public JAXBElement<InsertOrderResponse> createInsertOrderResponse(InsertOrderResponse value) {
        return new JAXBElement<InsertOrderResponse>(_InsertOrderResponse_QNAME, InsertOrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://business/", name = "getUsersResponse")
    public JAXBElement<GetUsersResponse> createGetUsersResponse(GetUsersResponse value) {
        return new JAXBElement<GetUsersResponse>(_GetUsersResponse_QNAME, GetUsersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItemById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://business/", name = "getItemById")
    public JAXBElement<GetItemById> createGetItemById(GetItemById value) {
        return new JAXBElement<GetItemById>(_GetItemById_QNAME, GetItemById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateStock }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://business/", name = "updateStock")
    public JAXBElement<UpdateStock> createUpdateStock(UpdateStock value) {
        return new JAXBElement<UpdateStock>(_UpdateStock_QNAME, UpdateStock.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://business/", name = "insertOrder")
    public JAXBElement<InsertOrder> createInsertOrder(InsertOrder value) {
        return new JAXBElement<InsertOrder>(_InsertOrder_QNAME, InsertOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchOrCheckStockCakeByItemNameOrCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://business/", name = "searchOrCheckStockCakeByItemNameOrCode")
    public JAXBElement<SearchOrCheckStockCakeByItemNameOrCode> createSearchOrCheckStockCakeByItemNameOrCode(SearchOrCheckStockCakeByItemNameOrCode value) {
        return new JAXBElement<SearchOrCheckStockCakeByItemNameOrCode>(_SearchOrCheckStockCakeByItemNameOrCode_QNAME, SearchOrCheckStockCakeByItemNameOrCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVendorTypeByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://business/", name = "getVendorTypeByIdResponse")
    public JAXBElement<GetVendorTypeByIdResponse> createGetVendorTypeByIdResponse(GetVendorTypeByIdResponse value) {
        return new JAXBElement<GetVendorTypeByIdResponse>(_GetVendorTypeByIdResponse_QNAME, GetVendorTypeByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VendorRegisterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://business/", name = "vendorRegisterResponse")
    public JAXBElement<VendorRegisterResponse> createVendorRegisterResponse(VendorRegisterResponse value) {
        return new JAXBElement<VendorRegisterResponse>(_VendorRegisterResponse_QNAME, VendorRegisterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItemByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://business/", name = "getItemByIdResponse")
    public JAXBElement<GetItemByIdResponse> createGetItemByIdResponse(GetItemByIdResponse value) {
        return new JAXBElement<GetItemByIdResponse>(_GetItemByIdResponse_QNAME, GetItemByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateStockResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://business/", name = "updateStockResponse")
    public JAXBElement<UpdateStockResponse> createUpdateStockResponse(UpdateStockResponse value) {
        return new JAXBElement<UpdateStockResponse>(_UpdateStockResponse_QNAME, UpdateStockResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCategoryById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://business/", name = "getCategoryById")
    public JAXBElement<GetCategoryById> createGetCategoryById(GetCategoryById value) {
        return new JAXBElement<GetCategoryById>(_GetCategoryById_QNAME, GetCategoryById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVendorByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://business/", name = "getVendorByIdResponse")
    public JAXBElement<GetVendorByIdResponse> createGetVendorByIdResponse(GetVendorByIdResponse value) {
        return new JAXBElement<GetVendorByIdResponse>(_GetVendorByIdResponse_QNAME, GetVendorByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckLoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://business/", name = "checkLoginResponse")
    public JAXBElement<CheckLoginResponse> createCheckLoginResponse(CheckLoginResponse value) {
        return new JAXBElement<CheckLoginResponse>(_CheckLoginResponse_QNAME, CheckLoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrders }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://business/", name = "getOrders")
    public JAXBElement<GetOrders> createGetOrders(GetOrders value) {
        return new JAXBElement<GetOrders>(_GetOrders_QNAME, GetOrders.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://business/", name = "getUsers")
    public JAXBElement<GetUsers> createGetUsers(GetUsers value) {
        return new JAXBElement<GetUsers>(_GetUsers_QNAME, GetUsers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://business/", name = "createCategory")
    public JAXBElement<CreateCategory> createCreateCategory(CreateCategory value) {
        return new JAXBElement<CreateCategory>(_CreateCategory_QNAME, CreateCategory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItemsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://business/", name = "getItemsResponse")
    public JAXBElement<GetItemsResponse> createGetItemsResponse(GetItemsResponse value) {
        return new JAXBElement<GetItemsResponse>(_GetItemsResponse_QNAME, GetItemsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditItemResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://business/", name = "editItemResponse")
    public JAXBElement<EditItemResponse> createEditItemResponse(EditItemResponse value) {
        return new JAXBElement<EditItemResponse>(_EditItemResponse_QNAME, EditItemResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVendors }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://business/", name = "getVendors")
    public JAXBElement<GetVendors> createGetVendors(GetVendors value) {
        return new JAXBElement<GetVendors>(_GetVendors_QNAME, GetVendors.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateItemResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://business/", name = "createItemResponse")
    public JAXBElement<CreateItemResponse> createCreateItemResponse(CreateItemResponse value) {
        return new JAXBElement<CreateItemResponse>(_CreateItemResponse_QNAME, CreateItemResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrdersByVendorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://business/", name = "getOrdersByVendorResponse")
    public JAXBElement<GetOrdersByVendorResponse> createGetOrdersByVendorResponse(GetOrdersByVendorResponse value) {
        return new JAXBElement<GetOrdersByVendorResponse>(_GetOrdersByVendorResponse_QNAME, GetOrdersByVendorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditCategoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://business/", name = "editCategoryResponse")
    public JAXBElement<EditCategoryResponse> createEditCategoryResponse(EditCategoryResponse value) {
        return new JAXBElement<EditCategoryResponse>(_EditCategoryResponse_QNAME, EditCategoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCategoryByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://business/", name = "getCategoryByIdResponse")
    public JAXBElement<GetCategoryByIdResponse> createGetCategoryByIdResponse(GetCategoryByIdResponse value) {
        return new JAXBElement<GetCategoryByIdResponse>(_GetCategoryByIdResponse_QNAME, GetCategoryByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchOrCheckStockCakeByItemNameOrCodeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://business/", name = "searchOrCheckStockCakeByItemNameOrCodeResponse")
    public JAXBElement<SearchOrCheckStockCakeByItemNameOrCodeResponse> createSearchOrCheckStockCakeByItemNameOrCodeResponse(SearchOrCheckStockCakeByItemNameOrCodeResponse value) {
        return new JAXBElement<SearchOrCheckStockCakeByItemNameOrCodeResponse>(_SearchOrCheckStockCakeByItemNameOrCodeResponse_QNAME, SearchOrCheckStockCakeByItemNameOrCodeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCategoriesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://business/", name = "getCategoriesResponse")
    public JAXBElement<GetCategoriesResponse> createGetCategoriesResponse(GetCategoriesResponse value) {
        return new JAXBElement<GetCategoriesResponse>(_GetCategoriesResponse_QNAME, GetCategoriesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCategoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://business/", name = "createCategoryResponse")
    public JAXBElement<CreateCategoryResponse> createCreateCategoryResponse(CreateCategoryResponse value) {
        return new JAXBElement<CreateCategoryResponse>(_CreateCategoryResponse_QNAME, CreateCategoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrderByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://business/", name = "getOrderByIdResponse")
    public JAXBElement<GetOrderByIdResponse> createGetOrderByIdResponse(GetOrderByIdResponse value) {
        return new JAXBElement<GetOrderByIdResponse>(_GetOrderByIdResponse_QNAME, GetOrderByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://business/", name = "editItem")
    public JAXBElement<EditItem> createEditItem(EditItem value) {
        return new JAXBElement<EditItem>(_EditItem_QNAME, EditItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://business/", name = "editCategory")
    public JAXBElement<EditCategory> createEditCategory(EditCategory value) {
        return new JAXBElement<EditCategory>(_EditCategory_QNAME, EditCategory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckLogin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://business/", name = "checkLogin")
    public JAXBElement<CheckLogin> createCheckLogin(CheckLogin value) {
        return new JAXBElement<CheckLogin>(_CheckLogin_QNAME, CheckLogin.class, null, value);
    }

}
