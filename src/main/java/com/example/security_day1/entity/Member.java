package com.example.security_day1.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@Table(name = "Members")
public class Member {
    @Id
    @Column(name = "member_id")
    private String memberId;
    private String name;
    private String pwd;

    @OneToOne(mappedBy = "member" , cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Authority authority;

}
