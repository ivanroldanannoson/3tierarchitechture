
package data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for checkLogin complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="checkLogin">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="loginData" type="{http://data/}login" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkLogin", propOrder = {
    "loginData"
})
public class CheckLogin {

    protected Login loginData;

    /**
     * Gets the value of the loginData property.
     * 
     * @return
     *     possible object is
     *     {@link Login }
     *     
     */
    public Login getLoginData() {
        return loginData;
    }

    /**
     * Sets the value of the loginData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Login }
     *     
     */
    public void setLoginData(Login value) {
        this.loginData = value;
    }

}
