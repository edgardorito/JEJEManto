
package com.dyngeometry.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VotingDistrict complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VotingDistrict">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="votingDistrictName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="votingDistrictID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VotingDistrict", propOrder = {
    "votingDistrictName",
    "votingDistrictID"
})
public class VotingDistrict {

    protected String votingDistrictName;
    protected String votingDistrictID;

    /**
     * Gets the value of the votingDistrictName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVotingDistrictName() {
        return votingDistrictName;
    }

    /**
     * Sets the value of the votingDistrictName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVotingDistrictName(String value) {
        this.votingDistrictName = value;
    }

    /**
     * Gets the value of the votingDistrictID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVotingDistrictID() {
        return votingDistrictID;
    }

    /**
     * Sets the value of the votingDistrictID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVotingDistrictID(String value) {
        this.votingDistrictID = value;
    }

}
