
package business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getVendorTypeById complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getVendorTypeById">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vendorType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getVendorTypeById", propOrder = {
    "vendorType"
})
public class GetVendorTypeById {

    protected int vendorType;

    /**
     * Gets the value of the vendorType property.
     * 
     */
    public int getVendorType() {
        return vendorType;
    }

    /**
     * Sets the value of the vendorType property.
     * 
     */
    public void setVendorType(int value) {
        this.vendorType = value;
    }

}
