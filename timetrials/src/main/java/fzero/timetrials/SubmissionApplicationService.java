package fzero.timetrials;

import fzero.timetrials.dto.SubmissionDto;
import fzero.timetrials.game.TimeTrialRun;
import fzero.timetrials.repository.TimetrialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubmissionApplicationService {
    @Autowired
    private TimetrialRepository timetrialRepository;

    public void saveRun(SubmissionDto submissionDto) {
        TimeTrialRun timeTrialRun = new TimeTrialRun();
        timeTrialRun.setMap(submissionDto.getMap());
        timeTrialRun.setTotalTime(submissionDto.getTotalTime());
        timeTrialRun.setRound1(submissionDto.getRound1());
        timeTrialRun.setRound2(submissionDto.getRound2());
        timeTrialRun.setRound3(submissionDto.getRound3());
        timeTrialRun.setRound4(submissionDto.getRound4());

        timetrialRepository.save(timeTrialRun);
    }
}
