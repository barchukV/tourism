package com.example.tourism.service.campaign.impls;

import com.example.tourism.model.Campaign;
import com.example.tourism.repository.CampaignRepository;
import com.example.tourism.service.campaign.interfaces.ICampaignService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class CampaignServiceImpl implements ICampaignService {
    final CampaignRepository repository;

    public CampaignServiceImpl(CampaignRepository campaignRepository) {
        this.repository = campaignRepository;
    }


    @Override
    public Campaign getById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Campaign create(Campaign campaign) {
        return repository.save(campaign);
    }

    @Override
    public Campaign update(Campaign campaign) {
        return repository.save(campaign);
    }

    @Override
    public Campaign delete(String id) {
        repository.deleteById(id);
        return null;
    }

    @Override
    public List<Campaign> getAll() {
        return repository.findAll();
    }
}
