package com.example.demo090.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //为类提供写属性提供equal、hashcode、tostring方法
@AllArgsConstructor //全部参数的构造函数自动生成
@NoArgsConstructor //无参构造函数
public class User {
    private long id;

    private String username;

    private String password;

    private String telephonenum;
}
