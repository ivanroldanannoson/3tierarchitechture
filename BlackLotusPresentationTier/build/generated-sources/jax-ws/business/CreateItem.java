
package business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import data.Item;


/**
 * <p>Java class for createItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="itemData" type="{http://data/}item" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createItem", propOrder = {
    "itemData"
})
public class CreateItem {

    protected Item itemData;

    /**
     * Gets the value of the itemData property.
     * 
     * @return
     *     possible object is
     *     {@link Item }
     *     
     */
    public Item getItemData() {
        return itemData;
    }

    /**
     * Sets the value of the itemData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Item }
     *     
     */
    public void setItemData(Item value) {
        this.itemData = value;
    }

}
