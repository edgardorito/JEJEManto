
package com.dyngeometry.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SchoolDistrict complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SchoolDistrict">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="schoolDistrictUnifiedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="schoolDistrictUnifiedID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="schoolDistrictSecondaryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="schoolDistrictSecondaryID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="schoolDistrictElementaryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="schoolDistrictElementaryID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SchoolDistrict", propOrder = {
    "schoolDistrictUnifiedName",
    "schoolDistrictUnifiedID",
    "schoolDistrictSecondaryName",
    "schoolDistrictSecondaryID",
    "schoolDistrictElementaryName",
    "schoolDistrictElementaryID"
})
public class SchoolDistrict {

    protected String schoolDistrictUnifiedName;
    protected String schoolDistrictUnifiedID;
    protected String schoolDistrictSecondaryName;
    protected String schoolDistrictSecondaryID;
    protected String schoolDistrictElementaryName;
    protected String schoolDistrictElementaryID;

    /**
     * Gets the value of the schoolDistrictUnifiedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolDistrictUnifiedName() {
        return schoolDistrictUnifiedName;
    }

    /**
     * Sets the value of the schoolDistrictUnifiedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolDistrictUnifiedName(String value) {
        this.schoolDistrictUnifiedName = value;
    }

    /**
     * Gets the value of the schoolDistrictUnifiedID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolDistrictUnifiedID() {
        return schoolDistrictUnifiedID;
    }

    /**
     * Sets the value of the schoolDistrictUnifiedID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolDistrictUnifiedID(String value) {
        this.schoolDistrictUnifiedID = value;
    }

    /**
     * Gets the value of the schoolDistrictSecondaryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolDistrictSecondaryName() {
        return schoolDistrictSecondaryName;
    }

    /**
     * Sets the value of the schoolDistrictSecondaryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolDistrictSecondaryName(String value) {
        this.schoolDistrictSecondaryName = value;
    }

    /**
     * Gets the value of the schoolDistrictSecondaryID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolDistrictSecondaryID() {
        return schoolDistrictSecondaryID;
    }

    /**
     * Sets the value of the schoolDistrictSecondaryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolDistrictSecondaryID(String value) {
        this.schoolDistrictSecondaryID = value;
    }

    /**
     * Gets the value of the schoolDistrictElementaryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolDistrictElementaryName() {
        return schoolDistrictElementaryName;
    }

    /**
     * Sets the value of the schoolDistrictElementaryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolDistrictElementaryName(String value) {
        this.schoolDistrictElementaryName = value;
    }

    /**
     * Gets the value of the schoolDistrictElementaryID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolDistrictElementaryID() {
        return schoolDistrictElementaryID;
    }

    /**
     * Sets the value of the schoolDistrictElementaryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolDistrictElementaryID(String value) {
        this.schoolDistrictElementaryID = value;
    }

}
