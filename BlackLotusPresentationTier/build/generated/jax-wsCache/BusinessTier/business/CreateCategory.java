
package business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import data.Category;


/**
 * <p>Java class for createCategory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createCategory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="categoryData" type="{http://data/}category" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createCategory", propOrder = {
    "categoryData"
})
public class CreateCategory {

    protected Category categoryData;

    /**
     * Gets the value of the categoryData property.
     * 
     * @return
     *     possible object is
     *     {@link Category }
     *     
     */
    public Category getCategoryData() {
        return categoryData;
    }

    /**
     * Sets the value of the categoryData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Category }
     *     
     */
    public void setCategoryData(Category value) {
        this.categoryData = value;
    }

}
