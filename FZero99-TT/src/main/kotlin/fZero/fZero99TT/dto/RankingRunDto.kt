package fZero.fZero99TT.dto

import fZero.fZero99TT.game.FZeroTrack
import fZero.fZero99TT.game.TimeTrialRun

data class RankingRunDto(
    val track: FZeroTrack,
    val totalTime: Double,
    val round1: Double,
    val round2: Double,
    val round3: Double,
    val round4: Double,
) {
    fun of(run: TimeTrialRun): RankingRunDto {
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