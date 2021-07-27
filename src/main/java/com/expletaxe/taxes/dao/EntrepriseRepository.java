package com.expletaxe.taxes.dao;

import com.expletaxe.taxes.model.Entreprise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntrepriseRepository extends JpaRepository<Entreprise,Long> {
}
