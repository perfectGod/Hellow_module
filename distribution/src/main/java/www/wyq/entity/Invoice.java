package www.wyq.entity;

import java.util.Date;

public class Invoice {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column invoice.InvoiceId
     *
     * @mbg.generated
     */
    private Integer invoiceid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column invoice.CustomerId
     *
     * @mbg.generated
     */
    private Integer customerid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column invoice.InvoiceDate
     *
     * @mbg.generated
     */
    private Date invoicedate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column invoice.BillingAddress
     *
     * @mbg.generated
     */
    private String billingaddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column invoice.BillingCity
     *
     * @mbg.generated
     */
    private String billingcity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column invoice.BillingState
     *
     * @mbg.generated
     */
    private String billingstate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column invoice.BillingCountry
     *
     * @mbg.generated
     */
    private String billingcountry;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column invoice.BillingPostalCode
     *
     * @mbg.generated
     */
    private String billingpostalcode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column invoice.Total
     *
     * @mbg.generated
     */
    private Integer total;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column invoice.InvoiceId
     *
     * @return the value of invoice.InvoiceId
     *
     * @mbg.generated
     */
    public Integer getInvoiceid() {
        return invoiceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column invoice.InvoiceId
     *
     * @param invoiceid the value for invoice.InvoiceId
     *
     * @mbg.generated
     */
    public void setInvoiceid(Integer invoiceid) {
        this.invoiceid = invoiceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column invoice.CustomerId
     *
     * @return the value of invoice.CustomerId
     *
     * @mbg.generated
     */
    public Integer getCustomerid() {
        return customerid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column invoice.CustomerId
     *
     * @param customerid the value for invoice.CustomerId
     *
     * @mbg.generated
     */
    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column invoice.InvoiceDate
     *
     * @return the value of invoice.InvoiceDate
     *
     * @mbg.generated
     */
    public Date getInvoicedate() {
        return invoicedate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column invoice.InvoiceDate
     *
     * @param invoicedate the value for invoice.InvoiceDate
     *
     * @mbg.generated
     */
    public void setInvoicedate(Date invoicedate) {
        this.invoicedate = invoicedate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column invoice.BillingAddress
     *
     * @return the value of invoice.BillingAddress
     *
     * @mbg.generated
     */
    public String getBillingaddress() {
        return billingaddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column invoice.BillingAddress
     *
     * @param billingaddress the value for invoice.BillingAddress
     *
     * @mbg.generated
     */
    public void setBillingaddress(String billingaddress) {
        this.billingaddress = billingaddress == null ? null : billingaddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column invoice.BillingCity
     *
     * @return the value of invoice.BillingCity
     *
     * @mbg.generated
     */
    public String getBillingcity() {
        return billingcity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column invoice.BillingCity
     *
     * @param billingcity the value for invoice.BillingCity
     *
     * @mbg.generated
     */
    public void setBillingcity(String billingcity) {
        this.billingcity = billingcity == null ? null : billingcity.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column invoice.BillingState
     *
     * @return the value of invoice.BillingState
     *
     * @mbg.generated
     */
    public String getBillingstate() {
        return billingstate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column invoice.BillingState
     *
     * @param billingstate the value for invoice.BillingState
     *
     * @mbg.generated
     */
    public void setBillingstate(String billingstate) {
        this.billingstate = billingstate == null ? null : billingstate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column invoice.BillingCountry
     *
     * @return the value of invoice.BillingCountry
     *
     * @mbg.generated
     */
    public String getBillingcountry() {
        return billingcountry;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column invoice.BillingCountry
     *
     * @param billingcountry the value for invoice.BillingCountry
     *
     * @mbg.generated
     */
    public void setBillingcountry(String billingcountry) {
        this.billingcountry = billingcountry == null ? null : billingcountry.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column invoice.BillingPostalCode
     *
     * @return the value of invoice.BillingPostalCode
     *
     * @mbg.generated
     */
    public String getBillingpostalcode() {
        return billingpostalcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column invoice.BillingPostalCode
     *
     * @param billingpostalcode the value for invoice.BillingPostalCode
     *
     * @mbg.generated
     */
    public void setBillingpostalcode(String billingpostalcode) {
        this.billingpostalcode = billingpostalcode == null ? null : billingpostalcode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column invoice.Total
     *
     * @return the value of invoice.Total
     *
     * @mbg.generated
     */
    public Integer getTotal() {
        return total;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column invoice.Total
     *
     * @param total the value for invoice.Total
     *
     * @mbg.generated
     */
    public void setTotal(Integer total) {
        this.total = total;
    }
}