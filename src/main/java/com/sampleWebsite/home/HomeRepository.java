package com.sampleWebsite.home;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HomeRepository extends JpaRepository<HomeModel, Long> {

}
