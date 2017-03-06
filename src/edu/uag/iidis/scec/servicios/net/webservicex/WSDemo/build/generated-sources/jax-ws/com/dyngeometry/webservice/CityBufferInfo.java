
package com.dyngeometry.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CityBufferInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CityBufferInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cityFIPS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bufferMiles" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="neighborCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="neighborCities" type="{http://www.DynGeometry.com/WebService/}ArrayOfCensusCity" minOccurs="0"/>
 *         &lt;element name="error_no" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="error_desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CityBufferInfo", propOrder = {
    "cityName",
    "cityFIPS",
    "state",
    "bufferMiles",
    "neighborCount",
    "neighborCities",
    "errorNo",
    "errorDesc"
})
public class CityBufferInfo {

    protected String cityName;
    protected String cityFIPS;
    protected String state;
    protected double bufferMiles;
    protected int neighborCount;
    protected ArrayOfCensusCity neighborCities;
    @XmlElement(name = "error_no")
    protected int errorNo;
    @XmlElement(name = "error_desc")
    protected String errorDesc;

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
     * Gets the value of the cityFIPS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityFIPS() {
        return cityFIPS;
    }

    /**
     * Sets the value of the cityFIPS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityFIPS(String value) {
        this.cityFIPS = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the bufferMiles property.
     * 
     */
    public double getBufferMiles() {
        return bufferMiles;
    }

    /**
     * Sets the value of the bufferMiles property.
     * 
     */
    public void setBufferMiles(double value) {
        this.bufferMiles = value;
    }

    /**
     * Gets the value of the neighborCount property.
     * 
     */
    public int getNeighborCount() {
        return neighborCount;
    }

    /**
     * Sets the value of the neighborCount property.
     * 
     */
    public void setNeighborCount(int value) {
        this.neighborCount = value;
    }

    /**
     * Gets the value of the neighborCities property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCensusCity }
     *     
     */
    public ArrayOfCensusCity getNeighborCities() {
        return neighborCities;
    }

    /**
     * Sets the value of the neighborCities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCensusCity }
     *     
     */
    public void setNeighborCities(ArrayOfCensusCity value) {
        this.neighborCities = value;
    }

    /**
     * Gets the value of the errorNo property.
     * 
     */
    public int getErrorNo() {
        return errorNo;
    }

    /**
     * Sets the value of the errorNo property.
     * 
     */
    public void setErrorNo(int value) {
        this.errorNo = value;
    }

    /**
     * Gets the value of the errorDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorDesc() {
        return errorDesc;
    }

    /**
     * Sets the value of the errorDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorDesc(String value) {
        this.errorDesc = value;
    }

}
