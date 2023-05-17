package com.example.security_day1.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "Authorities")
@Entity
@Getter
@Setter
public class Authority {
    @Id
    @Column(name = "member_id")
    private String memberId;
    private String authority;

    @MapsId
    @OneToOne
    @JoinColumn(name = "member_id")
    private Member member;

}
