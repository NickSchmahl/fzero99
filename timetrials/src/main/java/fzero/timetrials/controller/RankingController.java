package fzero.timetrials.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("rankings")
public class RankingController {
    @GetMapping("")
    public String getRankings() {
        return "ranking";
    }
}
