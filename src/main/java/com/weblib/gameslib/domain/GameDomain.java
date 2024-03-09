package com.weblib.gameslib.domain;

import org.springframework.web.multipart.MultipartFile;

public class GameDomain {
  
  private int gameId;
  private String gameTitle;
  private String gameDeveloper;
  private String gameDeveloperCountry;
  private String gamePublisher;
  private String gamePublisherCountry;
  private String gameSeriesName;
  private int gameSeriesNumber;
  private String gameGenre;
  private int gamePrice;
  private String gamePriceToString;
  private String gameReleaseDate;
  private String gameDescription;
  private String[] gamePlatform;
  private String gameImagePath;
  private MultipartFile gameImageFile;

  public int getGameId() {
    return this.gameId;
  }

  public void setGameId(int gameId) {
    this.gameId = gameId;
  }

  public String getGameTitle() {
    return this.gameTitle;
  }

  public void setGameTitle(String gameTitle) {
    this.gameTitle = gameTitle;
  }

  public String getGameDeveloper() {
    return this.gameDeveloper;
  }

  public void setGameDeveloper(String gameDeveloper) {
    this.gameDeveloper = gameDeveloper;
  }

  public String getGameDeveloperCountry() {
    return this.gameDeveloperCountry;
  }

  public void setGameDeveloperCountry(String gameDeveloperCountry) {
    this.gameDeveloperCountry = gameDeveloperCountry;
  }

  public String getGamePublisher() {
    return this.gamePublisher;
  }

  public void setGamePublisher(String gamePublisher) {
    this.gamePublisher = gamePublisher;
  }

  public String getGamePublisherCountry() {
    return this.gamePublisherCountry;
  }

  public void setGamePublisherCountry(String gamePublisherCountry) {
    this.gamePublisherCountry = gamePublisherCountry;
  }

  public String getGameSeriesName() {
    return this.gameSeriesName;
  }

  public void setGameSeriesName(String gameSeriesName) {
    this.gameSeriesName = gameSeriesName;
  }

  public int getGameSeriesNumber() {
    return this.gameSeriesNumber;
  }

  public void setGameSeriesNumber(int gameSeriesNumber) {
    this.gameSeriesNumber = gameSeriesNumber;
  }

  public String getGameGenre() {
    return this.gameGenre;
  }

  public void setGameGenre(String gameGenre) {
    this.gameGenre = gameGenre;
  }

  public int getGamePrice() {
    return this.gamePrice;
  }

  public void setGamePrice(int gamePrice) {
    this.gamePrice = gamePrice;
  }

  public String getGamePriceToString() {
    return this.gamePriceToString;
  }

  public void setGamePriceToString(String gamePriceToString) {
    this.gamePriceToString = gamePriceToString;
  }

  public String getGameReleaseDate() {
    return this.gameReleaseDate;
  }

  public void setGameReleaseDate(String gameReleaseDate) {
    this.gameReleaseDate = gameReleaseDate;
  }

  public String getGameDescription() {
    return this.gameDescription;
  }

  public void setGameDescription(String gameDescription) {
    this.gameDescription = gameDescription;
  }

  public String[] getGamePlatform() {
    return this.gamePlatform;
  }

  public void setGamePlatform(String[] gamePlatform) {
    this.gamePlatform = gamePlatform;
  }

  public String getGameImagePath() {
    return this.gameImagePath;
  }

  public void setGameImagePath(String gameImagePath) {
    this.gameImagePath = gameImagePath;
  }

  public MultipartFile getGameImageFile() {
    return this.gameImageFile;
  }

  public void setGameImageFile(MultipartFile gameImageFile) {
    this.gameImageFile = gameImageFile;
  }
    
}
