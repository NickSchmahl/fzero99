package fZero.fZero99TT.controller

import fZero.fZero99TT.applicationService.SubmissionApplicationService
import fZero.fZero99TT.dto.SubmissionDto
import fZero.fZero99TT.game.FZeroGlider
import fZero.fZero99TT.game.FZeroTrack
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/submission")
class SubmissionController(
        private val submissionApplicationService: SubmissionApplicationService,
) {
    @GetMapping("")
    fun getSubmitPage(model: Model): String {
        model.addAttribute("submissionDto", SubmissionDto())
        model.addAttribute("trackChoices", FZeroTrack.values())
        model.addAttribute("gliderChoices", FZeroGlider.values())
        return "submission"
    }

    @PostMapping("/new")
    fun submitTime(@ModelAttribute("submissionDto") submissionDto: SubmissionDto): String {
        submissionApplicationService.saveRun(submissionDto)
        return "redirect:/submission"
    }
}
