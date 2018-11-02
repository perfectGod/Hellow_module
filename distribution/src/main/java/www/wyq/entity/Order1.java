package www.wyq.entity;

import java.math.BigDecimal;

public class Order1 {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order1.orderId
     *
     * @mbg.generated
     */
    private String orderid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order1.carId
     *
     * @mbg.generated
     */
    private String carid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order1.cuId
     *
     * @mbg.generated
     */
    private String cuid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order1.postPName
     *
     * @mbg.generated
     */
    private String postpname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order1.postPTel
     *
     * @mbg.generated
     */
    private String postptel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order1.postPAddr
     *
     * @mbg.generated
     */
    private String postpaddr;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order1.getPTel
     *
     * @mbg.generated
     */
    private String getptel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order1.getPAddr
     *
     * @mbg.generated
     */
    private String getpaddr;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order1.goodsName
     *
     * @mbg.generated
     */
    private String goodsname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order1.goodsWeight
     *
     * @mbg.generated
     */
    private Integer goodsweight;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order1.orderType
     *
     * @mbg.generated
     */
    private String ordertype;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order1.orderState
     *
     * @mbg.generated
     */
    private String orderstate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order1.transportPrice
     *
     * @mbg.generated
     */
    private BigDecimal transportprice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order1.deliveryPrice
     *
     * @mbg.generated
     */
    private BigDecimal deliveryprice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order1.totalPrice
     *
     * @mbg.generated
     */
    private String totalprice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order1.Comment
     *
     * @mbg.generated
     */
    private String comment;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order1.orderId
     *
     * @return the value of order1.orderId
     *
     * @mbg.generated
     */
    public String getOrderid() {
        return orderid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order1.orderId
     *
     * @param orderid the value for order1.orderId
     *
     * @mbg.generated
     */
    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order1.carId
     *
     * @return the value of order1.carId
     *
     * @mbg.generated
     */
    public String getCarid() {
        return carid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order1.carId
     *
     * @param carid the value for order1.carId
     *
     * @mbg.generated
     */
    public void setCarid(String carid) {
        this.carid = carid == null ? null : carid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order1.cuId
     *
     * @return the value of order1.cuId
     *
     * @mbg.generated
     */
    public String getCuid() {
        return cuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order1.cuId
     *
     * @param cuid the value for order1.cuId
     *
     * @mbg.generated
     */
    public void setCuid(String cuid) {
        this.cuid = cuid == null ? null : cuid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order1.postPName
     *
     * @return the value of order1.postPName
     *
     * @mbg.generated
     */
    public String getPostpname() {
        return postpname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order1.postPName
     *
     * @param postpname the value for order1.postPName
     *
     * @mbg.generated
     */
    public void setPostpname(String postpname) {
        this.postpname = postpname == null ? null : postpname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order1.postPTel
     *
     * @return the value of order1.postPTel
     *
     * @mbg.generated
     */
    public String getPostptel() {
        return postptel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order1.postPTel
     *
     * @param postptel the value for order1.postPTel
     *
     * @mbg.generated
     */
    public void setPostptel(String postptel) {
        this.postptel = postptel == null ? null : postptel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order1.postPAddr
     *
     * @return the value of order1.postPAddr
     *
     * @mbg.generated
     */
    public String getPostpaddr() {
        return postpaddr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order1.postPAddr
     *
     * @param postpaddr the value for order1.postPAddr
     *
     * @mbg.generated
     */
    public void setPostpaddr(String postpaddr) {
        this.postpaddr = postpaddr == null ? null : postpaddr.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order1.getPTel
     *
     * @return the value of order1.getPTel
     *
     * @mbg.generated
     */
    public String getGetptel() {
        return getptel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order1.getPTel
     *
     * @param getptel the value for order1.getPTel
     *
     * @mbg.generated
     */
    public void setGetptel(String getptel) {
        this.getptel = getptel == null ? null : getptel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order1.getPAddr
     *
     * @return the value of order1.getPAddr
     *
     * @mbg.generated
     */
    public String getGetpaddr() {
        return getpaddr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order1.getPAddr
     *
     * @param getpaddr the value for order1.getPAddr
     *
     * @mbg.generated
     */
    public void setGetpaddr(String getpaddr) {
        this.getpaddr = getpaddr == null ? null : getpaddr.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order1.goodsName
     *
     * @return the value of order1.goodsName
     *
     * @mbg.generated
     */
    public String getGoodsname() {
        return goodsname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order1.goodsName
     *
     * @param goodsname the value for order1.goodsName
     *
     * @mbg.generated
     */
    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname == null ? null : goodsname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order1.goodsWeight
     *
     * @return the value of order1.goodsWeight
     *
     * @mbg.generated
     */
    public Integer getGoodsweight() {
        return goodsweight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order1.goodsWeight
     *
     * @param goodsweight the value for order1.goodsWeight
     *
     * @mbg.generated
     */
    public void setGoodsweight(Integer goodsweight) {
        this.goodsweight = goodsweight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order1.orderType
     *
     * @return the value of order1.orderType
     *
     * @mbg.generated
     */
    public String getOrdertype() {
        return ordertype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order1.orderType
     *
     * @param ordertype the value for order1.orderType
     *
     * @mbg.generated
     */
    public void setOrdertype(String ordertype) {
        this.ordertype = ordertype == null ? null : ordertype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order1.orderState
     *
     * @return the value of order1.orderState
     *
     * @mbg.generated
     */
    public String getOrderstate() {
        return orderstate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order1.orderState
     *
     * @param orderstate the value for order1.orderState
     *
     * @mbg.generated
     */
    public void setOrderstate(String orderstate) {
        this.orderstate = orderstate == null ? null : orderstate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order1.transportPrice
     *
     * @return the value of order1.transportPrice
     *
     * @mbg.generated
     */
    public BigDecimal getTransportprice() {
        return transportprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order1.transportPrice
     *
     * @param transportprice the value for order1.transportPrice
     *
     * @mbg.generated
     */
    public void setTransportprice(BigDecimal transportprice) {
        this.transportprice = transportprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order1.deliveryPrice
     *
     * @return the value of order1.deliveryPrice
     *
     * @mbg.generated
     */
    public BigDecimal getDeliveryprice() {
        return deliveryprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order1.deliveryPrice
     *
     * @param deliveryprice the value for order1.deliveryPrice
     *
     * @mbg.generated
     */
    public void setDeliveryprice(BigDecimal deliveryprice) {
        this.deliveryprice = deliveryprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order1.totalPrice
     *
     * @return the value of order1.totalPrice
     *
     * @mbg.generated
     */
    public String getTotalprice() {
        return totalprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order1.totalPrice
     *
     * @param totalprice the value for order1.totalPrice
     *
     * @mbg.generated
     */
    public void setTotalprice(String totalprice) {
        this.totalprice = totalprice == null ? null : totalprice.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order1.Comment
     *
     * @return the value of order1.Comment
     *
     * @mbg.generated
     */
    public String getComment() {
        return comment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order1.Comment
     *
     * @param comment the value for order1.Comment
     *
     * @mbg.generated
     */
    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }
}