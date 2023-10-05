package fzero.timetrials.controller;

import fzero.timetrials.SubmissionApplicationService;
import fzero.timetrials.dto.SubmissionDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/submission")
public class SubmissionController {
    @Autowired
    private SubmissionApplicationService submissionApplicationService;

    @GetMapping("")
    public String getSubmitPage(Model model) {
        model.addAttribute("submissionDto", new SubmissionDto());
        return "submission";
    }

    @PostMapping("/new")
    public String submitTime(@ModelAttribute("submissionDto") SubmissionDto submissionDto) {
        submissionApplicationService.saveRun(submissionDto);
        return "redirect:/submission";
    }
}
