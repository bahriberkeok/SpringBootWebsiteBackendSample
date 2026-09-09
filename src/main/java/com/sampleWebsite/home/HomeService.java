package com.sampleWebsite.home;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeService {

    private final HomeRepository homeRepository;

    public HomeService(HomeRepository homeRepository) {
        this.homeRepository = homeRepository;
    }

    public HomeModel saveHome(HomeModel home) {
        return homeRepository.save(home);
    }

    public List<HomeModel> getHome() {
        return homeRepository.findAll();
    }


    public void clearData() {
        homeRepository.deleteAllInBatch();
    }


}
