package com.ia.server;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;
@Entity
public class user {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

}
