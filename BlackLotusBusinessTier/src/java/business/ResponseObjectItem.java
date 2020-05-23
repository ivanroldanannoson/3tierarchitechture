/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import data.Item;
import java.util.List;

/**
 *
 * @author ivanroldan
 */
public class ResponseObjectItem {

    int code;
    String status;
    String message;
    List<Item> item;

    public ResponseObjectItem() {
    }

    public ResponseObjectItem(int code, String status, String message, List<Item> item) {
        this.code = code;
        this.status = status;
        this.message = message;
        this.item = item;
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

    public List<Item> getItem() {
        return item;
    }

    public void setItem(List<Item> item) {
        this.item = item;
    }

}
