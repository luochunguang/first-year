package com.leyou.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
@Entity
@Data
@Table(name = "customer")
public class Customer {
    private Integer cust_id;
    private String cust_name;
    private Integer cust_user_id;
    private Integer cust_create_id;
    private String cust_source;
    private String cust_industry;
    private String cust_level;
    private String cust_linkman;
    private String cust_phone;
    private String cust_mobile;
    private String cust_zipcode;
    private String cust_address;
    private Date cust_createtime;

}
