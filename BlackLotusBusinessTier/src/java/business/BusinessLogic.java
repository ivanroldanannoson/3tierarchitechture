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
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author ivanroldan
 */
public class BusinessLogic {

    public ResponseObject checkLogin(Login login) {
        ResponseObject response;
        DataTier_Service dataTier_Service = new DataTier_Service();
        DataTier dataTier = dataTier_Service.getDataTierPort();

        if (dataTier.checkLogin(login) != null) {
            response = new ResponseObject(200, "SUCCESS", "Login success", dataTier.checkLogin(login));
        } else {
            response = new ResponseObject(500, "FAIL", "Invalid username or password", null);
        }
        return response;
    }

    public ResponseObject userRegister(Register register) {
        ResponseObject response;
        DataTier_Service dataTier_Service = new DataTier_Service();
        DataTier dataTier = dataTier_Service.getDataTierPort();

        if (dataTier.checkUserExistByEmail(register.getEmail())) {
            response = new ResponseObject(500, "FAIL", "Email already exists", null);
        } else {
            int success = dataTier.userRegister(register);
            if (success < 0) {
                response = new ResponseObject(500, "FAIL", "Something went wrong", null);
            } else {
                response = new ResponseObject(200, "SUCCESS", "User registered", register.getEmail());
            }
        }
        return response;
    }

    public ResponseObject vendorLogin(Login login) {
        ResponseObject response;
        DataTier_Service dataTier_Service = new DataTier_Service();
        DataTier dataTier = dataTier_Service.getDataTierPort();

        if (dataTier.vendorLogin(login) != null) {
            response = new ResponseObject(200, "SUCCESS", "Login success", dataTier.vendorLogin(login));
        } else {
            response = new ResponseObject(500, "FAIL", "Invalid username or password", null);
        }
        return response;
    }

    public ResponseObject vendorRegister(Vendor vendor) {
        ResponseObject response;
        DataTier_Service dataTier_Service = new DataTier_Service();
        DataTier dataTier = dataTier_Service.getDataTierPort();

        if (dataTier.checkVendorExistByEmail(vendor.getEmail())) {
            response = new ResponseObject(500, "FAIL", "Email already exists", null);
        } else {
            int success = dataTier.vendorRegister(vendor);
            if (success < 0) {
                response = new ResponseObject(500, "FAIL", "Something went wrong", null);
            } else {
                response = new ResponseObject(200, "SUCCESS", "Vendor registered", vendor.getEmail());
            }
        }
        return response;
    }

    public ResponseObject createCategory(Category category) {
        ResponseObject response;
        DataTier_Service dataTier_Service = new DataTier_Service();
        DataTier dataTier = dataTier_Service.getDataTierPort();

        if (!dataTier.checkCategoryExistByName(category.getName())) {
            if (dataTier.createCategory(category) > 0) {
                response = new ResponseObject(200, "SUCCESS", "Category created", null);
            } else {
                response = new ResponseObject(500, "SUCCESS", "Something wrong", null);
            }
        } else {
            response = new ResponseObject(500, "FAIL", "Category name already exist", null);
        }
        return response;
    }

    public ResponseObject editCategory(Category category) {
        ResponseObject response;
        DataTier_Service dataTier_Service = new DataTier_Service();
        DataTier dataTier = dataTier_Service.getDataTierPort();

        if (dataTier.editCategoryById(category) > 0) {
            response = new ResponseObject(200, "SUCCESS", "Category edited", null);
        } else {
            response = new ResponseObject(500, "SUCCESS", "Something wrong", null);
        }
        return response;
    }

    public ResponseObject createItem(Item item) {
        ResponseObject response;
        DataTier_Service dataTier_Service = new DataTier_Service();
        DataTier dataTier = dataTier_Service.getDataTierPort();

        if (dataTier.createItem(item) > 0) {
            response = new ResponseObject(200, "SUCCESS", "Item created", null);
        } else {
            response = new ResponseObject(500, "SUCCESS", "Something wrong", null);
        }

        return response;
    }

    public ResponseObject editItem(Item item) {
        ResponseObject response;
        DataTier_Service dataTier_Service = new DataTier_Service();
        DataTier dataTier = dataTier_Service.getDataTierPort();

        if (dataTier.editItemById(item) > 0) {
            response = new ResponseObject(200, "SUCCESS", "Item edited", null);
        } else {
            response = new ResponseObject(500, "SUCCESS", "Something wrong", null);
        }
        return response;
    }

    public ResponseObjectCategory getCategories() {
        ResponseObjectCategory response;
        DataTier_Service dataTier_Service = new DataTier_Service();
        DataTier dataTier = dataTier_Service.getDataTierPort();

        if (dataTier.getCategories().size() > 0) {
            response = new ResponseObjectCategory(200, "SUCCESS", "Category list", dataTier.getCategories());
        } else {
            response = new ResponseObjectCategory(500, "SUCCESS", "No category found", null);
        }
        return response;
    }

