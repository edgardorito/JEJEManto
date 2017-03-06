
package com.dyngeometry.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CoreBasedStatisticalArea complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CoreBasedStatisticalArea">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CBSAName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CBSAID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoreBasedStatisticalArea", propOrder = {
    "cbsaName",
    "cbsaid"
})
public class CoreBasedStatisticalArea {

    @XmlElement(name = "CBSAName")
    protected String cbsaName;
    @XmlElement(name = "CBSAID")
    protected String cbsaid;

    /**
     * Gets the value of the cbsaName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCBSAName() {
        return cbsaName;
    }

    /**
     * Sets the value of the cbsaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCBSAName(String value) {
        this.cbsaName = value;
    }

    /**
     * Gets the value of the cbsaid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCBSAID() {
        return cbsaid;
    }

    /**
     * Sets the value of the cbsaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCBSAID(String value) {
        this.cbsaid = value;
    }

}
