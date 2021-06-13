package com.example.springreact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

import java.awt.event.PaintEvent;
import java.util.ArrayList;


@CrossOrigin(origins = {"http://localhost:8080/index.html"})
@RestController
public class UserController {
//    private final UserService userService;

    public UserController() {
    }

    @RequestMapping(value="/allTheTeams", method=RequestMethod.GET)
    public ArrayList<Object> allTheTeams(@RequestBody PremierLeagueManager premierLeagueManager) throws Exception {
        System.out.println();
        System.out.println(premierLeagueManager.arrayList1().toArray());
        return premierLeagueManager.arrayList1();
    }



//    @Autowired
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }

//    @RequestMapping(value="/encodedString", method= RequestMethod.POST)
//    public void getEncodedString(@RequestBody ) throws Exception {
//        encodeImage = image.getImage();
//        System.out.println("getEncodedString() - "+encodeImage);
//        //decoder();
//    }

//    //@Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//        registry.addViewController("/").setViewName("forward:/index.html");
//    }


}
