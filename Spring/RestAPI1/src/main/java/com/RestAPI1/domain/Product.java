package com.RestAPI1.domain;

public class Product {

    private Integer id;
    private String nomre;
    private Double precio;
    private Integer stok;


    public Product(Double precio, String nomre, Integer id, Integer stok) {
        this.precio = precio;
        this.nomre = nomre;
        this.id = id;
        this.stok = stok;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomre() {
        return nomre;
    }

    public void setNomre(String nomre) {
        this.nomre = nomre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getStok() {
        return stok;
    }

    public void setStok(Integer stok) {
        this.stok = stok;
    }
}
