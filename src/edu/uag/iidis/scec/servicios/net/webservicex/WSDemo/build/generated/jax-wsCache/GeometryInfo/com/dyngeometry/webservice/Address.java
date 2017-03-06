
package com.dyngeometry.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Address complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Address">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="geoStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="geoCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="geoState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="geoZipcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="geocodeLevel" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "Address", propOrder = {
    "longitude",
    "latitude",
    "geoStreet",
    "geoCity",
    "geoState",
    "geoZipcode",
    "geocodeLevel",
    "errorNo",
    "errorDesc"
})
public class Address {

    protected double longitude;
    protected double latitude;
    protected String geoStreet;
    protected String geoCity;
    protected String geoState;
    protected String geoZipcode;
    protected int geocodeLevel;
    @XmlElement(name = "error_no")
    protected int errorNo;
    @XmlElement(name = "error_desc")
    protected String errorDesc;

    /**
     * Gets the value of the longitude property.
     * 
     */
    public double getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     */
    public void setLongitude(double value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the latitude property.
     * 
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     */
    public void setLatitude(double value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the geoStreet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeoStreet() {
        return geoStreet;
    }

    /**
     * Sets the value of the geoStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeoStreet(String value) {
        this.geoStreet = value;
    }

    /**
     * Gets the value of the geoCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeoCity() {
        return geoCity;
    }

    /**
     * Sets the value of the geoCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeoCity(String value) {
        this.geoCity = value;
    }

    /**
     * Gets the value of the geoState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeoState() {
        return geoState;
    }

    /**
     * Sets the value of the geoState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeoState(String value) {
        this.geoState = value;
    }

    /**
     * Gets the value of the geoZipcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeoZipcode() {
        return geoZipcode;
    }

    /**
     * Sets the value of the geoZipcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeoZipcode(String value) {
        this.geoZipcode = value;
    }

    /**
     * Gets the value of the geocodeLevel property.
     * 
     */
    public int getGeocodeLevel() {
        return geocodeLevel;
    }

    /**
     * Sets the value of the geocodeLevel property.
     * 
     */
    public void setGeocodeLevel(int value) {
        this.geocodeLevel = value;
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
