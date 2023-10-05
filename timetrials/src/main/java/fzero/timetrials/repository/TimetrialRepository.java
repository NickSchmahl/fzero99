package fzero.timetrials.repository;

import fzero.timetrials.game.TimeTrialRun;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimetrialRepository extends JpaRepository<TimeTrialRun, Long> {

}
