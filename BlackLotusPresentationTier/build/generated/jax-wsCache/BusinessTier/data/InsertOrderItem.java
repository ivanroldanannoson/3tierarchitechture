
package data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for insertOrderItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="insertOrderItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="orderItem" type="{http://data/}item" minOccurs="0"/>
 *         &lt;element name="orderId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insertOrderItem", propOrder = {
    "orderItem",
    "orderId"
})
public class InsertOrderItem {

    protected Item orderItem;
    protected int orderId;

    /**
     * Gets the value of the orderItem property.
     * 
     * @return
     *     possible object is
     *     {@link Item }
     *     
     */
    public Item getOrderItem() {
        return orderItem;
    }

    /**
     * Sets the value of the orderItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Item }
     *     
     */
    public void setOrderItem(Item value) {
        this.orderItem = value;
    }

    /**
     * Gets the value of the orderId property.
     * 
     */
    public int getOrderId() {
        return orderId;
    }

    /**
     * Sets the value of the orderId property.
     * 
     */
    public void setOrderId(int value) {
        this.orderId = value;
    }

}
