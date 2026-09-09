package com.sampleWebsite.creditcost;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CreditCostService {
    private final CreditCostRepository creditCostRepository;

    public CreditCostService(CreditCostRepository creditCostRepository) {
        this.creditCostRepository = creditCostRepository;
    }

    public CreditCostModel saveCreditCost(CreditCostModel creditCost) {
        return creditCostRepository.save(creditCost);
    }

    public List<CreditCostModel> getCreditCost() {
        return creditCostRepository.findAll();
    }


    public void clearData() {
        creditCostRepository.deleteAllInBatch();
    }
}
