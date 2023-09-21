package hu.progmatic.rockpaperscissors.controller;

import hu.progmatic.rockpaperscissors.service.GameService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GameController {
    private final GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }
   @GetMapping({"/home"})
    public String getHome(Model model){
       model.addAttribute("game",gameService.getGame);
       return "home";
   }

@PostMapping("/gameResult")
    public String getChoice(String choice){
       gameService.
}













}
