package www.wyq.entity;

public class City {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column city.cityId
     *
     * @mbg.generated
     */
    private String cityid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column city.provinceId
     *
     * @mbg.generated
     */
    private String provinceid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column city.cityName
     *
     * @mbg.generated
     */
    private String cityname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column city.provinceName
     *
     * @mbg.generated
     */
    private String provincename;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column city.cityId
     *
     * @return the value of city.cityId
     *
     * @mbg.generated
     */
    public String getCityid() {
        return cityid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column city.cityId
     *
     * @param cityid the value for city.cityId
     *
     * @mbg.generated
     */
    public void setCityid(String cityid) {
        this.cityid = cityid == null ? null : cityid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column city.provinceId
     *
     * @return the value of city.provinceId
     *
     * @mbg.generated
     */
    public String getProvinceid() {
        return provinceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column city.provinceId
     *
     * @param provinceid the value for city.provinceId
     *
     * @mbg.generated
     */
    public void setProvinceid(String provinceid) {
        this.provinceid = provinceid == null ? null : provinceid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column city.cityName
     *
     * @return the value of city.cityName
     *
     * @mbg.generated
     */
    public String getCityname() {
        return cityname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column city.cityName
     *
     * @param cityname the value for city.cityName
     *
     * @mbg.generated
     */
    public void setCityname(String cityname) {
        this.cityname = cityname == null ? null : cityname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column city.provinceName
     *
     * @return the value of city.provinceName
     *
     * @mbg.generated
     */
    public String getProvincename() {
        return provincename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column city.provinceName
     *
     * @param provincename the value for city.provinceName
     *
     * @mbg.generated
     */
    public void setProvincename(String provincename) {
        this.provincename = provincename == null ? null : provincename.trim();
    }
}