package com.gogiocharo.ocharo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "accounts")
public class Account {

    @Id
    @Column(name = "account_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "iban")
    private String iban;
    @Column(name = "bic_swift")
    private String bicSwift;
    @Column(name = "client_id")
    private String clientId;

}