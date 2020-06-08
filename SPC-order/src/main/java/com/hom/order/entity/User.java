package com.hom.order.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by Hom_Wang on 2020-06-08.
 */
@Entity
@Data
@Table(name = "User")
public class User {
    private static final long serialVersionUID = -3301605591108950415L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String username;
    private String password;
    private String role;
    private String wxOpenId;

}
}
