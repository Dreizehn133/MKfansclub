
package ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _TampilResponse_QNAME = new QName("http://ws/", "tampilResponse");
    private final static QName _InsertWSResponse_QNAME = new QName("http://ws/", "insertWSResponse");
    private final static QName _DeleteResponse_QNAME = new QName("http://ws/", "deleteResponse");
    private final static QName _HelloResponse_QNAME = new QName("http://ws/", "helloResponse");
    private final static QName _Update_QNAME = new QName("http://ws/", "update");
    private final static QName _Hello_QNAME = new QName("http://ws/", "hello");
    private final static QName _Delete_QNAME = new QName("http://ws/", "delete");
    private final static QName _InsertWS_QNAME = new QName("http://ws/", "insertWS");
    private final static QName _UpdateResponse_QNAME = new QName("http://ws/", "updateResponse");
    private final static QName _Tampil_QNAME = new QName("http://ws/", "tampil");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TampilResponse }
     * 
     */
    public TampilResponse createTampilResponse() {
        return new TampilResponse();
    }

    /**
     * Create an instance of {@link InsertWSResponse }
     * 
     */
    public InsertWSResponse createInsertWSResponse() {
        return new InsertWSResponse();
    }

    /**
     * Create an instance of {@link DeleteResponse }
     * 
     */
    public DeleteResponse createDeleteResponse() {
        return new DeleteResponse();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link Update }
     * 
     */
    public Update createUpdate() {
        return new Update();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link Delete }
     * 
     */
    public Delete createDelete() {
        return new Delete();
    }

    /**
     * Create an instance of {@link InsertWS }
     * 
     */
    public InsertWS createInsertWS() {
        return new InsertWS();
    }

    /**
     * Create an instance of {@link UpdateResponse }
     * 
     */
    public UpdateResponse createUpdateResponse() {
        return new UpdateResponse();
    }

    /**
     * Create an instance of {@link Tampil }
     * 
     */
    public Tampil createTampil() {
        return new Tampil();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TampilResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "tampilResponse")
    public JAXBElement<TampilResponse> createTampilResponse(TampilResponse value) {
        return new JAXBElement<TampilResponse>(_TampilResponse_QNAME, TampilResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertWSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "insertWSResponse")
    public JAXBElement<InsertWSResponse> createInsertWSResponse(InsertWSResponse value) {
        return new JAXBElement<InsertWSResponse>(_InsertWSResponse_QNAME, InsertWSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "deleteResponse")
    public JAXBElement<DeleteResponse> createDeleteResponse(DeleteResponse value) {
        return new JAXBElement<DeleteResponse>(_DeleteResponse_QNAME, DeleteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Update }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "update")
    public JAXBElement<Update> createUpdate(Update value) {
        return new JAXBElement<Update>(_Update_QNAME, Update.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Delete }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "delete")
    public JAXBElement<Delete> createDelete(Delete value) {
        return new JAXBElement<Delete>(_Delete_QNAME, Delete.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertWS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "insertWS")
    public JAXBElement<InsertWS> createInsertWS(InsertWS value) {
        return new JAXBElement<InsertWS>(_InsertWS_QNAME, InsertWS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "updateResponse")
    public JAXBElement<UpdateResponse> createUpdateResponse(UpdateResponse value) {
        return new JAXBElement<UpdateResponse>(_UpdateResponse_QNAME, UpdateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tampil }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "tampil")
    public JAXBElement<Tampil> createTampil(Tampil value) {
        return new JAXBElement<Tampil>(_Tampil_QNAME, Tampil.class, null, value);
    }

}
