package www.wyq.dao;

import java.util.List;
import www.wyq.entity.Invoice;

public interface InvoiceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table invoice
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer invoiceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table invoice
     *
     * @mbg.generated
     */
    int insert(Invoice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table invoice
     *
     * @mbg.generated
     */
    Invoice selectByPrimaryKey(Integer invoiceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table invoice
     *
     * @mbg.generated
     */
    List<Invoice> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table invoice
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Invoice record);
}