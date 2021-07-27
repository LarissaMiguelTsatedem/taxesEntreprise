package com.expletaxe.taxes.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
@Entity
public class Entreprise implements Serializable {
    @Id @GeneratedValue
    private  Long code;
    private  String nom;
    private  String email;
    private  String raisonSocial;
    @OneToMany(mappedBy = "entreprise",fetch = FetchType.LAZY)
    private Collection<Taxe> taxes;

    public Entreprise() {
        super();
    }

    public Entreprise(String nom, String email, String raisonSocial) {
        this.nom = nom;
        this.email = email;
        this.raisonSocial = raisonSocial;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRaisonSocial() {
        return raisonSocial;
    }

    public void setRaisonSocial(String raisonSocial) {
        this.raisonSocial = raisonSocial;
    }

    public Collection<Taxe> getTaxes() {
        return taxes;
    }

    public void setTaxes(Collection<Taxe> taxes) {
        this.taxes = taxes;
    }
}
