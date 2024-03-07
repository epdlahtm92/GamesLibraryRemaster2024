package com.weblib.gameslib.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
public class GameLibraryController {
  
  // All GameList
  @GetMapping("/gameList")
  public String getGameList(Model model) {
      return "gameList.html";
  }
  
  // One Game Detail
  @GetMapping("/gameDetail")
  public String getGameDetail() {
      return "gameDetail.html";
  }
  
  // Search by Title
  @GetMapping("/title")
  public String getGameByTitle() {
      return "gameList.html";
  }
  
  // Add Game
  @GetMapping("/gameAdd")
  public String getGameAddForm() {
      return "gameAdd.html";
  }

  @GetMapping("/gameAdd")
  public String submitGameAdd() {
      return "gameDetail.html";
  }
  
  // Update Game
  @GetMapping("/gameUpdate")
  public String getGameUpdateForm() {
      return "gameUpdate.html";
  }

  @GetMapping("/gameUpdate")
  public String submitGameUpdate() {
      return "gameDetail.html";
  }
  // Delete Game
  @GetMapping("/gameDelete")
  public String getGameDelete() {
      return "redirect:/gameList";
  }
  
}
