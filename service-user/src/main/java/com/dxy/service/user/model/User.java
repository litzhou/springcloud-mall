package com.dxy.service.user.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


/**
 * @author zhougaojun
 * @since 2018/09/27
 **/
@Getter
@Setter
@Entity
@Table(name = "tb_user")
public class User implements Serializable {

    private static final long serialVersionUID = 5903998208891703586L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(updatable = false)
    private Date createTime;
    private Date modifyTime;

    private String userName;
    private String password;
    private Date birth;
    private int sex;
    private int status;
    private String remark;
    private String nickName;


}

 