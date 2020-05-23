/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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
public class DBUtil {

    public Register login(Login bean) {
        Register user = null;
        try {
            Connection connection = DBConnection.getInstance().getConnection();
            PreparedStatement ps = connection.prepareStatement(
                    "select * from user where email=? and password=?");

            ps.setString(1, bean.getEmail());
            ps.setString(2, new Helper().MD5(bean.getPassword()));

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                user = new Register(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        "",
                        rs.getInt("user_role"));
            }
            connection.close();
        } catch (SQLException e) {
            System.out.print(e.getMessage());
        }

        return user;
    }

    public int getUserRoleByEmail(String email) {
        int userRole = -1;
        try {
            Connection connection = DBConnection.getInstance().getConnection();
            PreparedStatement ps = connection.prepareStatement(
                    "select user_role from user where email=?");
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();
            rs.next();
            userRole = (Integer) rs.getObject("user_role");
            connection.close();

        } catch (SQLException e) {
            System.out.print(e.getMessage());
        }
        return userRole;
    }

    public int getVendorTypeByEmail(String email) {
        int vendorType = -1;
        try {
            Connection connection = DBConnection.getInstance().getConnection();
            PreparedStatement ps = connection.prepareStatement(
                    "select vendor_type from vendor where email=?");
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();
            rs.next();
            vendorType = (Integer) rs.getObject("vendor_type");
            connection.close();
        } catch (SQLException e) {
            System.out.print(e.getMessage());
        }
        return vendorType;
    }

    public boolean checkUserExistByEmail(String email) {
        boolean status = false;
        try {
            Connection connection = DBConnection.getInstance().getConnection();
            PreparedStatement ps = connection.prepareStatement(
                    "select * from user where email=?");

            ps.setString(1, email);

            ResultSet rs = ps.executeQuery();
            status = rs.next();
            connection.close();

        } catch (SQLException e) {
            System.out.print(e.getMessage());
        }

        return status;
    }

    public boolean updatePasswordByEmail(String email, String password) {
        boolean status = false;
        try {
            Connection connection = DBConnection.getInstance().getConnection();
            PreparedStatement ps = connection.prepareStatement(
                    "update vendor set password = ? where email= ? ");

            ps.setString(1, new Helper().MD5(password));
            ps.setString(2, email);

            if (ps.executeUpdate() > 0) {
                status = true;
            } else {
                status = false;
            }
            connection.close();

        } catch (SQLException e) {
            System.out.print(e.getMessage());
        }

        return status;
    }

    public int userRegister(Register register) {
        int status = 0;
        try {
            Connection connection = DBConnection.getInstance().getConnection();
            PreparedStatement ps = connection.prepareStatement(
                    "INSERT INTO USER (name,email,password,user_role) VALUES (?,?,?,?)");

            ps.setString(1, register.getName());
            ps.setString(2, register.getEmail());
            ps.setString(3, new Helper().MD5(register.getPassword()));
            ps.setInt(4, register.getUserRole());

            status = ps.executeUpdate();
            connection.close();

        } catch (SQLException e) {
            System.out.print(e.getMessage());
        }

        return status;
    }

    public int deleteUserByEmail(String email) {
        int status = 0;
        try {
            Connection connection = DBConnection.getInstance().getConnection();
            PreparedStatement ps = connection.prepareStatement(
                    "DELETE FROM user where email = ?");

            ps.setString(1, email);

            status = ps.executeUpdate();
            connection.close();

        } catch (SQLException e) {
            System.out.print(e.getMessage());
        }

        return status;
    }

    public int vendorRegister(Vendor vendor) {
        int status = 0;
        try {
            Connection connection = DBConnection.getInstance().getConnection();
            PreparedStatement ps = connection.prepareStatement(
                    "INSERT INTO VENDOR (name,address,contact,email,password,vendor_type,added_by) VALUES (?,?,?,?,?,?,?)");

            ps.setString(1, vendor.getName());
            ps.setString(2, vendor.getAddress());
            ps.setString(3, vendor.getContact());
            ps.setString(4, vendor.getEmail());
            ps.setString(5, new Helper().MD5(vendor.getPassword()));
            ps.setInt(6, vendor.getVendorType());
            ps.setInt(7, vendor.getAddedBy());

            status = ps.executeUpdate();
            connection.close();

        } catch (SQLException e) {
            System.out.print(e.getMessage());
        }

        return status;
    }

    public boolean checkVendorExistByEmail(String username) {
        boolean status = false;
        try {
            Connection connection = DBConnection.getInstance().getConnection();
            PreparedStatement ps = connection.prepareStatement(
                    "select * from vendor where email=?");

            ps.setString(1, username);

            ResultSet rs = ps.executeQuery();
            status = rs.next();
            connection.close();

        } catch (SQLException e) {
            System.out.print(e.getMessage());
        }

        return status;
    }

    public Vendor vendorLogin(Login bean) {
        Vendor vendor = null;
        try {
            Connection connection = DBConnection.getInstance().getConnection();
            PreparedStatement ps = connection.prepareStatement(
                    "select * from vendor where email=? and password=?");

            ps.setString(1, bean.getEmail());
            ps.setString(2, new Helper().MD5(bean.getPassword()));

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                vendor = new Vendor(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("address"),
                        rs.getString("contact"),
                        rs.getString("email"),
                        "",
                        rs.getInt("vendor_type"),
                        rs.getInt("added_by"));
            }
            connection.close();

        } catch (SQLException e) {
            System.out.print(e.getMessage());
        }

        return vendor;
    }

    public int deleteVendorByEmail(String email) {
        int status = 0;
        try {
            Connection connection = DBConnection.getInstance().getConnection();
            PreparedStatement ps = connection.prepareStatement(
                    "DELETE FROM vendor where email = ?");

            ps.setString(1, email);

            status = ps.executeUpdate();
            connection.close();

        } catch (SQLException e) {
            System.out.print(e.getMessage());
        }

        return status;
    }

    public int createCategory(Category category) {
        int status = 0;
        try {
            Connection connection = DBConnection.getInstance().getConnection();
            PreparedStatement ps = connection.prepareStatement(
                    "INSERT INTO category (name,description,added_by) VALUES (?,?,?)");

            ps.setString(1, category.getName());
            ps.setString(2, category.getDescription());
            ps.setInt(3, category.getAddedBy());

            status = ps.executeUpdate();
            connection.close();

        } catch (SQLException e) {
            System.out.print(e.getMessage());
        }

        return status;
    }

    public boolean checkCategoryExistByName(String name) {
        boolean status = false;
        try {
            Connection connection = DBConnection.getInstance().getConnection();
            PreparedStatement ps = connection.prepareStatement(
                    "SELECT name from category where UPPER(name) = ?");

            ps.setString(1, name);

            ResultSet rs = ps.executeQuery();
            status = rs.next();
            connection.close();
        } catch (SQLException e) {
            System.out.print(e.getMessage());
        }

        return status;
    }

    public int editCategoryById(Category category) {
        int status = 0;
        try {
            Connection connection = DBConnection.getInstance().getConnection();
            PreparedStatement ps = connection.prepareStatement(
                    "UPDATE category SET name = ?, description = ? WHERE id = ?");

            ps.setString(1, category.getName());
            ps.setString(2, category.getDescription());
            ps.setInt(3, category.getId());

            status = ps.executeUpdate();
            connection.close();

        } catch (SQLException e) {
            System.out.print(e.getMessage());
        }

        return status;
    }

    public int createItem(Item item) {
        int status = 0;
        try {
            Connection connection = DBConnection.getInstance().getConnection();
            PreparedStatement ps = connection.prepareStatement(
                    "INSERT INTO item (name,price,qty,category_id,added_by) VALUES (?,?,?,?,?)");

            ps.setString(1, item.getName());
            ps.setFloat(2, item.getPrice());
            ps.setInt(3, item.getQty());
            ps.setInt(4, item.getCategoryType());
            ps.setInt(5, item.getAddedBy());

            status = ps.executeUpdate();
            connection.close();

        } catch (SQLException e) {
            System.out.print(e.getMessage());
        }

        return status;
    }

    public int editItemById(Item item) {
        int status = 0;
        try {
            Connection connection = DBConnection.getInstance().getConnection();
            PreparedStatement ps = connection.prepareStatement(
                    "UPDATE item SET name = ?, price = ?, qty = ? WHERE id = ?");

            ps.setString(1, item.getName());
            ps.setFloat(2, item.getPrice());
            ps.setInt(3, item.getQty());
            ps.setInt(4, item.getId());

            status = ps.executeUpdate();
            connection.close();

        } catch (SQLException e) {
            System.out.print(e.getMessage());
        }

        return status;
    }

    public Item getItemById(int id) {
        Item item = null;
        try {
            Connection connection = DBConnection.getInstance().getConnection();
            PreparedStatement ps = connection.prepareStatement(
                    "SELECT * FROM item where id= ?");

            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                item = new Item(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getFloat("price"),
                        rs.getInt("qty"),
                        rs.getInt("category_id"),
                        rs.getInt("added_by"));
            }
            connection.close();
        } catch (SQLException e) {
            System.out.print("ITEM_ERROR " + e.getMessage());
        }

        return item;
    }

    public int insertOrder(Order order) {
        int status = -1;
        try {
            Connection connection = DBConnection.getInstance().getConnection();
            PreparedStatement ps = connection.prepareStatement(
                    "INSERT INTO `order` (vendor_id,order_date) VALUES (?,?)", Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, order.getVendorId());
            ps.setString(2, order.getOrderDate());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                status = rs.getInt(1);
            }
            connection.close();
        } catch (SQLException e) {
            System.out.print("INSERT_QUERY " + e.getMessage());
        }

        return status;
    }

    public int insertOrderItem(Item item, int order_id) {
        int status = 0;
        try {
            Connection connection = DBConnection.getInstance().getConnection();
            PreparedStatement ps = connection.prepareStatement(
                    "INSERT INTO order_item (item_id,qty,price,order_id) VALUES (?,?,?,?)");

            ps.setInt(1, item.getId());
            ps.setInt(2, item.getQty());
            ps.setFloat(3, item.getPrice());
            ps.setInt(4, order_id);

            status = ps.executeUpdate();
            connection.close();

        } catch (SQLException e) {
            System.out.print(e.getMessage());
        }

        return status;
    }

    public int getCurrentStockByItemId(int itemId) {
        int stock = 0;
        try {
            Connection connection = DBConnection.getInstance().getConnection();
            PreparedStatement ps = connection.prepareStatement(
                    "SELECT qty FROM item WHERE id = ?");

            ps.setInt(1, itemId);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                stock = rs.getInt("qty");
            }
            connection.close();

        } catch (SQLException e) {
            System.out.print(e.getMessage());
        }

        return stock;
    }

    public int updateStockByItemId(int itemId, int quantity) {
        int status = 0;
        try {
            Connection connection = DBConnection.getInstance().getConnection();
            PreparedStatement ps = connection.prepareStatement(
                    "UPDATE item SET qty = ? WHERE id = ?");

            ps.setInt(2, itemId);
            ps.setInt(1, quantity);

            status = ps.executeUpdate();
            connection.close();

        } catch (SQLException e) {
            System.out.print(e.getMessage());
        }

        return status;
    }

    public ArrayList<Item> searchOrCheckStockCakeByItemNameOrCode(String searchtext) {
        ArrayList<Item> items = new ArrayList<>();
        try {
            Connection connection = DBConnection.getInstance().getConnection();
            PreparedStatement ps = connection.prepareStatement(
                    "SELECT * FROM item WHERE name LIKE ? ");
            ps.setString(1, "%" + searchtext + "%");

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                items.add(new Item(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getFloat("price"),
                        rs.getInt("qty"),
                        rs.getInt("category_id"),
                        rs.getInt("added_by")));
            }
            connection.close();

        } catch (SQLException e) {
            System.out.print(e.getMessage());
        }

        return items;
    }

    public ArrayList<Item> getItems() {
        ArrayList<Item> items = new ArrayList<>();
        try {
            Connection connection = DBConnection.getInstance().getConnection();
            PreparedStatement ps = connection.prepareStatement(
                    "SELECT * FROM item");

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                items.add(new Item(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getFloat("price"),
                        rs.getInt("qty"),
                        rs.getInt("category_id"),
                        rs.getInt("added_by")));
            }
            connection.close();

        } catch (SQLException e) {
            System.out.print(e.getMessage());
        }

        return items;
    }

    public ArrayList<Category> getCategories() {
        ArrayList<Category> categories = new ArrayList<>();
        try {
            Connection connection = DBConnection.getInstance().getConnection();
            PreparedStatement ps = connection.prepareStatement(
                    "SELECT * FROM category");

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                categories.add(new Category(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("description"),
                        rs.getInt("added_by")));
            }
            connection.close();

        } catch (SQLException e) {
            System.out.print(e.getMessage());
        }

        return categories;
    }

    public ArrayList<Item> getItemsByCategory(int categoryId) {
        ArrayList<Item> items = new ArrayList<>();
        try {
            Connection connection = DBConnection.getInstance().getConnection();
            PreparedStatement ps = connection.prepareStatement(
                    "SELECT * FROM item WHERE category_id = ?");
            ps.setInt(1, categoryId);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                items.add(new Item(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getFloat("price"),
                        rs.getInt("qty"),
                        rs.getInt("category_id"),
                        rs.getInt("added_by")));
            }
            connection.close();

        } catch (SQLException e) {
            System.out.print(e.getMessage());
        }

        return items;
    }

    public ArrayList<Order> getOrders() {
        ArrayList<Order> orders = new ArrayList<>();
        try {
            Connection connection = DBConnection.getInstance().getConnection();
            PreparedStatement ps = connection.prepareStatement(
                    "SELECT * FROM `order`");

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                int vendorId = rs.getInt("vendor_id");
                String orderDate = rs.getString("order_date");

                PreparedStatement psOrderItem = connection.prepareStatement(
                        "SELECT * FROM order_item where order_id = ?");
                psOrderItem.setInt(1, id);

                ResultSet rsOrderItem = psOrderItem.executeQuery();
                ArrayList<Item> orderItems = new ArrayList<>();
                while (rsOrderItem.next()) {
                    orderItems.add(new Item(
                            rsOrderItem.getInt("item_id"),
                            getItemById(rsOrderItem.getInt("item_id")).getName(),
                            rsOrderItem.getFloat("price"),
                            rsOrderItem.getInt("qty"),
                            getItemById(rsOrderItem.getInt("item_id")).getCategoryType(),
                            0));
                }
                orders.add(new Order(id, vendorId, orderDate, orderItems));
            }
            connection.close();

        } catch (SQLException e) {
            System.out.print(e.getMessage());
        }

        return orders;
    }

    public ArrayList<Order> getOrdersByVendorId(int searchVendorId) {
        ArrayList<Order> orders = new ArrayList<>();
        try {
            Connection connection = DBConnection.getInstance().getConnection();
            PreparedStatement ps = connection.prepareStatement(
                    "SELECT * FROM `order` WHERE vendor_id = ?");
            ps.setInt(1, searchVendorId);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                int vendorId = rs.getInt("vendor_id");
                String orderDate = rs.getString("order_date");

                PreparedStatement psOrderItem = connection.prepareStatement(
                        "SELECT * FROM order_item where order_id = ?");
                psOrderItem.setInt(1, id);

                ResultSet rsOrderItem = psOrderItem.executeQuery();
                ArrayList<Item> orderItems = new ArrayList<>();
                while (rsOrderItem.next()) {
                    orderItems.add(new Item(
                            rsOrderItem.getInt("item_id"),
                            getItemById(rsOrderItem.getInt("item_id")).getName(),
                            rsOrderItem.getFloat("price"),
                            rsOrderItem.getInt("qty"),
                            getItemById(rsOrderItem.getInt("item_id")).getCategoryType(),
                            0));
                }
                orders.add(new Order(id, vendorId, orderDate, orderItems));
            }
            connection.close();

        } catch (SQLException e) {
            System.out.print(e.getMessage());
        }

        return orders;
    }

    public Order getOrdersByInvoiceId(int invoiceId) {
        Order orders = null;
        ArrayList<Item> orderItems = new ArrayList<>();
        try {
            Connection connection = DBConnection.getInstance().getConnection();
            PreparedStatement ps = connection.prepareStatement(
                    "SELECT * FROM `order` WHERE id = ?");
            ps.setInt(1, invoiceId);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                int vendorId = rs.getInt("vendor_id");
                String orderDate = rs.getString("order_date");

                PreparedStatement psOrderItem = connection.prepareStatement(
                        "SELECT * FROM order_item where order_id = ?");
                psOrderItem.setInt(1, id);

                ResultSet rsOrderItem = psOrderItem.executeQuery();
                while (rsOrderItem.next()) {
                    Item item = new Item(
                            rsOrderItem.getInt("item_id"),
                            getItemById(rsOrderItem.getInt("item_id")).getName(),
                            rsOrderItem.getFloat("price"),
                            rsOrderItem.getInt("qty"),
                            getItemById(rsOrderItem.getInt("item_id")).getCategoryType(),
                            0);
                    orderItems.add(item);
                }
                orders = new Order(id, vendorId, orderDate, orderItems);
            }
            connection.close();

        } catch (SQLException e) {
            System.out.print(e.getMessage());
        }

        return orders;
    }

    public ArrayList<Register> getUsers() {
        ArrayList<Register> users = new ArrayList<>();
        try {
            Connection connection = DBConnection.getInstance().getConnection();
            PreparedStatement ps = connection.prepareStatement(
                    "SELECT * FROM user");

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                users.add(new Register(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("password"),
                        rs.getInt("user_role")));
            }
            connection.close();

        } catch (SQLException e) {
            System.out.print(e.getMessage());
        }

        return users;
    }

    public ArrayList<Vendor> getVendors() {
        ArrayList<Vendor> vendors = new ArrayList<>();
        try {
            Connection connection = DBConnection.getInstance().getConnection();
            PreparedStatement ps = connection.prepareStatement(
                    "SELECT * FROM vendor");

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                vendors.add(new Vendor(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("address"),
                        rs.getString("contact"),
                        rs.getString("email"),
                        rs.getString("password"),
                        rs.getInt("vendor_type"),
                        rs.getInt("added_by")));
            }
            connection.close();

        } catch (SQLException e) {
            System.out.print(e.getMessage());
        }

        return vendors;
    }

    public String getVendorTypeById(int id) {
        String vendorType = "";
        try {
            Connection connection = DBConnection.getInstance().getConnection();
            PreparedStatement ps = connection.prepareStatement(
                    "SELECT type FROM vendor_type WHERE id = ?");

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                vendorType = rs.getString("type");
            }
            connection.close();

        } catch (SQLException e) {
            System.out.print(e.getMessage());
        }

        return vendorType;
    }

    public Category getCategoryById(int id) {
        Category category = null;
        try {
            Connection connection = DBConnection.getInstance().getConnection();
            PreparedStatement ps = connection.prepareStatement(
                    "SELECT * FROM category WHERE id = ?");

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                category = new Category(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("description"),
                        rs.getInt("added_by")
                );
            }
            connection.close();

        } catch (SQLException e) {
            System.out.print(e.getMessage());
        }

        return category;
    }

    public Vendor getVendorById(int id) {
        Vendor vendor = null;
        try {
            Connection connection = DBConnection.getInstance().getConnection();
            PreparedStatement ps = connection.prepareStatement(
                    "SELECT * FROM vendor WHERE id = ?");

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                vendor = new Vendor(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("address"),
                        rs.getString("contact"),
                        rs.getString("email"),
                        "",
                        rs.getInt("vendor_type"),
                        rs.getInt("added_by"));
            }
            connection.close();

        } catch (SQLException e) {
            System.out.print(e.getMessage());
        }

        return vendor;
    }

    public int deleteLastRecordFromTableForTest(String tableName) {
        int status = 0;
        try {
            Connection conneciton = DBConnection.getInstance().getConnection();

            Connection connection = DBConnection.getInstance().getConnection();
            PreparedStatement ps = connection.prepareStatement(
                    "delete from `" + tableName + "` order by id desc limit 1");

            status = ps.executeUpdate();
            connection.close();

        } catch (Exception ex) {

        }
        return status;
    }

    public int getLastInsertedIdForTest(String tableName) {
        int status = -1;
        try {

            Connection connection = DBConnection.getInstance().getConnection();
            PreparedStatement ps = connection.prepareStatement(
                    "SELECT id FROM `" + tableName + "` ORDER BY id DESC LIMIT 1");

            //ps.setString(1, tableName);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                status = rs.getInt("id");
            }
            connection.close();

        } catch (Exception ex) {

        }
        return status;

    }
}
