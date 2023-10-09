package fZero.fZero99TT.applicationService

import fZero.fZero99TT.dto.RankingRunDto
import fZero.fZero99TT.game.TimeTrialRun
import fZero.fZero99TT.repository.TimetrialRepository
import org.springframework.stereotype.Service

@Service
class RankingApplicationService(
    private val timetrialRepository: TimetrialRepository
) {
    fun getAllTimes(): List<RankingRunDto> {
        val runs: List<TimeTrialRun> = timetrialRepository.findAll()
        val returnRuns: ArrayList<RankingRunDto> = ArrayList()
        for (run in runs) {
            returnRuns.add(dbRunToDtoRun(run))
        }

        return returnRuns
    }

    private fun dbRunToDtoRun(run: TimeTrialRun): RankingRunDto {
        return RankingRunDto(
            track = run.track,
            totalTime = run.totalTime,
            round1 = run.round1,
            round2 = run.round2,
            round3 = run.round3,
            round4 = run.round4,
        )
    }
}
