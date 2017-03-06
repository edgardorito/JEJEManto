
package com.dyngeometry.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZipBufferInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZipBufferInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="zipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zipCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bufferMiles" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="neighborCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="neighborZips" type="{http://www.DynGeometry.com/WebService/}ArrayOfZip" minOccurs="0"/>
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
@XmlType(name = "ZipBufferInfo", propOrder = {
    "zipCode",
    "zipCity",
    "state",
    "bufferMiles",
    "neighborCount",
    "neighborZips",
    "errorNo",
    "errorDesc"
})
public class ZipBufferInfo {

    protected String zipCode;
    protected String zipCity;
    protected String state;
    protected double bufferMiles;
    protected int neighborCount;
    protected ArrayOfZip neighborZips;
    @XmlElement(name = "error_no")
    protected int errorNo;
    @XmlElement(name = "error_desc")
    protected String errorDesc;

    /**
     * Gets the value of the zipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Sets the value of the zipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipCode(String value) {
        this.zipCode = value;
    }

    /**
     * Gets the value of the zipCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipCity() {
        return zipCity;
    }

    /**
     * Sets the value of the zipCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipCity(String value) {
        this.zipCity = value;
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
     * Gets the value of the neighborZips property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfZip }
     *     
     */
    public ArrayOfZip getNeighborZips() {
        return neighborZips;
    }

    /**
     * Sets the value of the neighborZips property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfZip }
     *     
     */
    public void setNeighborZips(ArrayOfZip value) {
        this.neighborZips = value;
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
