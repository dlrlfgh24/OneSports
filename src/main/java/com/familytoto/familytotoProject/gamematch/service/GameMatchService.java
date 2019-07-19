package com.familytoto.familytotoProject.gamematch.service;


import java.util.List;

import com.familytoto.familytotoProject.gamematch.entitiy.MatchEntity;

public interface GameMatchService {
	public List<MatchEntity> getRecentGamesMatch(String toDate, String fromDate);
}
