package fZero.fZero99TT.dto

import fZero.fZero99TT.game.FZeroGlider
import fZero.fZero99TT.game.FZeroTrack

data class RankingRunDto(
    val track: FZeroTrack,
    val totalTime: Double,
    val glider: FZeroGlider,
    val round1: Double,
    val round2: Double,
    val round3: Double,
    val round4: Double,
) {
}