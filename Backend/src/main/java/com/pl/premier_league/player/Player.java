package com.pl.premier_league.player;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="player_data")
public class Player {
    @Id
    @Column(name = "player_name", unique = true)
    private String name;
    private String nation;
    private String position;
    private Integer age;
    private Integer matches_played;
    private Integer starts;
    private Double minutes_played;
    private Double goals;
    private Double assists;
    private Double penalties_scored;
    private Double yellow_cards;
    private Double red_cards;
    private Double expected_goals;
    private Double expected_assists;
    private String team_name;

    public Player() {
    }

    public Player(String name, String nation, String pos, Integer age, Integer mp, Integer starts, Double min, Double gls, Double ast, Double pk, Double crdy, Double crdr, Double xg, Double xag, String team) {
        this.name = name;
        this.nation = nation;
        this.position = pos;
        this.age = age;
        this.matches_played = mp;
        this.starts = starts;
        this.minutes_played = min;
        this.goals = gls;
        this.assists = ast;
        this.penalties_scored = pk;
        this.yellow_cards = crdy;
        this.red_cards = crdr;
        this.expected_goals = xg;
        this.expected_assists = xag;
        this.team_name = team;
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getPos() {
        return position;
    }

    public void setPos(String pos) {
        this.position = pos;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getMp() {
        return matches_played;
    }

    public void setMp(Integer mp) {
        this.matches_played = mp;
    }

    public Integer getStarts() {
        return starts;
    }

    public void setStarts(Integer starts) {
        this.starts = starts;
    }

    public Double getMin() {
        return minutes_played;
    }

    public void setMin(Double min) {
        this.minutes_played = min;
    }

    public Double getGls() {
        return goals;
    }

    public void setGls(Double gls) {
        this.goals = gls;
    }

    public Double getAst() {
        return assists;
    }

    public void setAst(Double ast) {
        this.assists = ast;
    }

    public Double getPk() {
        return penalties_scored;
    }

    public void setPk(Double pk) {
        this.penalties_scored = pk;
    }

    public Double getCrdy() {
        return yellow_cards;
    }

    public void setCrdy(Double crdy) {
        this.yellow_cards = crdy;
    }

    public Double getCrdr() {
        return red_cards;
    }

    public void setCrdr(Double crdr) {
        this.red_cards = crdr;
    }

    public Double getXg() {
        return expected_goals;
    }

    public void setXg(Double xg) {
        this.expected_goals = xg;
    }

    public Double getXag() {
        return expected_assists;
    }

    public void setXag(Double xag) {
        this.expected_assists = xag;
    }

    public String getTeam() {
        return team_name;
    }

    public void setTeam(String team) {
        this.team_name = team;
    }
}
