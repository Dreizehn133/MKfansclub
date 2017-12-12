
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for insertWS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="insertWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="stb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nama" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ket" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="alamat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insertWS", propOrder = {
    "stb",
    "nama",
    "ket",
    "alamat"
})
public class InsertWS {

    protected String stb;
    protected String nama;
    protected String ket;
    protected String alamat;

    /**
     * Gets the value of the stb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStb() {
        return stb;
    }

    /**
     * Sets the value of the stb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStb(String value) {
        this.stb = value;
    }

    /**
     * Gets the value of the nama property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNama() {
        return nama;
    }

    /**
     * Sets the value of the nama property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNama(String value) {
        this.nama = value;
    }

    /**
     * Gets the value of the ket property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKet() {
        return ket;
    }

    /**
     * Sets the value of the ket property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKet(String value) {
        this.ket = value;
    }

    /**
     * Gets the value of the alamat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * Sets the value of the alamat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlamat(String value) {
        this.alamat = value;
    }

}
