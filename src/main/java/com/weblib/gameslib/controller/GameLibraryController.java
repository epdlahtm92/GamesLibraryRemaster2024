package com.weblib.gameslib.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class GameLibraryController {
  
  // All GameList
  @GetMapping("/gameList")
  public String getGameList(Model model) {
      return "gameList";
  }
  
  // One Game Detail
  @GetMapping("/gameDetail")
  public String getGameDetail() {
      return "gameDetail";
  }
  
  // Search by Title
  @GetMapping("/title")
  public String getGameByTitle() {
      return "gameList";
  }
  
  // Add Game
  @GetMapping("/gameAdd")
  public String getGameAddForm() {
      return "gameAdd";
  }

  @PostMapping("/gameAdd")
  public String submitGameAdd() {
      return "gameDetail";
  }
  
  // Update Game
  @GetMapping("/gameUpdate")
  public String getGameUpdateForm() {
      return "gameUpdate";
  }

  @PostMapping("/gameUpdate")
  public String submitGameUpdate() {
      return "gameDetail";
  }
  // Delete Game
  @GetMapping("/gameDelete")
  public String getGameDelete() {
      return "redirect:/gameList";
  }
  
}
