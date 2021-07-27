package com.expletaxe.taxes.dao;

import com.expletaxe.taxes.model.Taxe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaxeRepository extends JpaRepository<Taxe,Long> {
}
