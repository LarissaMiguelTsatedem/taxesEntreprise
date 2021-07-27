package com.expletaxe.taxes.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.Date;
@Entity
@DiscriminatorValue("RI")
public class IR extends Taxe{
    public IR() {
        super();
    }

    public IR(String titre, Date dateTaxe, double montant, Entreprise entreprise) {
        super(titre, dateTaxe, montant, entreprise);
    }
}
