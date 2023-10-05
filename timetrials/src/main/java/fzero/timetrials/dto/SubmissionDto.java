package fzero.timetrials.dto;

public class SubmissionDto {

    private String map;
    private double totalTime;
    private double round1;
    private double round2;
    private double round3;
    private double round4;

    public String getMap() {
        return map;
    }

    public void setMap(String map) {
        this.map = map;
    }

    public double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }

    public double getRound1() {
        return round1;
    }

    public void setRound1(double round1) {
        this.round1 = round1;
    }

    public double getRound2() {
        return round2;
    }

    public void setRound2(double round2) {
        this.round2 = round2;
    }

    public double getRound3() {
        return round3;
    }

    public void setRound3(double round3) {
        this.round3 = round3;
    }

    public double getRound4() {
        return round4;
    }

    public void setRound4(double round4) {
        this.round4 = round4;
    }
}
