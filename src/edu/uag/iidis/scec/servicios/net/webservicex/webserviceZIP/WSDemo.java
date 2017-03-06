/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.webservicex.webserviceZIP;
import com.dyngeometry.webservice.AddressInfo;
/**
 *
 * @author Ernesto
 */
public class WSDemo {

   

    public  AddressInfo geocodePro(java.lang.String key, java.lang.String street, java.lang.String city, java.lang.String state, java.lang.String zip) {
        com.dyngeometry.webservice.GeometryInfo service = new com.dyngeometry.webservice.GeometryInfo();
        com.dyngeometry.webservice.GeometryInfoSoap port = service.getGeometryInfoSoap();
        return port.geocodePro(key, street, city, state, zip);
    }

    
    
}
