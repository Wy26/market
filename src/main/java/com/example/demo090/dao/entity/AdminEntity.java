package com.example.demo090.dao.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * 管理员实体类类
 */
@Entity
@Data
@Table(name = "admin")
public class AdminEntity {
    @Id //声明一个实体类的属性映射为数据库的主键列。
    @GeneratedValue(strategy= GenerationType.AUTO) //主键由程序控制
    private Long id;
    @Column
    private String username;
    @Column
    private String password;
}
