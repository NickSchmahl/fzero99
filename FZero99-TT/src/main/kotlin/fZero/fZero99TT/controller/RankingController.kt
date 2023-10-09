package fZero.fZero99TT.controller

import fZero.fZero99TT.applicationService.RankingApplicationService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/rankings")
class RankingController(
    private val rankingApplicationService: RankingApplicationService
) {
    @GetMapping
    fun getRanking(model: Model): String {
        model.addAttribute("runsForRanking", rankingApplicationService.getAllTimes())
        return "ranking"
    }
}