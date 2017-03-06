
package com.dyngeometry.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="GetSchoolDistrictResult" type="{http://www.DynGeometry.com/WebService/}SchoolDistrictInfo" minOccurs="0"/>
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
    "getSchoolDistrictResult"
})
@XmlRootElement(name = "GetSchoolDistrictResponse")
public class GetSchoolDistrictResponse {

    @XmlElement(name = "GetSchoolDistrictResult")
    protected SchoolDistrictInfo getSchoolDistrictResult;

    /**
     * Gets the value of the getSchoolDistrictResult property.
     * 
     * @return
     *     possible object is
     *     {@link SchoolDistrictInfo }
     *     
     */
    public SchoolDistrictInfo getGetSchoolDistrictResult() {
        return getSchoolDistrictResult;
    }

    /**
     * Sets the value of the getSchoolDistrictResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchoolDistrictInfo }
     *     
     */
    public void setGetSchoolDistrictResult(SchoolDistrictInfo value) {
        this.getSchoolDistrictResult = value;
    }

}
