
package business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import data.Register;


/**
 * <p>Java class for userRegister complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="userRegister">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="register" type="{http://data/}register" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userRegister", propOrder = {
    "register"
})
public class UserRegister {

    protected Register register;

    /**
     * Gets the value of the register property.
     * 
     * @return
     *     possible object is
     *     {@link Register }
     *     
     */
    public Register getRegister() {
        return register;
    }

    /**
     * Sets the value of the register property.
     * 
     * @param value
     *     allowed object is
     *     {@link Register }
     *     
     */
    public void setRegister(Register value) {
        this.register = value;
    }

}
