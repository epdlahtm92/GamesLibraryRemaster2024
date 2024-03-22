package com.weblib.gameslib.repository;

import java.util.List;

public interface Repository {

  interface GameRepository {
    
    List<gameDomain> getGameList();
    
  }
}
