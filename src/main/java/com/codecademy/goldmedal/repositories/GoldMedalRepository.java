package com.codecademy.goldmedal.repositories;

import com.codecademy.goldmedal.model.GoldMedal;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GoldMedalRepository extends CrudRepository<GoldMedal, Long> {
	List<GoldMedal> findByCountryOrderByYearAsc(String country);
	List<GoldMedal> findByCountryOrderByYearDesc(String country);
	List<GoldMedal> findByCountryOrderBySeasonAsc(String country);
	List<GoldMedal> findByCountryOrderBySeasonDesc(String country);
	List<GoldMedal> findByCountryOrderByCityAsc(String country);
	List<GoldMedal> findByCountryOrderByCityDesc(String country);
	List<GoldMedal> findByCountryOrderByNameAsc(String country);
	List<GoldMedal> findByCountryOrderByNameDesc(String country);
	List<GoldMedal> findByCountryOrderByEventAsc(String countryName);
	List<GoldMedal> findByCountryOrderByEventDesc(String countryName);
	List<GoldMedal> findByCountryAndSeasonOrderByYearAsc(String country, String season);
	int countByCountry(String country);
	long countBySeason(String season);
	int countByCountryAndGender(String country, String gender);
}
