package fZero.fZero99TT.repository

import fZero.fZero99TT.game.FZeroTrack
import fZero.fZero99TT.game.TimeTrialRun
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TimetrialRepository : JpaRepository<TimeTrialRun, Long> {
    fun findByTrack(track: FZeroTrack): List<TimeTrialRun>
}
