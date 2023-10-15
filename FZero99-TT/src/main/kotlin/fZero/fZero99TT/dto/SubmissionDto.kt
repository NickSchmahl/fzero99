package fZero.fZero99TT.dto

import fZero.fZero99TT.game.FZeroGlider
import fZero.fZero99TT.game.FZeroTrack

data class SubmissionDto(
        val track: FZeroTrack = FZeroTrack.MUTE_CITY_1,
        val glider: FZeroGlider = FZeroGlider.BLUE_FALCON,
        val totalTime: Double = 0.0,
        val round1: Double = 0.0,
        val round2: Double = 0.0,
        val round3: Double = 0.0,
        val round4: Double = 0.0,
)
