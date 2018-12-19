
package shares;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the shares package. 
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

    private final static QName _AddCompany_QNAME = new QName("http://shares/", "addCompany");
    private final static QName _AddCompanyResponse_QNAME = new QName("http://shares/", "addCompanyResponse");
    private final static QName _ListSharesResponse_QNAME = new QName("http://shares/", "listSharesResponse");
    private final static QName _ListShares_QNAME = new QName("http://shares/", "listShares");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: shares
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListShares }
     * 
     */
    public ListShares createListShares() {
        return new ListShares();
    }

    /**
     * Create an instance of {@link AddCompany }
     * 
     */
    public AddCompany createAddCompany() {
        return new AddCompany();
    }

    /**
     * Create an instance of {@link AddCompanyResponse }
     * 
     */
    public AddCompanyResponse createAddCompanyResponse() {
        return new AddCompanyResponse();
    }

    /**
     * Create an instance of {@link ListSharesResponse }
     * 
     */
    public ListSharesResponse createListSharesResponse() {
        return new ListSharesResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCompany }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://shares/", name = "addCompany")
    public JAXBElement<AddCompany> createAddCompany(AddCompany value) {
        return new JAXBElement<AddCompany>(_AddCompany_QNAME, AddCompany.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCompanyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://shares/", name = "addCompanyResponse")
    public JAXBElement<AddCompanyResponse> createAddCompanyResponse(AddCompanyResponse value) {
        return new JAXBElement<AddCompanyResponse>(_AddCompanyResponse_QNAME, AddCompanyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListSharesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://shares/", name = "listSharesResponse")
    public JAXBElement<ListSharesResponse> createListSharesResponse(ListSharesResponse value) {
        return new JAXBElement<ListSharesResponse>(_ListSharesResponse_QNAME, ListSharesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListShares }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://shares/", name = "listShares")
    public JAXBElement<ListShares> createListShares(ListShares value) {
        return new JAXBElement<ListShares>(_ListShares_QNAME, ListShares.class, null, value);
    }

}
