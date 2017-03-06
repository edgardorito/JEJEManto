
package com.dyngeometry.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CountySubdivision complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CountySubdivision">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="countySubdivisionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="countySubdivisionFIPS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CountySubdivision", propOrder = {
    "countySubdivisionName",
    "countySubdivisionFIPS"
})
public class CountySubdivision {

    protected String countySubdivisionName;
    protected String countySubdivisionFIPS;

    /**
     * Gets the value of the countySubdivisionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountySubdivisionName() {
        return countySubdivisionName;
    }

    /**
     * Sets the value of the countySubdivisionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountySubdivisionName(String value) {
        this.countySubdivisionName = value;
    }

    /**
     * Gets the value of the countySubdivisionFIPS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountySubdivisionFIPS() {
        return countySubdivisionFIPS;
    }

    /**
     * Sets the value of the countySubdivisionFIPS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountySubdivisionFIPS(String value) {
        this.countySubdivisionFIPS = value;
    }

}
