package com.gogiocharo.ocharo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="cards")
public class Card {
    @Id
    @Column(name = "card_id")
    private Long id;
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "alias")
    private String alias;
    @JoinColumn(name = "account_id" , referencedColumnName = "account_id", nullable = false)
    @OneToOne
    private Account accountId;
    @Column(name = "card_type")
    private String cardType;

}
