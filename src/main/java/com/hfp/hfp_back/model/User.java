package com.hfp.hfp_back.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "UserRus")
public class User {
    @Id
    @SequenceGenerator(name = "user_seq", sequenceName = "user_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq")
    private Long id;

    @Column(name = "full_name")
    private String fullName;

    @ManyToOne()
    @JoinColumn(name = "organization_id",  updatable = false, insertable = false)
    private Organization organization;

    @Column(name = "organization_id")
    private Long  organizationId;

    @Column(name = "mail")
    private String mail;

    @Column(name = "password")
    private String password;

    @Column(name = "telephone")
    private String telephone;

    @Column(name = "access")
    private String access;

}
