
package com.dyngeometry.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="schoolDistrictName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stateAbbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="schoolDistrictID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "key",
    "schoolDistrictName",
    "stateAbbr",
    "schoolDistrictID"
})
@XmlRootElement(name = "GetSchoolDistrict")
public class GetSchoolDistrict {

    protected String key;
    protected String schoolDistrictName;
    protected String stateAbbr;
    protected String schoolDistrictID;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the schoolDistrictName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolDistrictName() {
        return schoolDistrictName;
    }

    /**
     * Sets the value of the schoolDistrictName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolDistrictName(String value) {
        this.schoolDistrictName = value;
    }

    /**
     * Gets the value of the stateAbbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateAbbr() {
        return stateAbbr;
    }

    /**
     * Sets the value of the stateAbbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateAbbr(String value) {
        this.stateAbbr = value;
    }

    /**
     * Gets the value of the schoolDistrictID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolDistrictID() {
        return schoolDistrictID;
    }

    /**
     * Sets the value of the schoolDistrictID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolDistrictID(String value) {
        this.schoolDistrictID = value;
    }

}
