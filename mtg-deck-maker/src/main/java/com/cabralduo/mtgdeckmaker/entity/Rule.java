package com.cabralduo.mtgdeckmaker.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Rule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonProperty("oracle_id")
    private String oracleId;

    @JsonProperty("comment")
    @Column(name = "rule", columnDefinition ="TEXT")
    private String rule;
}
