
package com.dyngeometry.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CombinedStatisticalArea complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CombinedStatisticalArea">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CSAName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CSAID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CombinedStatisticalArea", propOrder = {
    "csaName",
    "csaid"
})
public class CombinedStatisticalArea {

    @XmlElement(name = "CSAName")
    protected String csaName;
    @XmlElement(name = "CSAID")
    protected String csaid;

    /**
     * Gets the value of the csaName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSAName() {
        return csaName;
    }

    /**
     * Sets the value of the csaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSAName(String value) {
        this.csaName = value;
    }

    /**
     * Gets the value of the csaid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSAID() {
        return csaid;
    }

    /**
     * Sets the value of the csaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSAID(String value) {
        this.csaid = value;
    }

}
