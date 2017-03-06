
package com.dyngeometry.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MetropolitanDivision complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MetropolitanDivision">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="METDIVName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="METDIVID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetropolitanDivision", propOrder = {
    "metdivName",
    "metdivid"
})
public class MetropolitanDivision {

    @XmlElement(name = "METDIVName")
    protected String metdivName;
    @XmlElement(name = "METDIVID")
    protected String metdivid;

    /**
     * Gets the value of the metdivName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMETDIVName() {
        return metdivName;
    }

    /**
     * Sets the value of the metdivName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMETDIVName(String value) {
        this.metdivName = value;
    }

    /**
     * Gets the value of the metdivid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMETDIVID() {
        return metdivid;
    }

    /**
     * Sets the value of the metdivid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMETDIVID(String value) {
        this.metdivid = value;
    }

}
