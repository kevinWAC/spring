package dev.mission.repository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import dev.mission.entite.Mission;

public interface MissionRepository extends JpaRepository<Mission, Integer> {
	List<Mission> findByDateDebutGreaterThanEqual(LocalDate dateDebut);
	@Query("select m from Mission m where m.dateDebut >= ?1 and m.tauxJournalier >= ?2")
	List<Mission> dateAndTaux(LocalDate dateDebut, BigDecimal tauxJournalier);
}
	
