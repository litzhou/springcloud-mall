package com.dxy.service.user.model;

import com.dxy.core.model.BaseModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;


/**
 * @author zhougaojun
 * @since 2018/09/27
 **/
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tb_user")
public class User extends BaseModel implements Serializable {

    private static final long serialVersionUID = 592195447373689232L;

    private String userName;
    private String password;
    private Date birth;
    private int sex;
    private int status;
    private String remark;
    private String nickName;


}

 