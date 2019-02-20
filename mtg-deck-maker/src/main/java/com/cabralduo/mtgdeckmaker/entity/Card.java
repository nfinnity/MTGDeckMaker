package com.cabralduo.mtgdeckmaker.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Card {

    @JsonProperty("id")
    private String id;

    @JsonProperty("oracle_id")
    private String oracleId;

    @JsonProperty("name")
    private String name;

    @JsonProperty("uri")
    private String uri;

    @JsonProperty("scryfall_uri")
    private String scryfallUri;

    @JsonProperty("image_uris")
    private Image imageUris;

}

@JsonIgnoreProperties(ignoreUnknown = true)
class Image {

    @JsonProperty("small")
    private String small;

    @JsonProperty("normal")
    private String normal;

    @JsonProperty("large")
    private String large;

    @JsonProperty("png")
    private String png;

    @JsonProperty("art_crop")
    private String artCrop;

    @JsonProperty("border_crop")
    private String borderCrop;
}
