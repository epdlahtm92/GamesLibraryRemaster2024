package com.weblib.gameslib.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.weblib.gameslib.domain.GameDomain;
import com.weblib.gameslib.repository.Repository.GameRepository;

@Repository
public class GameRepositoryImpl implements GameRepository {

  private List<GameDomain> gameDomainList = new ArrayList<GameDomain>();

  public GameRepositoryImpl() {
    GameDomain testGameDomain = new GameDomain();
    testGameDomain.setGameId(0);
    testGameDomain.setGameTitle("testTitle");
    testGameDomain.setGameDeveloper("testDeveloper");
    testGameDomain.setGameDeveloperCountry("testDevelCountry");
    
  }

  @Override
  public List<GameDomain> getGameList() {
    List<GameDomain> testGameList = new ArrayList<GameDomain>();
    
    
    return testGameList;
  }
  

}
