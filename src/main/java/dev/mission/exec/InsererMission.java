package dev.mission.exec;

import java.math.BigDecimal;
import java.time.LocalDate;
import org.springframework.stereotype.Controller;
import dev.mission.entite.Mission;
import dev.mission.repository.MissionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;

@Controller
@Profile("default")
public class InsererMission implements CommandLineRunner {
	
	private MissionRepository missionRepository;
	
	public InsererMission(MissionRepository missionRepository) {
		super();
		this.missionRepository = missionRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		Mission mission = new Mission();
		mission.setLibelle("Mission 2");
		mission.setTauxJournalier(new BigDecimal("200.3"));
		mission.setDateDebut(LocalDate.of(2022, 2, 2));
		mission.setDateFin(LocalDate.of(2022, 5, 3));
		
		this.missionRepository.save(mission);
	}
}