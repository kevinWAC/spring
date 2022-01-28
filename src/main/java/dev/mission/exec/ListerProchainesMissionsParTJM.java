package dev.mission.exec;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;

import dev.mission.entite.Mission;
import dev.mission.repository.MissionRepository;

@Controller
@Profile("insert")
public class ListerProchainesMissionsParTJM implements CommandLineRunner {
	private MissionRepository missionRepository;

	public ListerProchainesMissionsParTJM(MissionRepository missionRepository) {
		super();
		this.missionRepository = missionRepository;
	}

	public void run(String... args) throws Exception {
			missionRepository.dateAndTaux(LocalDate.now(), new BigDecimal("100.00")).forEach(System.out::println);
		}
}


