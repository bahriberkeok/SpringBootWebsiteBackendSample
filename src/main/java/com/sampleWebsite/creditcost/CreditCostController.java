package com.sampleWebsite.creditcost;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/credit")
public class CreditCostController {
    private final CreditCostService creditCostService;

    CreditCostController (CreditCostService creditCostService) {
        this.creditCostService = creditCostService;
    }

    @GetMapping("/cost")
    public List<CreditCostModel> getCost() {
        try {
            return creditCostService.getCreditCost();
        } catch (RuntimeException e) {
            log.error("e: ");
            return null;
        }

    }

    @PostMapping("/admin/newcost")
    public CreditCostModel setCost(@RequestBody CreditCostModel cost) {
        creditCostService.clearData();
        return creditCostService.saveCreditCost(cost);
    }
}
