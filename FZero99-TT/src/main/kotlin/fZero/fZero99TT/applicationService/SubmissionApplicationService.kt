package fZero.fZero99TT.applicationService

import fZero.fZero99TT.dto.SubmissionDto
import fZero.fZero99TT.game.TimeTrialRun
import fZero.fZero99TT.repository.TimetrialRepository
import org.springframework.stereotype.Service

@Service
class SubmissionApplicationService(
        private val timetrialRepository: TimetrialRepository,
) {
    fun saveRun(submissionDto: SubmissionDto) {
        timetrialRepository.save(
            TimeTrialRun(
                track = submissionDto.track,
                totalTime = submissionDto.totalTime,
                round1 = submissionDto.round1,
                round2 = submissionDto.round2,
                round3 = submissionDto.round3,
                round4 = submissionDto.round4,
        ))
    }
}
