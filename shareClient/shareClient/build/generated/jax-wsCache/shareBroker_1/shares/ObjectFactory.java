
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

    private final static QName _IOException_QNAME = new QName("http://shares/", "IOException");
    private final static QName _ListCurrency_QNAME = new QName("http://shares/", "listCurrency");
    private final static QName _UpdateSharesResponse_QNAME = new QName("http://shares/", "updateSharesResponse");
    private final static QName _AddCompanyResponse_QNAME = new QName("http://shares/", "addCompanyResponse");
    private final static QName _ListSymbolResponse_QNAME = new QName("http://shares/", "listSymbolResponse");
    private final static QName _Exception_QNAME = new QName("http://shares/", "Exception");
    private final static QName _ListAvailableShares_QNAME = new QName("http://shares/", "listAvailableShares");
    private final static QName _ListSharesResponse_QNAME = new QName("http://shares/", "listSharesResponse");
    private final static QName _ListNameResponse_QNAME = new QName("http://shares/", "listNameResponse");
    private final static QName _ListAvailableSharesResponse_QNAME = new QName("http://shares/", "listAvailableSharesResponse");
    private final static QName _ListPriceResponse_QNAME = new QName("http://shares/", "listPriceResponse");
    private final static QName _ListShares_QNAME = new QName("http://shares/", "listShares");
    private final static QName _Add_QNAME = new QName("http://shares/", "add");
    private final static QName _JAXBException_QNAME = new QName("http://shares/", "JAXBException");
    private final static QName _AddResponse_QNAME = new QName("http://shares/", "addResponse");
    private final static QName _ListName_QNAME = new QName("http://shares/", "listName");
    private final static QName _ListNames_QNAME = new QName("http://shares/", "listNames");
    private final static QName _ListNamesResponse_QNAME = new QName("http://shares/", "listNamesResponse");
    private final static QName _UpdateShares_QNAME = new QName("http://shares/", "updateShares");
    private final static QName _AddCompany_QNAME = new QName("http://shares/", "addCompany");
    private final static QName _ListPrice_QNAME = new QName("http://shares/", "listPrice");
    private final static QName _ListSymbol_QNAME = new QName("http://shares/", "listSymbol");
    private final static QName _ListCurrencyResponse_QNAME = new QName("http://shares/", "listCurrencyResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: shares
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Company }
     * 
     */
    public Company createCompany() {
        return new Company();
    }

    /**
     * Create an instance of {@link ListSharesResponse }
     * 
     */
    public ListSharesResponse createListSharesResponse() {
        return new ListSharesResponse();
    }

    /**
     * Create an instance of {@link Add }
     * 
     */
    public Add createAdd() {
        return new Add();
    }

    /**
     * Create an instance of {@link ListShares }
     * 
     */
    public ListShares createListShares() {
        return new ListShares();
    }

    /**
     * Create an instance of {@link AddResponse }
     * 
     */
    public AddResponse createAddResponse() {
        return new AddResponse();
    }

    /**
     * Create an instance of {@link JAXBException }
     * 
     */
    public JAXBException createJAXBException() {
        return new JAXBException();
    }

    /**
     * Create an instance of {@link AddCompanyResponse }
     * 
     */
    public AddCompanyResponse createAddCompanyResponse() {
        return new AddCompanyResponse();
    }

    /**
     * Create an instance of {@link UpdateSharesResponse }
     * 
     */
    public UpdateSharesResponse createUpdateSharesResponse() {
        return new UpdateSharesResponse();
    }

    /**
     * Create an instance of {@link ListCurrency }
     * 
     */
    public ListCurrency createListCurrency() {
        return new ListCurrency();
    }

    /**
     * Create an instance of {@link IOException }
     * 
     */
    public IOException createIOException() {
        return new IOException();
    }

    /**
     * Create an instance of {@link ListAvailableSharesResponse }
     * 
     */
    public ListAvailableSharesResponse createListAvailableSharesResponse() {
        return new ListAvailableSharesResponse();
    }

    /**
     * Create an instance of {@link ListPriceResponse }
     * 
     */
    public ListPriceResponse createListPriceResponse() {
        return new ListPriceResponse();
    }

    /**
     * Create an instance of {@link ListNameResponse }
     * 
     */
    public ListNameResponse createListNameResponse() {
        return new ListNameResponse();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link ListAvailableShares }
     * 
     */
    public ListAvailableShares createListAvailableShares() {
        return new ListAvailableShares();
    }

    /**
     * Create an instance of {@link ListSymbolResponse }
     * 
     */
    public ListSymbolResponse createListSymbolResponse() {
        return new ListSymbolResponse();
    }

    /**
     * Create an instance of {@link ListSymbol }
     * 
     */
    public ListSymbol createListSymbol() {
        return new ListSymbol();
    }

    /**
     * Create an instance of {@link ListCurrencyResponse }
     * 
     */
    public ListCurrencyResponse createListCurrencyResponse() {
        return new ListCurrencyResponse();
    }

    /**
     * Create an instance of {@link AddCompany }
     * 
     */
    public AddCompany createAddCompany() {
        return new AddCompany();
    }

    /**
     * Create an instance of {@link AllCompanies }
     * 
     */
    public AllCompanies createAllCompanies() {
        return new AllCompanies();
    }

    /**
     * Create an instance of {@link ListNamesResponse }
     * 
     */
    public ListNamesResponse createListNamesResponse() {
        return new ListNamesResponse();
    }

    /**
     * Create an instance of {@link UpdateShares }
     * 
     */
    public UpdateShares createUpdateShares() {
        return new UpdateShares();
    }

    /**
     * Create an instance of {@link ListName }
     * 
     */
    public ListName createListName() {
        return new ListName();
    }

    /**
     * Create an instance of {@link ListNames }
     * 
     */
    public ListNames createListNames() {
        return new ListNames();
    }

    /**
     * Create an instance of {@link ListPrice }
     * 
     */
    public ListPrice createListPrice() {
        return new ListPrice();
    }

    /**
     * Create an instance of {@link Throwable }
     * 
     */
    public Throwable createThrowable() {
        return new Throwable();
    }

    /**
     * Create an instance of {@link StackTraceElement }
     * 
     */
    public StackTraceElement createStackTraceElement() {
        return new StackTraceElement();
    }

    /**
     * Create an instance of {@link Company.SharePrice }
     * 
     */
    public Company.SharePrice createCompanySharePrice() {
        return new Company.SharePrice();
    }

    /**
     * Create an instance of {@link ListSharesResponse.Return }
     * 
     */
    public ListSharesResponse.Return createListSharesResponseReturn() {
        return new ListSharesResponse.Return();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IOException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://shares/", name = "IOException")
    public JAXBElement<IOException> createIOException(IOException value) {
        return new JAXBElement<IOException>(_IOException_QNAME, IOException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListCurrency }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://shares/", name = "listCurrency")
    public JAXBElement<ListCurrency> createListCurrency(ListCurrency value) {
        return new JAXBElement<ListCurrency>(_ListCurrency_QNAME, ListCurrency.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSharesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://shares/", name = "updateSharesResponse")
    public JAXBElement<UpdateSharesResponse> createUpdateSharesResponse(UpdateSharesResponse value) {
        return new JAXBElement<UpdateSharesResponse>(_UpdateSharesResponse_QNAME, UpdateSharesResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ListSymbolResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://shares/", name = "listSymbolResponse")
    public JAXBElement<ListSymbolResponse> createListSymbolResponse(ListSymbolResponse value) {
        return new JAXBElement<ListSymbolResponse>(_ListSymbolResponse_QNAME, ListSymbolResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://shares/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListAvailableShares }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://shares/", name = "listAvailableShares")
    public JAXBElement<ListAvailableShares> createListAvailableShares(ListAvailableShares value) {
        return new JAXBElement<ListAvailableShares>(_ListAvailableShares_QNAME, ListAvailableShares.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ListNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://shares/", name = "listNameResponse")
    public JAXBElement<ListNameResponse> createListNameResponse(ListNameResponse value) {
        return new JAXBElement<ListNameResponse>(_ListNameResponse_QNAME, ListNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListAvailableSharesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://shares/", name = "listAvailableSharesResponse")
    public JAXBElement<ListAvailableSharesResponse> createListAvailableSharesResponse(ListAvailableSharesResponse value) {
        return new JAXBElement<ListAvailableSharesResponse>(_ListAvailableSharesResponse_QNAME, ListAvailableSharesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListPriceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://shares/", name = "listPriceResponse")
    public JAXBElement<ListPriceResponse> createListPriceResponse(ListPriceResponse value) {
        return new JAXBElement<ListPriceResponse>(_ListPriceResponse_QNAME, ListPriceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListShares }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://shares/", name = "listShares")
    public JAXBElement<ListShares> createListShares(ListShares value) {
        return new JAXBElement<ListShares>(_ListShares_QNAME, ListShares.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Add }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://shares/", name = "add")
    public JAXBElement<Add> createAdd(Add value) {
        return new JAXBElement<Add>(_Add_QNAME, Add.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JAXBException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://shares/", name = "JAXBException")
    public JAXBElement<JAXBException> createJAXBException(JAXBException value) {
        return new JAXBElement<JAXBException>(_JAXBException_QNAME, JAXBException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://shares/", name = "addResponse")
    public JAXBElement<AddResponse> createAddResponse(AddResponse value) {
        return new JAXBElement<AddResponse>(_AddResponse_QNAME, AddResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://shares/", name = "listName")
    public JAXBElement<ListName> createListName(ListName value) {
        return new JAXBElement<ListName>(_ListName_QNAME, ListName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListNames }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://shares/", name = "listNames")
    public JAXBElement<ListNames> createListNames(ListNames value) {
        return new JAXBElement<ListNames>(_ListNames_QNAME, ListNames.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListNamesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://shares/", name = "listNamesResponse")
    public JAXBElement<ListNamesResponse> createListNamesResponse(ListNamesResponse value) {
        return new JAXBElement<ListNamesResponse>(_ListNamesResponse_QNAME, ListNamesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateShares }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://shares/", name = "updateShares")
    public JAXBElement<UpdateShares> createUpdateShares(UpdateShares value) {
        return new JAXBElement<UpdateShares>(_UpdateShares_QNAME, UpdateShares.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ListPrice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://shares/", name = "listPrice")
    public JAXBElement<ListPrice> createListPrice(ListPrice value) {
        return new JAXBElement<ListPrice>(_ListPrice_QNAME, ListPrice.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListSymbol }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://shares/", name = "listSymbol")
    public JAXBElement<ListSymbol> createListSymbol(ListSymbol value) {
        return new JAXBElement<ListSymbol>(_ListSymbol_QNAME, ListSymbol.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListCurrencyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://shares/", name = "listCurrencyResponse")
    public JAXBElement<ListCurrencyResponse> createListCurrencyResponse(ListCurrencyResponse value) {
        return new JAXBElement<ListCurrencyResponse>(_ListCurrencyResponse_QNAME, ListCurrencyResponse.class, null, value);
    }

}
