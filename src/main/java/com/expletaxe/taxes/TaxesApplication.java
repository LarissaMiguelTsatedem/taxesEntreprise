package com.expletaxe.taxes;

import com.expletaxe.taxes.dao.EntrepriseRepository;
import com.expletaxe.taxes.dao.TaxeRepository;
import com.expletaxe.taxes.model.Entreprise;
import com.expletaxe.taxes.model.IR;
import com.expletaxe.taxes.model.Taxe;
import com.expletaxe.taxes.model.Tva;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class TaxesApplication implements CommandLineRunner {

	@Autowired
	private EntrepriseRepository entrepriseRepository;
	@Autowired
	private TaxeRepository taxeRepository;
	public static void main(String[] args) {
		SpringApplication.run(TaxesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Entreprise e1 = entrepriseRepository.save(new Entreprise("E1","e1@gmail.com","SARL"));
		Entreprise e2 = entrepriseRepository.save(new Entreprise("E2","e2@gmail.com","SA"));

		taxeRepository.save(new Tva("TVA Logement",new Date(),1000,e1));
		taxeRepository.save(new Tva("TVA Voiture",new Date(),900,e1));
		taxeRepository.save(new IR("IR 2017",new Date(),3000,e1));
		taxeRepository.save(new Tva("TVA Logement",new Date(),400,e2));

	}
}
