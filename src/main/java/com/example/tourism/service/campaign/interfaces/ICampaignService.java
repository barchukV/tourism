package com.example.tourism.service.campaign.interfaces;

import com.example.tourism.model.Amateur;
import com.example.tourism.model.Campaign;

import java.util.List;

public interface ICampaignService {
    Campaign getById(String id);
    Campaign create(Campaign campaign);
    Campaign update(Campaign campaign);
    Campaign delete(String id);
    List<Campaign> getAll();
}
