package fZero.fZero99TT.dto

import fZero.fZero99TT.game.FZeroGlider
import fZero.fZero99TT.game.FZeroTrack
import kotlin.time.Duration.Companion.seconds

data class RankingRunDto(
    val track: FZeroTrack,
    val totalTime: Double,
    val glider: FZeroGlider,
    val round1: Double,
    val round2: Double,
    val round3: Double,
    val round4: Double,
) {
    val totalTimeString = this.totalTime.toDurationString()
    val round1String = this.round1.toDurationString()
    val round2String = this.round2.toDurationString()
    val round3String = this.round3.toDurationString()
    val round4String = this.round4.toDurationString()
}

fun Double.toDurationString(): String {
    return this.seconds.toString().replace(".", ",")
}