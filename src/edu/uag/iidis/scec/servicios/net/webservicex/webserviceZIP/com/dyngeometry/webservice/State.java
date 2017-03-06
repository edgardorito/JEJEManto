
package com.dyngeometry.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for State complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="State">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="stateFIPS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stateName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stateAbbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "State", propOrder = {
    "stateFIPS",
    "stateName",
    "stateAbbr"
})
public class State {

    protected String stateFIPS;
    protected String stateName;
    protected String stateAbbr;

    /**
     * Gets the value of the stateFIPS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateFIPS() {
        return stateFIPS;
    }

    /**
     * Sets the value of the stateFIPS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateFIPS(String value) {
        this.stateFIPS = value;
    }

    /**
     * Gets the value of the stateName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateName() {
        return stateName;
    }

    /**
     * Sets the value of the stateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateName(String value) {
        this.stateName = value;
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

}
