
package business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import data.Vendor;


/**
 * <p>Java class for vendorRegister complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vendorRegister">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vendorData" type="{http://data/}vendor" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vendorRegister", propOrder = {
    "vendorData"
})
public class VendorRegister {

    protected Vendor vendorData;

    /**
     * Gets the value of the vendorData property.
     * 
     * @return
     *     possible object is
     *     {@link Vendor }
     *     
     */
    public Vendor getVendorData() {
        return vendorData;
    }

    /**
     * Sets the value of the vendorData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vendor }
     *     
     */
    public void setVendorData(Vendor value) {
        this.vendorData = value;
    }

}
