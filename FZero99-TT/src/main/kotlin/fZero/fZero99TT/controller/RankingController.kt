package fZero.fZero99TT.controller

import fZero.fZero99TT.applicationService.RankingApplicationService
import fZero.fZero99TT.dto.ChooseRankingDto
import fZero.fZero99TT.game.FZeroTrack
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
@RequestMapping("/rankings")
class RankingController(
    private val rankingApplicationService: RankingApplicationService
) {
    @GetMapping
    fun getRanking(@RequestParam track: FZeroTrack?, model: Model): String {
        model.addAttribute("runsForRanking", rankingApplicationService.getAllTimesForTrack(track))
        model.addAttribute("chooseRankingDto", ChooseRankingDto(track ?: FZeroTrack.MUTE_CITY_1))
        model.addAttribute("trackChoices", FZeroTrack.values())
        return "ranking"
    }
}