package com.codecademy.goldmedal.repositories;

import com.codecademy.goldmedal.model.GoldMedal;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GoldMedalRepository extends CrudRepository {
	List<GoldMedal> findByYear();

	List<GoldMedal> findByEvent();

	List<GoldMedal> findByName();

	List<GoldMedal> findByCity();

	List<GoldMedal> findBySeason();
}
