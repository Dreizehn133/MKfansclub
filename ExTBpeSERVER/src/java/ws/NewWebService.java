/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import pojo.Mhs;
import pojo.crud;

/**
 *
 * @author Dreizehn
 */
@WebService(serviceName = "NewWebService")
public class NewWebService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "tampil")
    public List tampil() {
        List l=new ArrayList();
        List<Mhs> mhs;
        mhs=crud.select();
        for (Mhs m : mhs) {
            l.add(m.getStb());
            l.add(m.getNama());
            l.add(m.getKet());
            l.add(m.getAlamat());
        }
        return l;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "insertWS")
    public String insertWS(@WebParam(name = "stb") String stb, @WebParam(name = "nama") String nama, @WebParam(name = "ket") String ket, @WebParam(name = "alamat") String alamat) {
        Mhs m = new Mhs(stb, nama, ket, alamat);
        if(crud.insert(m)){
            return "Berhasil Insert";
        }else{
            return "Gagal Insert";
        }
        
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "update")
    public String update(@WebParam(name = "stb") String stb, @WebParam(name = "nama") String nama, @WebParam(name = "ket") String ket, @WebParam(name = "alamat") String alamat) {
         Mhs m = new Mhs(stb, nama, ket, alamat);
        if(crud.update(m)){
            return "Berhasil";
        }else{
            return "Gagal";
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "delete")
    public String delete(@WebParam(name = "stb") String stb, @WebParam(name = "nama") String nama, @WebParam(name = "ket") String ket, @WebParam(name = "alamat") String alamat) {
        Mhs m = new Mhs(stb, nama, ket, alamat);
        if(crud.delete(m)){
            return "Berhasil";
        }else{
            return "Gagal";
        }
    }
    
    
    
    
    
}
