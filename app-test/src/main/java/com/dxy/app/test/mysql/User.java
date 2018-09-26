package com.dxy.app.test.mysql;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author zhougaojun
 * @since 2018/09/25
 **/
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_user")
public class User implements Serializable {
    private static final long serialVersionUID = 5395614574290868073L;

    @Id
    @GeneratedValue
    private Long id;
    private String name;
}

 