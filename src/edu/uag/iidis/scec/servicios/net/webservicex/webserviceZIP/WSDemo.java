/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.dyngeometry.webservice.AddressInfo;
/**
 *
 * @author Ernesto
 */
public class WSDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("country: "+geocodePro("DLXLYVSPNVZYPSNV2249", "", "", "", "33134").getGeoCity());
        System.out.println("country: "+geocodePro("DLXLYVSPNVZYPSNV2249", "", "", "", "33134").getGeoState());
        System.out.println("country: "+geocodePro("DLXLYVSPNVZYPSNV2249", "", "", "", "33134").getCounty().getCountyName());
    }

    private static AddressInfo geocodePro(java.lang.String key, java.lang.String street, java.lang.String city, java.lang.String state, java.lang.String zip) {
        com.dyngeometry.webservice.GeometryInfo service = new com.dyngeometry.webservice.GeometryInfo();
        com.dyngeometry.webservice.GeometryInfoSoap port = service.getGeometryInfoSoap();
        return port.geocodePro(key, street, city, state, zip);
    }

    
    
}
