
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
 *         &lt;element name="cityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stateAbbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bufferMile" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "cityName",
    "stateAbbr",
    "bufferMile"
})
@XmlRootElement(name = "GetCityBuffer")
public class GetCityBuffer {

    protected String key;
    protected String cityName;
    protected String stateAbbr;
    protected double bufferMile;

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
     * Gets the value of the cityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * Sets the value of the cityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityName(String value) {
        this.cityName = value;
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
     * Gets the value of the bufferMile property.
     * 
     */
    public double getBufferMile() {
        return bufferMile;
    }

    /**
     * Sets the value of the bufferMile property.
     * 
     */
    public void setBufferMile(double value) {
        this.bufferMile = value;
    }

}
