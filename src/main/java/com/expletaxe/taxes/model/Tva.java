package com.expletaxe.taxes.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.Date;
@Entity
@DiscriminatorValue("TVA")
public class Tva extends Taxe{
    public Tva() {
        super();
    }

    public Tva(String titre, Date dateTaxe, double montant, Entreprise entreprise) {
        super(titre, dateTaxe, montant, entreprise);
    }
}
