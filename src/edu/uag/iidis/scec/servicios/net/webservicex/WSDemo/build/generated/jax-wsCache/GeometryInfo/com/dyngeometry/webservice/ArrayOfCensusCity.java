
package com.dyngeometry.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCensusCity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCensusCity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CensusCity" type="{http://www.DynGeometry.com/WebService/}CensusCity" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCensusCity", propOrder = {
    "censusCity"
})
public class ArrayOfCensusCity {

    @XmlElement(name = "CensusCity", nillable = true)
    protected List<CensusCity> censusCity;

    /**
     * Gets the value of the censusCity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the censusCity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCensusCity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CensusCity }
     * 
     * 
     */
    public List<CensusCity> getCensusCity() {
        if (censusCity == null) {
            censusCity = new ArrayList<CensusCity>();
        }
        return this.censusCity;
    }

}
