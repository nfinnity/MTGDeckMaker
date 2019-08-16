package com.cabralduo.mtgdeckmaker.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
public class Image implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String small;

    private String normal;

    private String large;

    private String png;

    private String art_crop;

    private String border_crop;
}
