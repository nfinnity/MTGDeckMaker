package com.cabralduo.mtgdeckmaker.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
public class Legality implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String standard;

    private String future;

    private String frontier;

    private String modern;

    private String legacy;

    private String pauper;

    private String vintage;

    private String penny;

    private String commander;

    private String duel;

    private String oldschool;
}
