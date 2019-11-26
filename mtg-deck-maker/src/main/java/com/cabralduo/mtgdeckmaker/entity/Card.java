package com.cabralduo.mtgdeckmaker.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Card implements Serializable {

    @Id
    @SerializedName("oracle_id")
    private String oracleId;

    private String name;

    @SerializedName("mana_cost")
    private String manaCost;

    private Double cmc;

    @SerializedName("type_line")
    @Column(name="type")
    private String typeLine;

    @SerializedName("rulings_uri")
    @Transient
    private String rulingsUri;

//    private ColorIdentity colorIdentity;

    @SerializedName("oracle_text")
    @Column(name="description", columnDefinition="TEXT")
    private String description;

    @SerializedName("legalities")
    @OneToOne(cascade = CascadeType.ALL)
    private Legality legality;

    @SerializedName("image_uris")
    @OneToOne(cascade = CascadeType.ALL)
    private Image image;

    @JsonProperty("data")
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "rule_id", referencedColumnName = "oracleId")
    protected List<Rule> rules;
}