package com.dxy.core.lib.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author zhougaojun
 * @since 2018/09/25
 **/
@Getter
@Setter
public class BaseModel implements Serializable {
    private static final long serialVersionUID = 1265117754041524677L;

    private Long id;

}

 