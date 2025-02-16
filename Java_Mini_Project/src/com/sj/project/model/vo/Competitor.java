package com.sj.project.model.vo;

import com.sj.project.model.vo.Player.CompetitionType;

public interface Competitor {
	public abstract void joinCompetition(CompetitionType competitionType, CompetitionManager competitionManager);
}