package com.sampleWebsite.home;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/home")
public class HomeController {

    private final HomeService homeService;

    HomeController (HomeService homeService) {
        this.homeService = homeService;
    }

    @GetMapping("/message")
    public List<HomeModel> getHome() {
        try {
            return homeService.getHome();
        } catch (RuntimeException e) {
            log.error("e: ");
            return null;
        }

    }

    @PostMapping("/admin/newhome")
    public HomeModel setHome(@RequestBody HomeModel home) {
        homeService.clearData();
        return homeService.saveHome(home);
    }
}