    public ResponseObjectItem getItems() {
        ResponseObjectItem response;
        DataTier_Service dataTier_Service = new DataTier_Service();
        DataTier dataTier = dataTier_Service.getDataTierPort();

        if (dataTier.getItems().size() > 0) {
            response = new ResponseObjectItem(200, "SUCCESS", "Category list", dataTier.getItems());
        } else {
            response = new ResponseObjectItem(500, "SUCCESS", "No items found", null);
        }
        return response;
    }

    public ResponseObject getCategoryById(int id) {
        ResponseObject response;
        DataTier_Service dataTier_Service = new DataTier_Service();
        DataTier dataTier = dataTier_Service.getDataTierPort();

        response = new ResponseObject(200, "SUCCESS", "Category list", dataTier.getCategoryById(id));

        return response;
    }

    public ResponseObject getItemById(int id) {
        ResponseObject response;
        DataTier_Service dataTier_Service = new DataTier_Service();
        DataTier dataTier = dataTier_Service.getDataTierPort();

        response = new ResponseObject(200, "SUCCESS", "Category list", dataTier.getItemById(id));

        return response;
    }

    public ResponseObject insertOrder(int vendorId, ArrayList<Item> items) {
        ResponseObject response;
        DataTier_Service dataTier_Service = new DataTier_Service();
        DataTier dataTier = dataTier_Service.getDataTierPort();

        Order order = new Order();
        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        order.setOrderDate(ft.format(dNow));
        order.setVendorId(vendorId);
        order.setOrderItem(items);

        int orderId = dataTier.insertOrder(order);

        for (Item item : order.getOrderItem()) {
            dataTier.insertOrderItem(item, orderId);
            int currentStock = dataTier.getCurrentStockByItemId(item.getId());
            dataTier.updateStockByItemId(item.getId(), currentStock - item.getQty());
        }
        response = new ResponseObject(200, "SUCCESS", "Order created", orderId);

        return response;
    }

    public Order getOrderById(int orderId) {
        ResponseObject response;
        DataTier_Service dataTier_Service = new DataTier_Service();
        DataTier dataTier = dataTier_Service.getDataTierPort();

        response = new ResponseObject(200, "SUCCESS", "Category list", dataTier.getOrdersByInvoiceId(orderId));

        return dataTier.getOrdersByInvoiceId(orderId);
    }

    public ResponseObject updateStock(ArrayList<Item> items) {
        ResponseObject response;
        DataTier_Service dataTier_Service = new DataTier_Service();
        DataTier dataTier = dataTier_Service.getDataTierPort();

        for (Item item : items) {
            int currentStock = dataTier.getCurrentStockByItemId(item.getId());
            dataTier.updateStockByItemId(item.getId(), currentStock + item.getQty());
        }
        response = new ResponseObject(200, "SUCCESS", "Update stock", null);

        return response;
    }

    public ResponseObjectItem searchOrCheckStockCakeByItemNameOrCode(String searchText) {
        ResponseObjectItem response;
        DataTier_Service dataTier_Service = new DataTier_Service();
        DataTier dataTier = dataTier_Service.getDataTierPort();

        if (dataTier.getItems().size() > 0) {
            response = new ResponseObjectItem(200, "SUCCESS", "Search items",
                    dataTier.searchOrCheckStockCakeByItemNameOrCode(searchText));
        } else {
            response = new ResponseObjectItem(500, "SUCCESS", "No items found", null);
        }
        return response;
    }

    public ResponseObject forgotPasswordVendor(String email) {
        ResponseObject response;
        DataTier_Service dataTier_Service = new DataTier_Service();
        DataTier dataTier = dataTier_Service.getDataTierPort();

        if (dataTier.checkVendorExistByEmail(email)) {
            String password = genrateRandomPassword(8);
            if (dataTier.updatePasswordByEmail(email, password)) {
                response = new ResponseObject(200, "SUCCESS", "Password changed and emailed " + emailChangedPassword(email, password), password);
            } else {
                response = new ResponseObject(500, "FAIL", "Unable to update password", null);
            }
        } else {
            response = new ResponseObject(500, "FAIL", "Email not found", null);

        }

        return response;
    }

    private static final String ALPHA_NUMERIC_STRING = 
            "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz";

    public static String genrateRandomPassword(int count) {
        StringBuilder builder = new StringBuilder();
        while (count-- != 0) {
            int character = (int) (Math.random() * ALPHA_NUMERIC_STRING.length());
            builder.append(ALPHA_NUMERIC_STRING.charAt(character));
        }
        return builder.toString();
    }

    public String emailChangedPassword(String email, String newPassword) {
        try {
            final String sendingEmail = "blacklotusicbt@gmail.com";
            final String sendingPassword = "black_lotus_icbt";
            Properties props = new Properties();
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.put("mail.smtp.socketFactory.port", "465");
            props.put("mail.smtp.socketFactory.class",
                    "javax.net.ssl.SSLSocketFactory");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.port", "465");

            Session session = Session.getDefaultInstance(props,
                    new javax.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(sendingEmail, sendingPassword);
                }
            });
            MimeMessage message = new MimeMessage(session);
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(email));
            message.setSubject("Changed password - BLACK LOTUS");
            message.setText("Your changed password is : " + newPassword);
            Transport.send(message);
            return "";
        } catch (Exception ex) {
            return ex.getMessage();
        }
    }

}
