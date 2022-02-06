package com.hfp.hfp_back.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "Request")
public class Request {

    @Id
    @SequenceGenerator(name = "request_seq", sequenceName = "request_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "request_seq")
    private Long id;

    @ManyToOne()
    @JoinColumn(name = "user_id",  updatable = false, insertable = false)
    private User user;
    @Column(name = "user_id")
    private Long  userId;


    @Column(name = "nameReq")
    private String nameReq;

    @Column(name = "dataReq")
    private Date dataReq;

    @Column(name = "timeReq")
    private Time timeReq;

    @Column(name = "room")
    private String room;

    @Column(name = "numTables")
    private Integer numTables;
    @Column(name = "numChairs")
    private Integer numChairs;
    @Column(name = "numMicrophones")
    private Integer numMicrophones;
    @Column(name = "numStands")
    private Integer numStands;

    @Column(name = "mixing")
    private Boolean mixing;
    @Column(name = "projector")
    private Boolean projector;
    @Column(name = "screen")
    private Boolean screen;
    @Column(name = "laptop")
    private Boolean laptop;

    @Column(name = "commentary")
    private String commentary;

}
