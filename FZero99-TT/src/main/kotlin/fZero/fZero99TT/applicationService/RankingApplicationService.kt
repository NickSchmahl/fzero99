package fZero.fZero99TT.applicationService

import fZero.fZero99TT.dto.RankingRunDto
import fZero.fZero99TT.game.FZeroTrack
import fZero.fZero99TT.game.TimeTrialRun
import fZero.fZero99TT.repository.TimetrialRepository
import org.springframework.data.domain.Sort
import org.springframework.stereotype.Service

@Service
class RankingApplicationService(
    private val timetrialRepository: TimetrialRepository
) {
    fun getAllTimes(): List<RankingRunDto> {
        val runs: List<TimeTrialRun> = timetrialRepository.findAll(Sort.by(Sort.Direction.ASC, "totalTime"))
        return dbRunsToDtoRuns(runs)
    }

    fun getAllTimesForTrack(track: FZeroTrack?): List<RankingRunDto> {
        if (track == null) {
            return getAllTimes()
        }
        val runs: List<TimeTrialRun> = timetrialRepository.findByTrackOrderByTotalTimeAsc(track)
        return dbRunsToDtoRuns(runs)
    }

    private fun dbRunsToDtoRuns(runs: List<TimeTrialRun>): List<RankingRunDto> {
        val returnRuns: ArrayList<RankingRunDto> = ArrayList()
        for (run in runs) {
            returnRuns.add(
                RankingRunDto(
                    track = run.track,
                    totalTime = run.totalTime,
                    round1 = run.round1,
                    round2 = run.round2,
                    round3 = run.round3,
                    round4 = run.round4,
                )
            )
        }

        return returnRuns
    }
}
