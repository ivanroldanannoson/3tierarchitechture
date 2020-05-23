/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import data.Category;
import java.util.List;

/**
 *
 * @author ivanroldan
 */
public class ResponseObjectCategory {

    int code;
    String status;
    String message;
    List<Category> category;

    

    public ResponseObjectCategory() {
    }

    public ResponseObjectCategory(int code, String status, String message, List<Category> category) {
        this.code = code;
        this.status = status;
        this.message = message;
        this.category = category;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Category> getCategory() {
        return category;
    }

    public void setCategory(List<Category> category) {
        this.category = category;
    }

}
