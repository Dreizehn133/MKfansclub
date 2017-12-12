
package ws;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "NewWebService", targetNamespace = "http://ws/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface NewWebService {


    /**
     * 
     * @param stb
     * @param nama
     * @param ket
     * @param alamat
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "update", targetNamespace = "http://ws/", className = "ws.Update")
    @ResponseWrapper(localName = "updateResponse", targetNamespace = "http://ws/", className = "ws.UpdateResponse")
    @Action(input = "http://ws/NewWebService/updateRequest", output = "http://ws/NewWebService/updateResponse")
    public String update(
        @WebParam(name = "stb", targetNamespace = "")
        String stb,
        @WebParam(name = "nama", targetNamespace = "")
        String nama,
        @WebParam(name = "ket", targetNamespace = "")
        String ket,
        @WebParam(name = "alamat", targetNamespace = "")
        String alamat);

    /**
     * 
     * @param stb
     * @param nama
     * @param ket
     * @param alamat
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "delete", targetNamespace = "http://ws/", className = "ws.Delete")
    @ResponseWrapper(localName = "deleteResponse", targetNamespace = "http://ws/", className = "ws.DeleteResponse")
    @Action(input = "http://ws/NewWebService/deleteRequest", output = "http://ws/NewWebService/deleteResponse")
    public String delete(
        @WebParam(name = "stb", targetNamespace = "")
        String stb,
        @WebParam(name = "nama", targetNamespace = "")
        String nama,
        @WebParam(name = "ket", targetNamespace = "")
        String ket,
        @WebParam(name = "alamat", targetNamespace = "")
        String alamat);

    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://ws/", className = "ws.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://ws/", className = "ws.HelloResponse")
    @Action(input = "http://ws/NewWebService/helloRequest", output = "http://ws/NewWebService/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @param stb
     * @param nama
     * @param ket
     * @param alamat
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertWS", targetNamespace = "http://ws/", className = "ws.InsertWS")
    @ResponseWrapper(localName = "insertWSResponse", targetNamespace = "http://ws/", className = "ws.InsertWSResponse")
    @Action(input = "http://ws/NewWebService/insertWSRequest", output = "http://ws/NewWebService/insertWSResponse")
    public String insertWS(
        @WebParam(name = "stb", targetNamespace = "")
        String stb,
        @WebParam(name = "nama", targetNamespace = "")
        String nama,
        @WebParam(name = "ket", targetNamespace = "")
        String ket,
        @WebParam(name = "alamat", targetNamespace = "")
        String alamat);

    /**
     * 
     * @return
     *     returns java.util.List<java.lang.Object>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "tampil", targetNamespace = "http://ws/", className = "ws.Tampil")
    @ResponseWrapper(localName = "tampilResponse", targetNamespace = "http://ws/", className = "ws.TampilResponse")
    @Action(input = "http://ws/NewWebService/tampilRequest", output = "http://ws/NewWebService/tampilResponse")
    public List<Object> tampil();

}