package com.bdqn.pojo;
import java.io.Serializable;

/***
*   酒店表
*/
public class ItripHotel implements Serializable {


    public String getPmin() {
        return pmin;
    }

    public void setPmin(String pmin) {
        this.pmin = pmin;
    }

    public String getTjl() {
        return tjl;
    }

    public void setTjl(String tjl) {
        this.tjl = tjl;
    }

    public String getPj() {
        return pj;
    }

    public void setPj(String pj) {
        this.pj = pj;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private String pmin="暂无数据";
    private String tjl="暂无数据";
    private String pj="暂无数据";
        //主键
        private Long id;
        //酒店名称
        private String hotelName;

        //酒店所在地址
        private String address;

}
