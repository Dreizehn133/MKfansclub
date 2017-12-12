/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientws;

import java.util.List;

/**
 *
 * @author Dreizehn
 */
public class util_ws {

    public static java.util.List tampil() {
        ws.NewWebService_Service service = new ws.NewWebService_Service();
        ws.NewWebService port = service.getNewWebServicePort();
        return port.tampil();
    }

    public static String insertWS(java.lang.String stb, java.lang.String nama, java.lang.String ket, java.lang.String alamat) {
        ws.NewWebService_Service service = new ws.NewWebService_Service();
        ws.NewWebService port = service.getNewWebServicePort();
        return port.insertWS(stb, nama, ket, alamat);
    }

    public static String update(java.lang.String stb, java.lang.String nama, java.lang.String ket, java.lang.String alamat) {
        ws.NewWebService_Service service = new ws.NewWebService_Service();
        ws.NewWebService port = service.getNewWebServicePort();
        return port.update(stb, nama, ket, alamat);
    }

    public static String delete(java.lang.String stb, java.lang.String nama, java.lang.String ket, java.lang.String alamat) {
        ws.NewWebService_Service service = new ws.NewWebService_Service();
        ws.NewWebService port = service.getNewWebServicePort();
        return port.delete(stb, nama, ket, alamat);
    }
    
}
