package com.demo.user.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zlb
 * @since 4/21/22 6:37 PM
 */
@Data
public class User implements Serializable {
    
    /**
     * 姓名
     */
    private String name;
    
    /**
     * 年龄
     */
    private int age;
}
