package com.hfp.hfp_back.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Organization")
public class Organization {
    @Id
    @SequenceGenerator(name = "organization_seq", sequenceName = "organization_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "organization_seq")
    private Long id;

    @Column(name = "nameOrg")
    private String nameOrg;
}
